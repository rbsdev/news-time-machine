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
 * Endpoint jersey com a responsabilidade de gerir dados de fotos.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/photo")  
@RequestScoped
public class PhotoResource {

	/* Objeto facade responsável por gerenciar entregas, possui o conhecimento sobre os módulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();
	
	/**
	 * Entrega dados à interface e encaminha requisição à busca
	 * de fotos no sistema.
	 * @param query Busca do usuário
	 * @return JSON contendo os dados para a interface
	 */
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject get( @QueryParam("q") String query ) {
	
		JSONObject jsonInterface = new JSONObject();
		
		jsonInterface.put("photo",timemachinefacade.searchDataByType(query, DataType.PHOTO));
		
		return jsonInterface;
		
	}
	
}
