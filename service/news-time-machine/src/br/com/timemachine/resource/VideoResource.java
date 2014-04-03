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
 * Endpoint jersey respons�vel por entrega de dados de v�deo �
 * interface cliente
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/video")  
@RequestScoped
public class VideoResource {
	
	/* Objeto facade respons�vel por gerenciar entregas, possui o conhecimento sobre os m�dulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();	
	
	/**
	 * M�todo que retorna a busca de dados de v�deos
	 * e responde com json espec�fico de v�deos
	 * @param query consulta do usu�rio.
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
