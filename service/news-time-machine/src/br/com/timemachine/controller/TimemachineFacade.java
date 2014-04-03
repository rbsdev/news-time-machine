package br.com.timemachine.controller;

import net.sf.json.JSONArray;
import br.com.timemachine.repository.GraphicRepository;
import br.com.timemachine.repository.NewsRepository;

/**
 * Possui responsabilidade por intermediar as chamadas aos reposit�rios e
 * unir as funcionalidades em um callback �nico fazendo com que as implementa��es
 * possam estar acess�veis do contexto cliente
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class TimemachineFacade {

	/**
	 * Objecto componente potencializador e gerenciador de buscas.
	 */
	final SearchCriteria searchCriteriaConfig = new SearchCriteria();

	/**
	 * Efetua a busca de dados atrav�s dos crit�rios de busca necess�rios 
	 * @param clientQuery Consulta do cliente
	 * @param type tipo de dado
	 * @return Lista de dados j� em formato JSON
	 */
	public JSONArray searchDataByType( final String clientQuery, DataType type) {
		
		JSONArray records = new JSONArray();
	
		switch (type) {
		
		case NEWS:
			
			final boolean isSolarSource = true; // Em caso de inexist�ncia do sevidor Solar, utiliza base local (passar false)
			records.addAll( new NewsRepository().findNews( clientQuery, isSolarSource ));
			
			break;
			
		case GRAPHIC:
			
			final JSONArray allGraphicData =  new GraphicRepository().findAllStaticGraphics();
			records = searchCriteriaConfig.filterDataByQuery(clientQuery, allGraphicData);
			
			break;
			
		default: break;
			
		}
		
		return records;
	}
	

	
	
	
}
