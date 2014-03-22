package br.com.newstimemachine.news_extractor.controller;

import static org.junit.Assert.fail;
import java.util.List;

import org.junit.Test;

import br.com.newstimemachine.news_extractor.model.News;
import br.com.newstimemachine.news_extractor.model.criteria.NewsCriteria;

/**
 * Classe que implementa testes no controlador de extrator de notícias
 * @author Isaias_Alves
 * @version 1.0
 */
public class NewsExtractorControllerImplTest {


	protected NewsExtractorController extractorController = new NewsExtractorControllerImpl();
	
	/**
	 * Verifica se a listagem de notícias por id esta trazendo uma lista 
	 * coerente com o que foi solicitado
	 */
	@Test
	public void extractedNewsListByidMustBeValid() {
		
		NewsCriteria criteria = new NewsCriteria();
		
		final Long startId = 4454201l;
		final Long endId = 4454204l;
		
		criteria.setStartId(startId);
		criteria.setEndId(endId);
		
		// SearchNews By Date
		List<News> newsList = extractorController.findNewsFromRepository(criteria);
	
		// A lista retornada precisa estar preenchida
		if ( newsList == null ) {
			fail("Foi retornada uma lista vazia quando a procura é efetuada com identificadores válidos.");
		} else if (!(newsList.size() > 0)) {
			fail("O identificador de item da listagem não é válido pois precisa estar entre o range recebido ou possuir identificador populado.");
		}	
	}
}
