package br.com.timemachine.resource;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;
import br.com.timemachine.controller.DataType;
import br.com.timemachine.controller.TimemachineFacade;

/**
 * Endpoint com implementa��es de not�cias, sua responsabilidade � realizar
 * a interface com o utilizador do servi�o entregando os dados necess�rios 
 * em formato JSON, referente � not�cias
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/news")  
@RequestScoped
public class NewsResource {

	/* Objeto facade respons�vel por gerenciar entregas, possui o conhecimento sobre os m�dulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();
	
	/**
	 * M�todo cuja responsabilidade � indexar os dados.
	 * @return objeto json gerado
	 */
	@POST
	@Path("indexer")
	@Produces(MediaType.APPLICATION_JSON) 
	public JSONObject indexData(    ) {
		return null;
	}
	
	/**
	 * Encaminha busca de dados na base ativa, atrav�s de requisi��o
	 * ao controller
	 * @param query consulta textual feita pelo cliente
	 * @return Objeto json representando array de resultados
	 */
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject search( @QueryParam("q") String query ) {
	
		JSONObject jsonInterface = new JSONObject();
		
		jsonInterface.put("news",timemachinefacade.searchDataByType(query, DataType.NEWS));
		
		return jsonInterface;
		
	}
	
}
