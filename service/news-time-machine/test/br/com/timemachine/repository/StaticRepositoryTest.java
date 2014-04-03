package br.com.timemachine.repository;

import static org.junit.Assert.fail;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

/**
 * Classe genérica com métodos de testes para todos
 * os repositórios estáticos do projeto.
 * A ser usada por Graphic, PDF, Photo e Video.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class StaticRepositoryTest {

	protected JSONArray records;
	
	/**
	 * Verifica se a lista retornada possui objetos do tipo JSON e 
	 * é populada, diferente de nulo
	 */
	@Test
	public void checkIfReturnedStaticRepositoryListIsValid() {
		
		if (records!=null) {
			for (Object record : records) {
				
				JSONObject recordJson = (JSONObject) record;
				
				final String idValue = recordJson.getString( "id" );
				
				if (!(idValue != null && idValue.trim().length() > 0) ) {
					fail("A lista é inválida pois nao possui atributos necessários ");
				}
				
			}
		}
		
	}	
	
}
