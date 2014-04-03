package br.com.timemachine.resource;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;
import br.com.timemachine.controller.DataType;
import br.com.timemachine.controller.TimemachineFacade;

/**
 * Endpoint jersey responsável por entrega de dados de vídeo á
 * interface cliente
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/video")  
@RequestScoped
public class VideoResource {
	
	/* Objeto facade responsável por gerenciar entregas, possui o conhecimento sobre os módulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();	
	
	/**
	 * Método que retorna a busca de dados de vídeos
	 * e responde com json específico de vídeos
	 * @param query consulta do usuário.
	 * @return Objeto JSON contendo os dados a serem exibidos na interface
	 */
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject get( @QueryParam("q") String query ) {

		JSONObject jsonInterface = new JSONObject();
		
		jsonInterface.put("videos",timemachinefacade.searchDataByType(query, DataType.VIDEO));
		
		return jsonInterface;
	}
	
}
