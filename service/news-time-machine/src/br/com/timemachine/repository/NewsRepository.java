package br.com.timemachine.repository;

import java.io.File;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import br.com.timmachine.util.IOUtil;

/**
 * Classe com implementação de busca de dados de matérias, esta preparada para efetuar
 * buscas no índice Solr assim como buscas locais.
 * versão 0.2b = Adicionada a utilização de indice
 * @author Isaias_Alves
 * @version hackathon_0.2b
 */
public class NewsRepository {
	
	private final String solrServiceURL = "http://localhost:8983/solr/select?q=*:#criteria#&wt=json";
	protected JSONObject solrJSONResponse = null;

	/**
	 * Efetua a busca de notícias através de critério de busca, caso haja a
	 * sinalização efetua a busca no índice solar consumindo serviço de entrega,
	 * caso seja sinalizado o uso de base local faz chamada local para a geração
	 * da listagem
	 * 
	 * @param criteria
	 *            critério de busca
	 * @param isSolarSource
	 *            indica se é necessária a busca no índice solar.
	 * @return Lista de objetos notícia a ser renderizado
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
	 * Efetua a construção de URL de seriço SOLR através de um criteria
	 * que representa a palavra a ser procurada na base
	 * @param criteria
	 * @return
	 */
	protected String buildSolrServiceURL(final String criteria) {
		return solrServiceURL.replaceAll("#criteria#", criteria);
	}
	
	/**
	 * Dispara a execução de construção de um Response JSON do Solr
	 * @param criteria conteudo a ser localizado e que irá originar o response
	 */
	protected void buildSolrJSONResponse(final String criteria) {
		// Usando consulta genérica no índice lucene*:*, acessando serviço solr construído
		try {
			solrJSONResponse =  (JSONObject) JSONSerializer.toJSON( new IOUtil().getTextFromURL(buildSolrServiceURL(criteria), "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Faz busca de notícias no serviço do solar. Para o correto funcionamento deste serviço é preciso 
	 * garantir que a versão standalone do solr esteja ligada e ocorra a entrega dos dados no formato json

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
	 * Efetua a busca em filesystem. Foi necessária a implementação de busca em FS visando
	 * garantir a funcionalidade da aplicação durante a hackathon.
	 * @param dirStr diretório de busca
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
