package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Esse método não possui implementação final.
 * deve ser usado apenas como esboço para manter contrato de 
 * dados que devam ser gerados a partir de base que for implementada.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class VideoRepository {

	/**
	 * Monta coleção de JSON estáticos desenvolvidos pela redação na hackathon
	 * @return Array de objetos estáticos
	 */
	public JSONArray findAllStaticVideos() {
		JSONArray jsonArray = new JSONArray();
		
		JSONObject video1 = new JSONObject();
	    video1.put("id", 1);
	    video1.put("title", "Imagens de jogos da copa de 1950 no Estádio dos Eucaliptos");
	    video1.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zhesportes/2014/03/imagens-jogos-copa-1950-estadio-dos-eucaliptos/69521/");
	    video1.put("description", "copa do mundo, copa de 1950, 1950, copa, eucaliptos, estádio dos eucaliptos");
	    video1.put("image", "video.jpg");
	    video1.put("date","21/03/2014");
	    video1.put("factdate","01/01/1950");
	    jsonArray.add(video1);

	    JSONObject video2 = new JSONObject();
	    video2.put("id", 2);
	    video2.put("title", "Gilberto Silva relembra confrontos do Penta, na Copa do Mundo de 2002");
	    video2.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/06/gilberto-silva-relembra-confrontos-penta/629/");
	    video2.put("description", "penta, pentacampeonato, brasil, copa, copa do mundo, 2002, gilberto silva");
	    video2.put("image", "video.jpg");
	    video2.put("date","30/06/2012");
	    video2.put("factdate","01/01/2002");
	    jsonArray.add(video2);

	    JSONObject video3 = new JSONObject();
	    video3.put("id", 3);
	    video3.put("title", "Gilberto Silva relembra confrontos do Penta, na Copa do Mundo de 2002");
	    video3.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/06/gilberto-silva-relembra-confrontos-penta/629/");
	    video3.put("description", "penta, pentacampeonato, brasil, copa, copa do mundo, 2002, gilberto silva");
	    video3.put("image", "video.jpg");
	    video3.put("date","18/06/2012");
	    video3.put("factdate","01/01/2002");
	    jsonArray.add(video3);

	    JSONObject video4 = new JSONObject();
	    video4.put("id", 4);
	    video4.put("title", "As Caras da Copa: na estrada pelo aeromóvel da Copa do Mundo");
	    video4.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/06/caras-copa-estrada-pelo-aeromovel-copa-mundo/579/");
	    video4.put("description", "copa, copa do mundo, 2014, aeromóvel, engenheiro");
	    video4.put("image", "video.jpg");
	    video4.put("date","19/06/2012");
	    video4.put("factdate","19/06/2012");
	    jsonArray.add(video4);

	    JSONObject video5 = new JSONObject();
	    video5.put("id", 5);
	    video5.put("title", "Bombeiros simulam ataque à embarcação no Guaíba");
	    video5.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/07/bombeiros-simulam-ataque-embarcaco-guaiba/645/");
	    video5.put("description", "copa, copa do mundo, 2014, treinamento, bombeiros, catamarã, guaíba");
	    video5.put("image", "video.jpg");
	    video5.put("date","03/07/2012");
	    video5.put("factdate","03/07/2012");
	    jsonArray.add(video5);

	    JSONObject video6 = new JSONObject();
	    video6.put("id", 6);
	    video6.put("title", "Catarina, um trauma que permanece");
	    video6.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zhdoc/2014/03/zhdoc-catarina-trauma-que-permanece/69501/");
	    video6.put("description", "furacão, catarina, rio grande do sul, santa catarina, desastre natural, desastres naturais");
	    video6.put("image", "video.jpg");
	    video6.put("date","21/03/2014");
	    video6.put("factdate","27/03/2004");
	    jsonArray.add(video6);

	    JSONObject video7 = new JSONObject();
	    video7.put("id", 7);
	    video7.put("title", "Estragos da supertempestade Sandy");
	    video7.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/video-minuto/2012/10/reporter-mostra-estragos-supertempestade-sandy/4265/");
	    video7.put("description", "estragos, tempestade, supertempestade, sandy, estados unidos, nova york, desastre natural, desastres naturais");
	    video7.put("image", "video.jpg");
	    video7.put("date","30/10/2012");
	    video7.put("factdate","28/10/2012");
	    jsonArray.add(video7);

	    JSONObject video8 = new JSONObject();
	    video8.put("id", 8);
	    video8.put("title", "Será que sai beijo gay em Amor à Vida?");
	    video8.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/segundo-caderno/2014/01/sera-que-sai-beijo-gay-amor-vida/60028/");
	    video8.put("description", "novela, novelas, beijo gay, amor a vida, rede globo");
	    video8.put("image", "video.jpg");
	    video8.put("date","17/01/2014");
	    video8.put("factdate","31/01/2014");
	    jsonArray.add(video8);

	    JSONObject video9 = new JSONObject();
	    video9.put("id", 9);
	    video9.put("title", "O melhor e o pior de Avenida Brasil: confira a opinião de jornalistas de ZH");
	    video9.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/video-minuto/2012/10/melhor-pior-avenida-brasil-confira-opinio-jornalistas/3456/");
	    video9.put("description", "novela, novelas, avenida brasil, rede globo");
	    video9.put("image", "video.jpg");
	    video9.put("date","18/10/2012");
	    video9.put("factdate","18/10/2012");
	    jsonArray.add(video9);

	    JSONObject video10 = new JSONObject();
	    video10.put("id", 10);
	    video10.put("title", "Fã de Avenida Brasil, moradora de rua compra TV usada em prestações");
	    video10.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/segundo-caderno/2012/10/avenida-brasil-moradora-rua-compra-usada-prestaces/3495/");
	    video10.put("description", "novela, novelas, avenida brasil, moradora de rua");
	    video10.put("image", "video.jpg");
	    video10.put("date","18/10/2012");
	    video10.put("factdate","19/10/2012");
	    jsonArray.add(video10);

	    JSONObject video11 = new JSONObject();
	    video11.put("id", 11);
	    video11.put("title", "O fim do #oioioi: veja como foi a movimentação nas ruas e bares da Capital para acompanhar o último capítulo de Avenida Brasil");
	    video11.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/10/fim-oioioi-veja-como-foi-movimentaco-nas-ruas-bares-capital-para-acompanhar-ultimo-capitulo-avenida-brasil/3594/");
	    video11.put("description", "avenida brasil, novela, novelas, rede globo");
	    video11.put("image", "video.jpg");
	    video11.put("date","20/10/2012");
	    video11.put("factdate","19/10/2012");
	    jsonArray.add(video11);

	    JSONObject video12 = new JSONObject();
	    video12.put("id", 12);
	    video12.put("title", "O que foi o mensalão?");
	    video12.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/politica/2013/11/que-foi-mensalao/52717/");
	    video12.put("description", "mensalão, escândalo, política");
	    video12.put("image", "video.jpg");
	    video12.put("date","27/11/2013");
	    video12.put("factdate","01/01/2005");
	    jsonArray.add(video12);

	    JSONObject video13 = new JSONObject();
	    video13.put("id", 13);
	    video13.put("title", "Rosane de Oliveira comenta o julgamento do mensalão");
	    video13.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/zero-hora/2012/12/julgamento-mensalo/8761/");
	    video13.put("description", "mensalão, julgamento, política, escândalo");
	    video13.put("image", "video.jpg");
	    video13.put("date","27/12/2012");
	    video13.put("factdate","27/12/2012");
	    jsonArray.add(video13);

	    JSONObject video14 = new JSONObject();
	    video14.put("id", 14);
	    video14.put("title", "Óculos cria realidade virtual");
	    video14.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/video-minuto/2014/03/oculos-cria-realidade-virtual/67587/");
	    video14.put("description", "óculos, realidade virtual, tecnologia");
	    video14.put("image", "video.jpg");
	    video14.put("date","11/03/2014");
	    video14.put("factdate","11/03/2014");
	    jsonArray.add(video14);

	    JSONObject video15 = new JSONObject();
	    video15.put("id", 15);
	    video15.put("title", "Conheça o robô com expressões faciais");
	    video15.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/video-minuto/2014/03/conheca-robo-com-expressoes-faciais/67585/");
	    video15.put("description", "tecnologia, robô");
	    video15.put("image", "video.jpg");
	    video15.put("date","11/03/2014");
	    video15.put("factdate","11/03/2014");
	    jsonArray.add(video15);

	    JSONObject video16 = new JSONObject();
	    video16.put("id", 16);
	    video16.put("title", "O que a compra do WhatsApp muda na vida do usuário");
	    video16.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/economia/2014/02/que-compra-whatsapp-muda-vida-usuario/66072/");
	    video16.put("description", "whatsapp, tecnologia");
	    video16.put("image", "video.jpg");
	    video16.put("date","28/02/2014");
	    video16.put("factdate","19/02/2014");
	    jsonArray.add(video16);

	    JSONObject video17 = new JSONObject();
	    video17.put("id", 17);
	    video17.put("title", "Tire suas dúvidas sobre o Facebook");
	    video17.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/site-zh/2014/01/tire-suas-duvidas-sobre-facebook/61968/");
	    video17.put("description", "tecnologia, facebook, redes sociais");
	    video17.put("image", "video.jpg");
	    video17.put("date","31/01/2014");
	    video17.put("factdate","31/01/2014");
	    jsonArray.add(video17);

	    JSONObject video18 = new JSONObject();
	    video18.put("id", 18);
	    video18.put("title", "Tecnologia nos CFCs: primeiro simulador de direção do Estado é instalado");
	    video18.put("url", "http://videos.clicrbs.com.br/rs/zerohora/video/geral/2014/01/tecnologia-nos-cfcs-primeiro-simulador-direcao-estado-instalado/58614/");
	    video18.put("description", "tecnologia, simulador, direção, trânsito, motorista, carro, automóvel");
	    video18.put("image", "video.jpg");
	    video18.put("date","09/01/2014");
	    video18.put("factdate","08/01/2014");
	    jsonArray.add(video18);
	    
	    return jsonArray;
	}
	
}
