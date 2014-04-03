package br.com.timemachine.repository;

import org.junit.Test;

/**
 * O objetivo deste teste é validar a implementação do repositório de infográficos.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class GraphicRepositoryTest extends StaticRepositoryTest {

	/**
	 * Responsável por invocar classe primária contendo a regra genérica de verificação
	 * de repositórios estáticos.
	 */
	@Test
	public void checkGraphicStaticList() {
		
		GraphicRepository graphicRepository = new GraphicRepository();
		records = graphicRepository.findAllStaticGraphics();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}
