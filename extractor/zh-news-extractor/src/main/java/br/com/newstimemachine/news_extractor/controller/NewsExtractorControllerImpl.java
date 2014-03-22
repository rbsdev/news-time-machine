package br.com.newstimemachine.news_extractor.controller;

import java.util.LinkedList;
import java.util.List;

import br.com.newstimemachine.news_extractor.model.News;
import br.com.newstimemachine.news_extractor.model.criteria.NewsCriteria;
import br.com.newstimemachine.news_extractor.repository.NewsRepository;
import br.com.newstimemachine.news_extractor.repository.ZHNewsRepositoryImpl;

/** 
 * Controlador das funcionalidades do extrator de notícias
 * resposável pela lógica de retirar os dados de uma base externa
 * (por exemplo da zerohora) acaba por interpretar todos esses dados
 * e encaminhar requisições para estoque destas informações
 * @see NewsExtractorController
 * @author Isaias_Alves
 * @version 1.0
 */
public class NewsExtractorControllerImpl implements NewsExtractorController {

	/**
	 * (non-javadoc)
	 * @see NewsExtractorController#findNewsFromRepository
	 */
	public List<News> findNewsFromRepository(NewsCriteria criteria) {
		
		
		NewsRepository repository = new ZHNewsRepositoryImpl();
		
		List<News> newsList = new LinkedList<News>();
		
		
		
		for ( Long i = criteria.getStartId(); i <= criteria.getEndId()  ;i ++ ) {
			try {
				News foundNews = repository.findNewsById(i);
				
				if (foundNews!=null) {
					newsList.add(foundNews);
				}
			} catch (Exception e) {e.printStackTrace();}
		}
		
		
		for (News news : newsList) {
			System.out.println("news--> " + news);
		}
			
		//System.out.println("--> " + newsList.size());
		
		return newsList;
	}

	/**
	 * (non-javadoc)
	 * @see NewsExtractorController#extractNews
	 */
	public void extractNews(List<News> extractedNews) {
		
		
		
	}

}
