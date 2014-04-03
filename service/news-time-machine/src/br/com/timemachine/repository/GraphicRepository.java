package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Essa classe representa o repositório de informações sobre gráficos
 * esse repositório possui características estatíticas cuja abstração
 * das informações foram implementadas à partir da utilização de inserções
 * de dados em JSON estática por àrea editora
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class GraphicRepository {

	/** Chaves que identificam o JSON (fonte de dados padrão) do objeto */
	protected static final String[] dataKeys = {"id","title","url","description","image","date","factdate"};
	
	/**
	 * Método responsável por efetuar busca de todos os infográficos
	 * estáticos cadastrados, sua implementação dinâmica é necessária
	 * para que uma implementação posterior possa ser possível (obtendo 
	 * dados à partir de base automatizada e dinâmica). Esses dados foram
	 * inseridos manualmente pela redação originadora dos dados na hackathon
	 * @return Lista de objetos JSON
	 */
	public JSONArray findAllStaticGraphics() {
		
		JSONArray jsonArray = new JSONArray();
		JSONObject graphicItem = new JSONObject();
		
		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"1");
		graphicItem.put(dataKeys[1],"O rastro de destruição do furacão Sandy");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/furacao-sandy-46941.html");
		graphicItem.put(dataKeys[3],"O que ocorreu quando o furacão Sandy tocou o solo norte-americano. Palavra-chave: desastres naturais");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"29/07/2012");
		graphicItem.put(dataKeys[6],"29/07/2012");    
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"2");
		graphicItem.put(dataKeys[1],"Supertufão Haiyan");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/veja-como-o-temporal-avancou-pelo-estado-59342.html");
		graphicItem.put(dataKeys[3],"A trajetória do supertufão Haiyan atingiu em cheio as províncias de Leyte e Samar, nas Filipinas, as mais danificadas pelos ventos de até 315 km/h e ondas gigantes, que podem ter provocado até 10 mil mortes. Palavra-chave: desastres naturais");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"22/03/2014");
		graphicItem.put(dataKeys[6],"22/03/2014");    
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"3");
		graphicItem.put(dataKeys[1], "Temporal causa estragos em todo o Rio Grande do Sul");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/veja-como-o-temporal-avancou-pelo-estado-59342.html");
		graphicItem.put("Imagens de satélite mostram como o temporal que durou 14 horas avançou pelo Rio Grande do Sul, entre a meia-noite e as 14h30min de ontem. Palavra-chave: desastres naturais ", "descricao 1");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"05/12/2013");
		graphicItem.put(dataKeys[6],"05/12/2013");    
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "4");
		graphicItem.put(dataKeys[1],"A luta por uma vaga no Mundial");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/a-luta-por-uma-vaga-no-mundial-55301.html");
		graphicItem.put(dataKeys[3],"Confira quem já está na Copa do Mundo e quem se classificará para o torneio se as Eliminatórias terminassem hoje");
		graphicItem.put("infosimbol", "http://zerohora.rbsdirect.com.br/imagesrc/16272654.jpg?w=620");
		graphicItem.put(dataKeys[5],"11/09/2013");
		graphicItem.put(dataKeys[6],"11/09/2013");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"5");
		graphicItem.put(dataKeys[1], "O mapa dos ingressos para a Copa do Mundo");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/o-mapa-dos-ingressos-para-a-copa-do-mundo-54341.html");
		graphicItem.put("Veja o preço, os lugares e como se inscrever no site da Fifa. Palavra-chave: Copa do Mundo", "descricao 1");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"22/03/2014");
		graphicItem.put(dataKeys[6],"22/03/2014");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"6");
		graphicItem.put(dataKeys[1],"Álbum de figurinhas da Copa do Mundo no Brasil");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/album-de-figurinhas-da-copa-do-mundo-no-brasil-50141.html");
		graphicItem.put(dataKeys[3],"Confira os principais destaques de quem já está classificado para a edição brasileira do Mundial. Palavra-chave: Copa do Mundo.");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5], "18/06/2013");
		graphicItem.put(dataKeys[6],"18/06/2013");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"7");
		graphicItem.put(dataKeys[1], "O aparelho que mudou o mercado dos smartphones");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/como-funciona-um-cirurgiao-robo-50701.html");
		graphicItem.put(dataKeys[3],"Desde 2007, com o primeiro modelo, até o novo iPhone 5C, veja o que mudou no celular da Apple.");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"10/09/2013");
		graphicItem.put(dataKeys[6],"10/09/2013");    
		jsonArray.add(graphicItem);  

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "8");
		graphicItem.put(dataKeys[1], "Como funciona um cirurgião robô");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/como-funciona-um-cirurgiao-robo-50701.html");
		graphicItem.put(dataKeys[3], "Um simulador robótico do equipamento Da Vince já está em operação no Hospital de Clínicas de Porto Alegre. Saiba como ele opera.");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"20/05/2013");
		graphicItem.put(dataKeys[6],"20/05/2013");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "9");
		graphicItem.put(dataKeys[1], "Cia e Interpol divergem sobre possibilidade");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/mundo/noticia/2014/03/cia-e-interpol-divergem-sobre-possibilidade-de-acao-terrorista-4442778.html");
		graphicItem.put("subtitle", "sub titulo 1");
		graphicItem.put(dataKeys[3], "descricao 1");
		graphicItem.put(dataKeys[4], "http://zerohora.rbsdirect.com.br/imagesrc/16272654.jpg?w=620");
		graphicItem.put(dataKeys[5],"22/03/2014");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "10");
		graphicItem.put(dataKeys[1], "Bodas de ouro de Tarcísio & Glória");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/bodas-de-ouro-de-tarcisio-gloria-46883.html");
		graphicItem.put(dataKeys[3], "confira a linha de tempo do casal Tarcísio Meira e Glória Menezes que juntos, somam mais de uma centena de trabalhos entre telenovelas, minisséries e seriados. Palavra-chave: novelas");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"27/10/2012");
		graphicItem.put(dataKeys[6],"27/10/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "11");
		graphicItem.put(dataKeys[1], "O que você sabe sobre Guerra dos Sexos");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/quiz-o-quanto-voce-lembra-sabe-de-guerra-dos-sexos-46163.html");
		graphicItem.put(dataKeys[3], "A novela Guerra dos Sexos estreia um remake na RBS TV em 1º de outubro. A primeira versão passou no ano de 1983. Veja o quanto você recorda da trama original nas 10 perguntas a seguir preparadas pelo caderno TV Show de Zero Hora");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"29/09/2012");
		graphicItem.put(dataKeys[6],"29/09/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "12");
		graphicItem.put(dataKeys[1], "Elas mandam nas novelas");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/elas-mandam-nas-novelas-46581.htmll");
		graphicItem.put(dataKeys[3], "Escolha sua mocinha e vilã favoritas da televisão e das novelas");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"16/10/2012");
		graphicItem.put(dataKeys[6],"16/10/2012");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "13");
		graphicItem.put(dataKeys[1], "A Linha do Tempo do Julgamento");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/a-linha-do-tempo-do-julgamento-45502.html");
		graphicItem.put(dataKeys[3], "Saiba o que aconteceu no plenário do Supremo Tribunal Federal em cada sessão do julgamento do Mennsalão");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"01/01/2014");
		graphicItem.put(dataKeys[6],"01/01/2014");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "14");
		graphicItem.put(dataKeys[1], "Especial mensalão");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/quiz-o-quanto-voce-lembra-sabe-de-guerra-dos-sexos-46163.html");
		graphicItem.put(dataKeys[3],"Veja detalhes do julgamento da Ação Penal 470 no Supremo Tribunal Federal");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"29/09/2012");
		graphicItem.put(dataKeys[6],"29/09/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "15");
		graphicItem.put(dataKeys[1], "Placar da votação");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/politica/pagina/andamento-do-mensalao.html");
		graphicItem.put(dataKeys[3], "O julgamento no Supremo está sendo realizado em uma divisão por itens, organizada pelo relator Joaquim Barbosa. O ministro alterou parcialmente a ordem dos sete itens que formam a parte acusatória da denúncia da PGR. O primeiro e o último capítulos do documento não tratam de acusações. Veja como está o escore dos votos:");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"02/01/2014");
		graphicItem.put(dataKeys[6],"02/01/2014");
		jsonArray.add(graphicItem); 
		
		return jsonArray;
		
	}
	
}
