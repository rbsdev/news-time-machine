package br.com.newstimemachine.news_extractor.repository;

import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.xpath.CachedXPathAPI;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import br.com.newstimemachine.news_extractor.model.News;

/**
 * Implementa as funcionalidades necessárias à um repositório de notícias da ZH
 * 
 * @author Isaias_Alves
 * @version 1.0
 */
public class ZHNewsRepositoryImpl implements NewsRepository {

	protected final String EXTERNAL_SERVICE_URL = "http://www.clicrbs.com.br/zerohora/jsp/redirectNews.jspx?jornal=ZH&id=#id#";

	protected static final CachedXPathAPI XPATH_API = new CachedXPathAPI();

	/**
	 * (non-javadoc)
	 * 
	 * @see NewsRepository#findNewsById
	 */
	public News findNewsById(final Long id) {

		final String urlFromService = buildServiceUrlByNews(id);

		
		News news = null;
		
		try {

			news = new News();
			
			URLConnection con = new URL(urlFromService).openConnection();
			con.connect();
			InputStream is = con.getInputStream();
			final URL redirectedURL = con.getURL();
			final String redirectedURLStr = redirectedURL.toString()+ "?xdebug=xml";

			/** Test */
			con = new URL(redirectedURLStr).openConnection();
			con.connect();
			is = con.getInputStream();

			DocumentBuilderFactory domFact = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = domFact.newDocumentBuilder();
			Document doc = builder.parse(is);
			
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);

			final String prefixNodeRoot = "/article/record";
		
			news.setId(new Long(getNodeValue(doc, prefixNodeRoot+"/id")));
			news.setTitle(getNodeValue(doc, prefixNodeRoot+"/title"));
			news.setImage( getNodeValue(doc, prefixNodeRoot+"/components/record[type='SMALL_PHOTO']/content"));
			news.setDescription(getNodeValue(doc, prefixNodeRoot+"/components/record[type='TEXTO']/content"));
			
			final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			news.setDate(sdf.parse( getNodeValue(doc, prefixNodeRoot+"/datepublished_date") ));

			is.close();

		} catch (Exception e) {
			return null;
		}

		return news;

	}
	
	final CachedXPathAPI cached = new CachedXPathAPI();
	
	private String getNodeValue(Document doc, final String xpath) throws DOMException, TransformerException {
		return cached.selectSingleNode( doc, xpath ).getTextContent();
	}

	/**
	 * Contrói a URL do serviço de matéria através do identificador desta
	 * matéria recebido, obtém a expressão raíz inserindo nela o contexto de
	 * identificador de matéria
	 * 
	 * @param id
	 *            identificador da matéria
	 * @return String contendo a URL de serviço
	 */
	protected String buildServiceUrlByNews(final Long id) {

		final String url = EXTERNAL_SERVICE_URL.replaceAll("#id#", id + "");

		return url;

	}
	
	protected String getXpathNodeValueFromNode( final Node node, final String xpathExpression  ) {
		try {
			return XPATH_API.selectSingleNode(node, xpathExpression).getNodeValue();
		} catch (NullPointerException e) {
			return null;
		} catch (DOMException e) {
			return null;
		} catch (TransformerException e) {
			return null;
		}
	}

}
