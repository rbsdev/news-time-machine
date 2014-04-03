package br.com.timemachine.repository;

import java.io.File;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import br.com.timmachine.util.IOUtil;

/**
 * Classe com implementa��o de busca de dados de mat�rias, esta preparada para efetuar
 * buscas no �ndice Solr assim como buscas locais.
 * vers�o 0.2b = Adicionada a utiliza��o de indice
 * @author Isaias_Alves
 * @version hackathon_0.2b
 */
public class NewsRepository {
	
	private final String solrServiceURL = "http://localhost:8983/solr/select?q=*:#criteria#&wt=json";
	protected JSONObject solrJSONResponse = null;

	/**
	 * Efetua a busca de not�cias atrav�s de crit�rio de busca, caso haja a
	 * sinaliza��o efetua a busca no �ndice solar consumindo servi�o de entrega,
	 * caso seja sinalizado o uso de base local faz chamada local para a gera��o
	 * da listagem
	 * 
	 * @param criteria
	 *            crit�rio de busca
	 * @param isSolarSource
	 *            indica se � necess�ria a busca no �ndice solar.
	 * @return Lista de objetos not�cia a ser renderizado
	 */
	public JSONArray findNews(final String criteria, final boolean isSolarSource) {
		
		JSONArray jsonArray = null;
		
		if (!isSolarSource) {
			jsonArray = buildFilesystemSearch("/solr/data/timemachine/");
		} else {
			
			buildSolrJSONResponse(criteria);
			
			jsonArray = buildSolarResult();
		}
		 
		return jsonArray;
	}
	
	/**
	 * Efetua a constru��o de URL de seri�o SOLR atrav�s de um criteria
	 * que representa a palavra a ser procurada na base
	 * @param criteria
	 * @return
	 */
	protected String buildSolrServiceURL(final String criteria) {
		return solrServiceURL.replaceAll("#criteria#", criteria);
	}
	
	/**
	 * Dispara a execu��o de constru��o de um Response JSON do Solr
	 * @param criteria conteudo a ser localizado e que ir� originar o response
	 */
	protected void buildSolrJSONResponse(final String criteria) {
		// Usando consulta gen�rica no �ndice lucene*:*, acessando servi�o solr constru�do
		try {
			solrJSONResponse =  (JSONObject) JSONSerializer.toJSON( new IOUtil().getTextFromURL(buildSolrServiceURL(criteria), "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Faz busca de not�cias no servi�o do solar. Para o correto funcionamento deste servi�o � preciso 
	 * garantir que a vers�o standalone do solr esteja ligada e ocorra a entrega dos dados no formato json

	 * @return
	 */
	protected JSONArray buildSolarResult() {
		
		// Pega o array de objetos do JSON response e monta no array
		if (solrJSONResponse.get("response")!=null) {
			
			final JSONObject responseField = (JSONObject) solrJSONResponse.get("response");
			
			final JSONArray array = (JSONArray) responseField.get("docs");
			
			return array;
		}
		
		return null;
	}

	/**
	 * Efetua a busca em filesystem. Foi necess�ria a implementa��o de busca em FS visando
	 * garantir a funcionalidade da aplica��o durante a hackathon.
	 * @param dirStr diret�rio de busca
	 * @return Array com registros localizados
	 */
	private JSONArray buildFilesystemSearch(final String dirStr) {

		File dir = new File(dirStr);

		File[] files = dir.listFiles();

		JSONArray jsonArray = new JSONArray();

		for (File file : files) {

			try {
				JSONArray jsonArray2;
				jsonArray2 = (JSONArray) JSONSerializer.toJSON(new IOUtil()
						.getTextFromFile(file.getAbsolutePath(), "UTF-8"));

				for (int i = 0; i < jsonArray2.size(); i++) {
					JSONObject json = (JSONObject) jsonArray2.getJSONObject(i);
					jsonArray.add(json);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return jsonArray;
	}

}
