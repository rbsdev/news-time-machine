package br.com.timemachine.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;
import br.com.timemachine.controller.DataType;
import br.com.timemachine.controller.TimemachineFacade;

/**
 * Classe de resource com servi�os REST representando
 * a entrega de dados de uma pesquisa de infogr�ficos
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */ 
@Path("/graphic")  
@RequestScoped
public class GraphicResource {

	@Inject
	TimemachineFacade facade;
	
	/**
	 * Endpoint jersey respons�vel por fazer callback � facade e
	 * montar objeto JSON que centraliza a entrega dos dados ao cliente
	 * @param query conte�do de busca do usu�rio
	 * @return Objeto JSON com dados obtidos.
	 */
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject get( @QueryParam("q") String query ) {
	
		JSONObject jsonInterface = new JSONObject();
		
		jsonInterface.put("graphic", facade.searchDataByType(query, DataType.GRAPHIC)  );
		
		return jsonInterface;
		
	}

}
