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
 * Endpoint com implementações de notícias, sua responsabilidade é realizar
 * a interface com o utilizador do serviço entregando os dados necessários 
 * em formato JSON, referente à notícias
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
@Path("/news")  
@RequestScoped
public class NewsResource {

	/* Objeto facade responsável por gerenciar entregas, possui o conhecimento sobre os módulos */
	final TimemachineFacade timemachinefacade = new TimemachineFacade();
	
	/**
	 * Método cuja responsabilidade é indexar os dados.
	 * @return objeto json gerado
	 */
	@POST
	@Path("indexer")
	@Produces(MediaType.APPLICATION_JSON) 
	public JSONObject indexData(    ) {
		return null;
	}
	
	/**
	 * Encaminha busca de dados na base ativa, através de requisição
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
