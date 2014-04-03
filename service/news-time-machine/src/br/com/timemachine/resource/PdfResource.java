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
 * Endpoint jersey com implementações de repositorio de PDF
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/pdf")  
@RequestScoped
public class PdfResource {

	/* Objeto facade responsável por gerenciar entregas, possui o conhecimento sobre os módulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();
	
	/**
	 * Serviço que gera interface com a busca de repositorios no indice
	 * @param query busca que deseja-se efetuar
	 * @return  JSON contendo os dados
	 */
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject get( @QueryParam("q") String query ) {
		
		JSONObject jsonInterface = new JSONObject();
		
		jsonInterface.put("pdf",timemachinefacade.searchDataByType(query, DataType.PDF));
		
		return jsonInterface;
	}
}
