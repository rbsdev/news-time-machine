package br.com.timemachine.repository;

import static org.junit.Assert.fail;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.junit.Test;

/**
 * Classe contendo as implementa��es de teste
 * do reposit�rio de noticias.
 * @author Isaias_Alves
 * @version hackathon_0.2b
 */
public class NewsRepositoryTest extends NewsRepository {

	/**
	 * Verifica se a URL do �ndice Solr possui uma implementa��o v�lida
	 */
	@Test
	public void aValidURLFromSolrIsMandatory() {
		
		final String criteria = "mySearch";
		
		final String expectedURL = "http://localhost:8983/solr/select?q=*:"+criteria+"&wt=json";
		
		if ( !this.buildSolrServiceURL(criteria).equals(expectedURL) ) {
			fail("A URL de servi�o esta sendo montada de maneira inv�lida, revise a implementa��o do �ndice Solr.");
		}
		
	}
	
	/**
	 * Esse teste � respons�vel por validar se o servi�o Solr � capaz de retornar 
	 * dados v�lidos a partir do �ndice solr. Para isso foi criado um JSON de teste 
	 * representando a entrega do Servi�o Solr standalone, esse JSON � aplicado no 
	 * reposit�rio de not�cias e o retorno da gera��o dos dados � testado.
	 */
	@Test
	public void checkIfAValidSolrJSONResponseBuildsValidArray() {
		
		// Criar� um JSON que representar� um Mock do servi�o Solr
		StringBuilder mockSolrJSON = new StringBuilder();
		
		mockSolrJSON.append("\"{\"responseHeader\":{\"status\":0,\"QTime\":3,\"params\":{\"q\":\"*:*\",\"wt\":\"json\"}},");
		mockSolrJSON.append("\"response\":{\"numFound\":3,\"start\":0,\"docs\":[");
				
				// item test 0
				mockSolrJSON.append("{\"id\":\"change.me\",\"title\":[\"change.me\"],\"_version_\":1463332413960617984},");
				
				// Item test 1
				mockSolrJSON.append("{\"id\":\"4454232\",\"title\":[\"Tr�s dias depois de deixar o hospital, Renato Arag�o volta a ser internado\"],\"url\":\"link\",\"subject\":\"null\",\"comments\":\"link\",\"_version_\":1463335335889993728},");
				
				// Item test 3
				mockSolrJSON.append("{\"id\":\"4454233\",\"title\":[\"Milhares de pessoas se re�nem para comemorar o dia dos Beatles em Porto Alegre\"],\"url\":\"link\",\"subject\":\"null\",\"comments\":\"http://zerohora.rbsdirect.com.br/imagesrc/16311801.jpg.jpg?w=620\",");
				mockSolrJSON.append(" \"last_modified\":\"2014-03-23T00:21:00Z\",\"_version_\":1463335360014581760}]}}\"");
		
				
		this.buildSolrJSONResponse("anyCriteria String..");
		
		this.solrJSONResponse = (JSONObject) JSONSerializer.toJSON(mockSolrJSON.toString());
		
		final JSONArray array = this.buildSolarResult();
		
		if (array == null) {
			fail("FATAL ERROR: A obten��o de dados atrav�s de um mock v�lido n�o retorna uma lista populada.");
		} else {
			for (int i = 0; i < array.size()  ;i++) {
				
				JSONObject jsonToCheck = (JSONObject) array.get(i);
				
				final String id = jsonToCheck.getString("id");
				
				if (!(id!=null && id.trim().length()>0)) {
					fail("CHECK EROR: H� itens inv�lidos no servi�o ou h� problemas na constru��o do MOCK, apesar de os dados serem obtidos com sucesso.");
				}
				
			}
		}
		
	}

}
