package br.com.timemachine.resource;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Path("/news")  
@RequestScoped
public class NewsResource {
	
	@GET 
    @Path("/search") 
    @Produces(MediaType.APPLICATION_JSON) 
	public JSONObject get( @QueryParam("q") String query ) {
		
		JSONObject json = new JSONObject();
		
		JSONArray jsonArray = new JSONArray();
		
		JSONObject news1 = new JSONObject();
		news1.put("id", 12335l);
		news1.put("title", "titulo 1");
		news1.put("url", "http://zerohora.clicrbs.com.br/rs/mundo/noticia/2014/03/cia-e-interpol-divergem-sobre-possibilidade-de-acao-terrorista-4442778.html");
		news1.put("subtitle", "sub titulo 1");
		news1.put("description", "descricao 1");
		news1.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16272654.jpg?w=620");
		news1.put("date","22/03/2014");
		jsonArray.add(news1);
		
		JSONObject news2 = new JSONObject();
		news1.put("id", 12336l);
		news1.put("title", "titulo 2");
		news1.put("url", "http://zerohora.clicrbs.com.br/rs/mundo/noticia/2014/03/cia-e-interpol-divergem-sobre-possibilidade-de-acao-terrorista-4442778.html");
		news1.put("subtitle", "sub titulo 2");
		news1.put("description", "descricao 2");
		news1.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16272654.jpg?w=620");
		news1.put("date","22/03/2014");
		jsonArray.add(news2);
		
		json.put("news",jsonArray);
		
		return json;
		
	}
	
}
