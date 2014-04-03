package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Essa classe representa o reposit�rio de informa��es sobre gr�ficos
 * esse reposit�rio possui caracter�sticas estat�ticas cuja abstra��o
 * das informa��es foram implementadas � partir da utiliza��o de inser��es
 * de dados em JSON est�tica por �rea editora
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class GraphicRepository {

	/** Chaves que identificam o JSON (fonte de dados padr�o) do objeto */
	protected static final String[] dataKeys = {"id","title","url","description","image","date","factdate"};
	
	/**
	 * M�todo respons�vel por efetuar busca de todos os infogr�ficos
	 * est�ticos cadastrados, sua implementa��o din�mica � necess�ria
	 * para que uma implementa��o posterior possa ser poss�vel (obtendo 
	 * dados � partir de base automatizada e din�mica). Esses dados foram
	 * inseridos manualmente pela reda��o originadora dos dados na hackathon
	 * @return Lista de objetos JSON
	 */
	public JSONArray findAllStaticGraphics() {
		
		JSONArray jsonArray = new JSONArray();
		JSONObject graphicItem = new JSONObject();
		
		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"1");
		graphicItem.put(dataKeys[1],"O rastro de destrui��o do furac�o Sandy");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/furacao-sandy-46941.html");
		graphicItem.put(dataKeys[3],"O que ocorreu quando o furac�o Sandy tocou o solo norte-americano. Palavra-chave: desastres naturais");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"29/07/2012");
		graphicItem.put(dataKeys[6],"29/07/2012");    
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"2");
		graphicItem.put(dataKeys[1],"Supertuf�o Haiyan");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/veja-como-o-temporal-avancou-pelo-estado-59342.html");
		graphicItem.put(dataKeys[3],"A trajet�ria do supertuf�o Haiyan atingiu em cheio as prov�ncias de Leyte e Samar, nas Filipinas, as mais danificadas pelos ventos de at� 315 km/h e ondas gigantes, que podem ter provocado at� 10 mil mortes. Palavra-chave: desastres naturais");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"22/03/2014");
		graphicItem.put(dataKeys[6],"22/03/2014");    
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"3");
		graphicItem.put(dataKeys[1], "Temporal causa estragos em todo o Rio Grande do Sul");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/veja-como-o-temporal-avancou-pelo-estado-59342.html");
		graphicItem.put("Imagens de sat�lite mostram como o temporal que durou 14 horas avan�ou pelo Rio Grande do Sul, entre a meia-noite e as 14h30min de ontem. Palavra-chave: desastres naturais ", "descricao 1");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"05/12/2013");
		graphicItem.put(dataKeys[6],"05/12/2013");    
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "4");
		graphicItem.put(dataKeys[1],"A luta por uma vaga no Mundial");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/a-luta-por-uma-vaga-no-mundial-55301.html");
		graphicItem.put(dataKeys[3],"Confira quem j� est� na Copa do Mundo e quem se classificar� para o torneio se as Eliminat�rias terminassem hoje");
		graphicItem.put("infosimbol", "http://zerohora.rbsdirect.com.br/imagesrc/16272654.jpg?w=620");
		graphicItem.put(dataKeys[5],"11/09/2013");
		graphicItem.put(dataKeys[6],"11/09/2013");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"5");
		graphicItem.put(dataKeys[1], "O mapa dos ingressos para a Copa do Mundo");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/o-mapa-dos-ingressos-para-a-copa-do-mundo-54341.html");
		graphicItem.put("Veja o pre�o, os lugares e como se inscrever no site da Fifa. Palavra-chave: Copa do Mundo", "descricao 1");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"22/03/2014");
		graphicItem.put(dataKeys[6],"22/03/2014");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"6");
		graphicItem.put(dataKeys[1],"�lbum de figurinhas da Copa do Mundo no Brasil");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/album-de-figurinhas-da-copa-do-mundo-no-brasil-50141.html");
		graphicItem.put(dataKeys[3],"Confira os principais destaques de quem j� est� classificado para a edi��o brasileira do Mundial. Palavra-chave: Copa do Mundo.");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5], "18/06/2013");
		graphicItem.put(dataKeys[6],"18/06/2013");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0],"7");
		graphicItem.put(dataKeys[1], "O aparelho que mudou o mercado dos smartphones");
		graphicItem.put(dataKeys[2],"http://zerohora.clicrbs.com.br/rs/infografico/como-funciona-um-cirurgiao-robo-50701.html");
		graphicItem.put(dataKeys[3],"Desde 2007, com o primeiro modelo, at� o novo iPhone 5C, veja o que mudou no celular da Apple.");
		graphicItem.put(dataKeys[4],"infosimbol");
		graphicItem.put(dataKeys[5],"10/09/2013");
		graphicItem.put(dataKeys[6],"10/09/2013");    
		jsonArray.add(graphicItem);  

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "8");
		graphicItem.put(dataKeys[1], "Como funciona um cirurgi�o rob�");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/como-funciona-um-cirurgiao-robo-50701.html");
		graphicItem.put(dataKeys[3], "Um simulador rob�tico do equipamento Da Vince j� est� em opera��o no Hospital de Cl�nicas de Porto Alegre. Saiba como ele opera.");
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
		graphicItem.put(dataKeys[1], "Bodas de ouro de Tarc�sio & Gl�ria");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/bodas-de-ouro-de-tarcisio-gloria-46883.html");
		graphicItem.put(dataKeys[3], "confira a linha de tempo do casal Tarc�sio Meira e Gl�ria Menezes que juntos, somam mais de uma centena de trabalhos entre telenovelas, miniss�ries e seriados. Palavra-chave: novelas");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"27/10/2012");
		graphicItem.put(dataKeys[6],"27/10/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "11");
		graphicItem.put(dataKeys[1], "O que voc� sabe sobre Guerra dos Sexos");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/quiz-o-quanto-voce-lembra-sabe-de-guerra-dos-sexos-46163.html");
		graphicItem.put(dataKeys[3], "A novela Guerra dos Sexos estreia um remake na RBS TV em 1� de outubro. A primeira vers�o passou no ano de 1983. Veja o quanto voc� recorda da trama original nas 10 perguntas a seguir preparadas pelo caderno TV Show de Zero Hora");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"29/09/2012");
		graphicItem.put(dataKeys[6],"29/09/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "12");
		graphicItem.put(dataKeys[1], "Elas mandam nas novelas");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/elas-mandam-nas-novelas-46581.htmll");
		graphicItem.put(dataKeys[3], "Escolha sua mocinha e vil� favoritas da televis�o e das novelas");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"16/10/2012");
		graphicItem.put(dataKeys[6],"16/10/2012");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "13");
		graphicItem.put(dataKeys[1], "A Linha do Tempo do Julgamento");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/a-linha-do-tempo-do-julgamento-45502.html");
		graphicItem.put(dataKeys[3], "Saiba o que aconteceu no plen�rio do Supremo Tribunal Federal em cada sess�o do julgamento do Mennsal�o");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"01/01/2014");
		graphicItem.put(dataKeys[6],"01/01/2014");
		jsonArray.add(graphicItem);


		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "14");
		graphicItem.put(dataKeys[1], "Especial mensal�o");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/infografico/quiz-o-quanto-voce-lembra-sabe-de-guerra-dos-sexos-46163.html");
		graphicItem.put(dataKeys[3],"Veja detalhes do julgamento da A��o Penal 470 no Supremo Tribunal Federal");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"29/09/2012");
		graphicItem.put(dataKeys[6],"29/09/2012");
		jsonArray.add(graphicItem);

		graphicItem = new JSONObject();
		graphicItem.put(dataKeys[0], "15");
		graphicItem.put(dataKeys[1], "Placar da vota��o");
		graphicItem.put(dataKeys[2], "http://zerohora.clicrbs.com.br/rs/politica/pagina/andamento-do-mensalao.html");
		graphicItem.put(dataKeys[3], "O julgamento no Supremo est� sendo realizado em uma divis�o por itens, organizada pelo relator Joaquim Barbosa. O ministro alterou parcialmente a ordem dos sete itens que formam a parte acusat�ria da den�ncia da PGR. O primeiro e o �ltimo cap�tulos do documento n�o tratam de acusa��es. Veja como est� o escore dos votos:");
		graphicItem.put(dataKeys[4], "infosimbol");
		graphicItem.put(dataKeys[5],"02/01/2014");
		graphicItem.put(dataKeys[6],"02/01/2014");
		jsonArray.add(graphicItem); 
		
		return jsonArray;
		
	}
	
}
