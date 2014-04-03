package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Implementa testes no repositório de fotos.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PhotoRepositoryTest extends StaticRepositoryTest  {

	/**
	 * Responsável por invocar classe primária contendo a regra genérica de verificação
	 * de repositórios estáticos.
	 */
	@Test
	public void checkPhotoStaticList() {
		
		PhotoRepository photoRepository = new PhotoRepository();
		records = photoRepository.findAllStaticPhotos();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	
	}
	
}
