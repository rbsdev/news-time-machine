package br.com.timemachine.repository;

import org.junit.Test;

/**
 * O objetivo deste teste � validar a implementa��o do reposit�rio de infogr�ficos.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class GraphicRepositoryTest extends StaticRepositoryTest {

	/**
	 * Respons�vel por invocar classe prim�ria contendo a regra gen�rica de verifica��o
	 * de reposit�rios est�ticos.
	 */
	@Test
	public void checkGraphicStaticList() {
		
		GraphicRepository graphicRepository = new GraphicRepository();
		records = graphicRepository.findAllStaticGraphics();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}
