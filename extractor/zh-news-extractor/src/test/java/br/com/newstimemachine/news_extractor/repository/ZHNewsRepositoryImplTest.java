package br.com.newstimemachine.news_extractor.repository;

import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.newstimemachine.news_extractor.model.News;

/**
 * Implementa testes em repositório de notícias da ZH
 * @author Isaias_Alves
 * @version 1.0
 */
public class ZHNewsRepositoryImplTest {

	final Long validId = 4442778l;
	
	private NewsRepository repository = new ZHNewsRepositoryImpl();
	
	/**
	 * Uma Notícia válida precisa ser retornada quando a busca contendo
	 * um identificador válido for efetuada
	 */
	@Test
	public void validNewsObjectWasExpectedOnFind() {
		
		News news = repository.findNewsById(validId);
		
		if (!( news!=null && news.getId().equals(validId))) {
			fail("A busca de notícias do repositório possui problemas pois não retorna uma matéria válida.");
		}
		
	}
	
	/**
	 * Esse método testa se uma URL válida será montada quando o método que contrói URL
	 * interna de serviço for chamado.
	 */
	@Test
	public void validUrlMustBeValidOnInternalBuildProcess() {
		
		ZHNewsRepositoryImpl repositoryZH = new ZHNewsRepositoryImpl();
		
		final String validServiceURL = "http://www.clicrbs.com.br/zerohora/jsp/redirectNews.jspx?jornal=ZH&id="+validId.toString();
		
		if (!repositoryZH.buildServiceUrlByNews(validId).equals(validServiceURL)) {
			fail("A URL gerada pelo método interno de contrução de URL de serviço não é válida.");
		}
		
	}
	
}
