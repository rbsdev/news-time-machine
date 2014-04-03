package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Implementa testes no reposit�rio de fotos.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PhotoRepositoryTest extends StaticRepositoryTest  {

	/**
	 * Respons�vel por invocar classe prim�ria contendo a regra gen�rica de verifica��o
	 * de reposit�rios est�ticos.
	 */
	@Test
	public void checkPhotoStaticList() {
		
		PhotoRepository photoRepository = new PhotoRepository();
		records = photoRepository.findAllStaticPhotos();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	
	}
	
}
