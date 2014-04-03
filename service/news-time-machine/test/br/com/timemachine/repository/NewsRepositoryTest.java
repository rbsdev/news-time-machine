package br.com.timemachine.repository;

import static org.junit.Assert.fail;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.junit.Test;

/**
 * Classe contendo as implementações de teste
 * do repositório de noticias.
 * @author Isaias_Alves
 * @version hackathon_0.2b
 */
public class NewsRepositoryTest extends NewsRepository {

	/**
	 * Verifica se a URL do índice Solr possui uma implementação válida
	 */
	@Test
	public void aValidURLFromSolrIsMandatory() {
		
		final String criteria = "mySearch";
		
		final String expectedURL = "http://localhost:8983/solr/select?q=*:"+criteria+"&wt=json";
		
		if ( !this.buildSolrServiceURL(criteria).equals(expectedURL) ) {
			fail("A URL de serviço esta sendo montada de maneira inválida, revise a implementação do índice Solr.");
		}
		
	}
	
	/**
	 * Esse teste é responsável por validar se o serviço Solr é capaz de retornar 
	 * dados válidos a partir do índice solr. Para isso foi criado um JSON de teste 
	 * representando a entrega do Serviço Solr standalone, esse JSON é aplicado no 
	 * repositório de notícias e o retorno da geração dos dados é testado.
	 */
	@Test
	public void checkIfAValidSolrJSONResponseBuildsValidArray() {
		
		// Criará um JSON que representará um Mock do serviço Solr
		StringBuilder mockSolrJSON = new StringBuilder();
		
		mockSolrJSON.append("\"{\"responseHeader\":{\"status\":0,\"QTime\":3,\"params\":{\"q\":\"*:*\",\"wt\":\"json\"}},");
		mockSolrJSON.append("\"response\":{\"numFound\":3,\"start\":0,\"docs\":[");
				
				// item test 0
				mockSolrJSON.append("{\"id\":\"change.me\",\"title\":[\"change.me\"],\"_version_\":1463332413960617984},");
				
				// Item test 1
				mockSolrJSON.append("{\"id\":\"4454232\",\"title\":[\"Três dias depois de deixar o hospital, Renato Aragão volta a ser internado\"],\"url\":\"link\",\"subject\":\"null\",\"comments\":\"link\",\"_version_\":1463335335889993728},");
				
				// Item test 3
				mockSolrJSON.append("{\"id\":\"4454233\",\"title\":[\"Milhares de pessoas se reúnem para comemorar o dia dos Beatles em Porto Alegre\"],\"url\":\"link\",\"subject\":\"null\",\"comments\":\"http://zerohora.rbsdirect.com.br/imagesrc/16311801.jpg.jpg?w=620\",");
				mockSolrJSON.append(" \"last_modified\":\"2014-03-23T00:21:00Z\",\"_version_\":1463335360014581760}]}}\"");
		
				
		this.buildSolrJSONResponse("anyCriteria String..");
		
		this.solrJSONResponse = (JSONObject) JSONSerializer.toJSON(mockSolrJSON.toString());
		
		final JSONArray array = this.buildSolarResult();
		
		if (array == null) {
			fail("FATAL ERROR: A obtenção de dados através de um mock válido não retorna uma lista populada.");
		} else {
			for (int i = 0; i < array.size()  ;i++) {
				
				JSONObject jsonToCheck = (JSONObject) array.get(i);
				
				final String id = jsonToCheck.getString("id");
				
				if (!(id!=null && id.trim().length()>0)) {
					fail("CHECK EROR: Há itens inválidos no serviço ou há problemas na construção do MOCK, apesar de os dados serem obtidos com sucesso.");
				}
				
			}
		}
		
	}

}
