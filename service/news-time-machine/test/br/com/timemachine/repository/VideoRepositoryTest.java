package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Classe que implementa regras de um repositório estatico de testes
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class VideoRepositoryTest extends StaticRepositoryTest {

	/**
	 * Responsável por invocar classe primária contendo a regra genérica de verificação
	 * de repositórios estáticos.
	 */
	@Test
	public void checkVideoStaticList() {
		
		VideoRepository videoRepository = new VideoRepository();
		records = videoRepository.findAllStaticVideos();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}
