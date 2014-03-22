package br.com.newstimemachine.news_extractor.model.criteria;


/**
 * News Criteria é utilizado para efetuar a filtragem de dados
 * de notícias no extratior
 * @author Isaias_Alves
 * @version 1.0
 */
public class NewsCriteria {

	private Long startId;
	
	private Long endId;

	public Long getStartId() {
		return startId;
	}

	public void setStartId(Long startId) {
		this.startId = startId;
	}

	public Long getEndId() {
		return endId;
	}

	public void setEndId(Long endId) {
		this.endId = endId;
	}
}
