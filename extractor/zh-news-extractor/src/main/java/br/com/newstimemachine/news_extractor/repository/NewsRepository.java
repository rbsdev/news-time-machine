package br.com.newstimemachine.news_extractor.repository;

import br.com.newstimemachine.news_extractor.model.News;

/**
 * Interface que representa e define um repositório de notícias
 * @author Isaias_Alves
 * @version 1.0
 */
public interface NewsRepository {

	/**
	 * Efetua a busca de dados de notícias através de seu identificador
	 * @return Objeto do tipo notícia encontrado no repositório 
	 */  
	public News findNewsById(final Long id);

}
