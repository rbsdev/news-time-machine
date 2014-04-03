package br.com.timemachine.repository;

import org.junit.Test;

/**
 * Classe de repositório de testes em PDFs 
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PdfRepositoryTest extends StaticRepositoryTest {

	/**
	 * Responsável por invocar classe primária contendo a regra genérica de verificação
	 * de repositórios estáticos.
	 */
	@Test
	public void checkPDFStaticList() {
		
		PdfRepository pdfRepository = new PdfRepository();
		records = pdfRepository.findAllStaticPdfs();
		
		this.checkIfReturnedStaticRepositoryListIsValid();
	}
	
}