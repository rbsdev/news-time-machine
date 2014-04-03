package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Classe de reposit�rio de testes em PDFs 
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PdfRepositoryTest extends StaticRepositoryTest {

	/**
	 * Respons�vel por invocar classe prim�ria contendo a regra gen�rica de verifica��o
	 * de reposit�rios est�ticos.
	 */
	@Test
	public void checkPDFStaticList() {
		
		PdfRepository pdfRepository = new PdfRepository();
		records = pdfRepository.findAllStaticPdfs();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}