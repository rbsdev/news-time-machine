package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Classe que implementa regras de um reposit�rio estatico de testes
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class VideoRepositoryTest extends StaticRepositoryTest {

	/**
	 * Respons�vel por invocar classe prim�ria contendo a regra gen�rica de verifica��o
	 * de reposit�rios est�ticos.
	 */
	@Test
	public void checkVideoStaticList() {
		
		VideoRepository videoRepository = new VideoRepository();
		records = videoRepository.findAllStaticVideos();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}
