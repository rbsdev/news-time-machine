package br.com.newstimemachine.news_extractor.controller;

import java.util.List;

import br.com.newstimemachine.news_extractor.model.News;
import br.com.newstimemachine.news_extractor.model.criteria.NewsCriteria;

/**
 * Interface que define as funcionalidades necessárias
 * para um controlador de extração de matérias.
 * @author Isaias_Alves
 * @version 1.0
 */
public interface NewsExtractorController {

	/**
	 * Efetua buscas de dados de matérias do repositório externo
	 * através de segundo objeto news contendo informações necessárias
	 * para essa filtragem
	 * @param criteria objeto contendo filtro das informações
	 * @return Lista de notícias encontradas no repositório
	 */
	public List<News> findNewsFromRepository(NewsCriteria criteria);
	
	/**
	 * Recebe as notícias a serem extraídas do repositório e encaminha
	 * o processo de extração à serviço externo que as deva estocar
	 * @param extractedNews Lista contendo as notícias que foram extraídas e devam ser 
	 * estocadas.
	 */
	public void extractNews( List<News> extractedNews );
		
}
