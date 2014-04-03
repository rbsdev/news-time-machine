package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Implementa o reposit�rio de fotos do sistema
 * possui implementa��o est�tica, requer implementa��o final posterior
 * deve ser usada apenas como esbo�o e esclarecer os conectores (� um esqueleto).
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PhotoRepository {

	/**
	 * Realiza a entrega dos dados est�ticos digitados pela reda��o na hackathon.
	 * @return Objeto array contendo os dados est�ticos.
	 */
	public JSONArray findAllStaticPhotos() {
		JSONArray jsonArray = new JSONArray();
		
		JSONObject photo1 = new JSONObject();
		photo1.put("id", 1l);
		photo1.put("title", "Brasil e Fran�a na Copa de 1938");
		photo1.put("url", "http://diariogaucho.rbsdirect.com.br/imagesrc/16037024.jpg?w=620");
		photo1.put("description", "Lance do jogo Brasil, de branco, e Fran�a na Copa do Mundo de 1938 em que os brasileiros ficaram em terceiro lugar.");
		photo1.put("image", "http://diariogaucho.rbsdirect.com.br/imagesrc/16037024.jpg?w=800");
		photo1.put("date","06/06/1938");
		jsonArray.add(photo1);

		JSONObject photo2 = new JSONObject();
		photo2.put("id", 2l);
		photo2.put("title", "Brasil vence o Zaire em 1974");
		photo2.put("url", "http://wp.clicrbs.com.br/protofutebol/files/2013/09/Zaire-1974.jpg");
		photo2.put("description", "Brasil 3 x 0 Zaire, na Copa do Mundo de 1974, na Alemanha Ocidental");
		photo2.put("image", "http://wp.clicrbs.com.br/protofutebol/files/2013/09/Zaire-1974.jpg");
		photo2.put("date","15/06/1974");
		jsonArray.add(photo2);

		JSONObject photo3 = new JSONObject();
		photo3.put("id", 3l);
		photo3.put("title", "Uniforme utilizado pelo Brasil na Copa do Mundo de 1950");
		photo3.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15900837.jpg ");
		photo3.put("description", "Antes da amarelinha ser \"A\" amarelinha, a sele��o brasileira j� teve uniforme branco.");
		photo3.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15900837.jpg ");
		photo3.put("date","17/06/1950");
		jsonArray.add(photo3);

		JSONObject photo4 = new JSONObject();
		photo4.put("id", 4l);
		photo4.put("title", "A Laranja Mec�nica");
		photo4.put("url", "http://diariogaucho.rbsdirect.com.br/imagesrc/16058917.jpg?w=620");
		photo4.put("description", "A sele��o holandesa da �poca ficou conhecida por seu estilo diferenciado e ofensivo de jogar na Copa do Mundo.");
		photo4.put("image", "http://diariogaucho.rbsdirect.com.br/imagesrc/16058917.jpg?w=620");
		photo4.put("date"," ");
		jsonArray.add(photo4);

		JSONObject photo5 = new JSONObject();
		photo5.put("id", 5l);
		photo5.put("title", "Cafu levanta a ta�a do t�tulo da copa em 2002");
		photo5.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/14274784.jpg");
		photo5.put("description", "Sele��o brasileira, treinada por Felip�o, conquista o t�tulo da Copa do Mundo de 2002 ap�s vit�ria sobre a Alemanha.");
		photo5.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/14274784.jpg");
		photo5.put("date"," ");
		jsonArray.add(photo5);

		JSONObject photo6 = new JSONObject();
		photo6.put("id", 6l);
		photo6.put("title", "Terremoto atinge Indon�sia");
		photo6.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/13296036.jpg");
		photo6.put("description", "Terremoto de 8,6 graus atinge Indon�sia e alerta de tsunami � emitido. O desastre deixou a popula��o at�nita com as repentinas mudan�as clim�ticas.");
		photo6.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/13296036.jpg");
		photo6.put("date","20/10/2001");
		jsonArray.add(photo6);

		JSONObject photo7 = new JSONObject();
		photo7.put("id", 7l);
		photo7.put("title", "Jap�o sofre com o p�s tsunami");
		photo7.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10603069.jpg");
		photo7.put("description", "Moradores de Sendai na prov�ncia de Miyagi circulam pela cidade com m�scaras ainda temendo problemas com os riscos da radioatividade. O desastre transformou a paisagem do pa�s.");
		photo7.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10603069.jpg");
		photo7.put("date"," ");
		jsonArray.add(photo7);

		JSONObject photo8 = new JSONObject();
		photo8.put("id", 8l);
		photo8.put("title", "Terremoto nas Filipinas provoca 73 mortes");
		photo8.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15729185.jpg ");
		photo8.put("description", "A Organiza��o Mundial da Sa�de (OMS) classificou com categoria tr�s, o n�vel mais elevado, o desastre provocado pelo tuf�o Haiyan na regi�o central das Filipinas, onde centenas de milhares de pessoas t�m dificuldades de acesso a alimentos e �gua.");
		photo8.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15729185.jpg");
		photo8.put("date"," ");
		jsonArray.add(photo8);

		JSONObject photo9 = new JSONObject();
		photo9.put("id", 9l);
		photo9.put("title", "Terremoto de 8,9 graus na escala Richter causa, ao menos, 90 mortes no Jap�o");
		photo9.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10527794.jpg?w=620");
		photo9.put("description", "m forte terremoto atingiu a costa do Jap�o nesta sexta-feira seguido por um enorme tsunami e o desastre causou a morte de pelo menos 90 pessoas, segundo novo balan�o da pol�cia nacional. O tremor de terra atingiu 8,9 graus de magnitude na escala Richter. Pelo menos 56 pessoas est�o desaparecidas e outras 241 ficaram feridas. Em uma praia de Sendai, uma das cidades japonesas mais afetadas pelo tsunami, entre 200 e 300 corpos foram encontrados pela pol�cia.");
		photo9.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10527794.jpg?w=620");
		photo9.put("date"," ");
		jsonArray.add(photo9);

		JSONObject photo10 = new JSONObject();
		photo10.put("id", 10l);
		photo10.put("title", "Terremoto devasta o Paquist�o e deixa mais de 300 mortos");
		photo10.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15643359.jpg");
		photo10.put("description", "O terremoto, de 7,8 graus na escala Richter e cujo epicentro se situou em uma regi�o do Ir� pr�xima � fronteira com o Paquist�o, p�de ser sentido em pelo menos 20 cidades paquistanesas, especialmente no sudoeste do pa�s. Em Karachi, a cidade mais povoada do Paquist�o, com 18 milh�es de habitantes, foram evacuados diversos edif�cios. A queda de um muro no bairro de Liyari deixou quatro pessoas feridas, de acordo com a NDMA. A not�cia do desastre j� se espalhou pelo mundo e atraiu aten��o de diversas ONGS e institui��es, que j� enviam ajuda.");
		photo10.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15643359.jpg");
		photo10.put("date"," ");
		jsonArray.add(photo10);

		JSONObject photo11 = new JSONObject();
		photo11.put("id", 11l);
		photo11.put("title", "Smartwacthes s�o uma tend�ncia");
		photo11.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16218901.jpg");
		photo11.put("description", "A principal mudan�a em rela��o aos smartwatches da primeira gera��o � que os aparelhos n�o utilizam mais o sistema operacional Android, mas o Tizen, criado pela pr�pria Samsung. A tecnologia envolve conex�o com os aparelhos da pr�pria marca.");
		photo11.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16218901.jpg");
		photo11.put("date"," ");
		jsonArray.add(photo11);

		JSONObject photo12 = new JSONObject();
		photo12.put("id", 12l);
		photo12.put("title", "Confira a evolu��o do iPhone da Apple");
		photo12.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15577468.jpg");
		photo12.put("description", "O iPhone revolucionou a ind�stria dos telefones com seu sistema operacional simples e seu design elegante. A tecnologia do telefone criado pela Apple mudou a forma como as pessoas interagem com os aparelhos telef�nicos.");
		photo12.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15577468.jpg");
		photo12.put("date"," ");
		jsonArray.add(photo12);

		JSONObject photo13 = new JSONObject();
		photo13.put("id", 13l);
		photo13.put("title", "Primeiros investimentos em esta��es de trabalho");
		photo13.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442018.jpg");
		photo13.put("description", "974 - Pesquisadores da Xerox apresentam o Alto, primeira esta��o de trabalho, cujas caracter�sticas - monitor, teclado e mouse - foram incorporadas aos PCs atuais. A tecnologia serviu de inspira��o para a cria��o de outros computadores.");
		photo13.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442018.jpg");
		photo13.put("date"," ");
		jsonArray.add(photo13);

		JSONObject photo14 = new JSONObject();
		photo14.put("id", 14l);
		photo14.put("title", "O TV Typewriter, de Don Lancaster, era utilizado com um televisor como monitor e custava US$ 120");
		photo14.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442029.jpg");
		photo14.put("description", "O TV Typewriter, de Don Lancaster, foi uma grande novidade tecnol�gica para a �poca, era utilizado com um televisor como monitor e custava US$ 120. A tecnologia evoluiu muito, desde ent�o.");
		photo14.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442029.jpg");
		photo14.put("date"," ");
		jsonArray.add(photo14);

		JSONObject photo15 = new JSONObject();
		photo15.put("id", 15l);
		photo15.put("title", "Primeiro computador port�til.");
		photo15.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442017.jpg");
		photo15.put("description", "Adam Osborne completou a primeira inven��o tecnol�gica mais pr�xima de um computador port�til, o Osborne I. Com entradas para as tecnologias existentes, como disquetes e teclado incorporado � tampa, tamb�m tinha o conceito de tudo em um. ");
		photo15.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442017.jpg");
		photo15.put("date"," ");
		jsonArray.add(photo15);

		JSONObject photo16 = new JSONObject();
		photo16.put("id", 16l);
		photo16.put("title", "Aos 81 anos, morre o ator Paulo Goulart");
		photo16.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16279861.jpg?w=620");
		photo16.put("description", "Paulo Goulart morreu em S�o Paulo, nesta quinta-feira (13/3), aos 81 anos. Ele lutava h� seis anos contra um c�ncer que come�ou nos rins. Em 2012, descobriu-se uma met�stase para os ossos e o mediastino. O ator estava internado desde 8 de janeiro na Cl�nica S�o Jos�, em S�o Paulo. O enterro ser� no Cemit�rio da Consola��o, tamb�m em S�o Paulo, e o vel�rio deve ocorrer no Teatro Municipal. ");
		photo16.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16279861.jpg?w=620");
		photo16.put("date","13/03/2014");
		jsonArray.add(photo16);

		JSONObject photo17 = new JSONObject();
		photo17.put("id", 17l);
		photo17.put("title", "Darth Vader � inspira��o para vil�o de \"Al�m do Horizonte\"");
		photo17.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16245275.jpg?w=620");
		photo17.put("description", "O ator Antonio Calloni tem buscado no cinema inpira��o para seu personagem da novela Al�m do Horizonte (Globo). O ator revelou nesta segunda-feira ao portal F5 acreditar que L. C. Barcelos � um vil�o at�pico, algu�m que foi seduzido pelo \"lado negro da for�a\", assim como Darth Vader, de Star Wars (Guerra nas Estrelas).");
		photo17.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16245275.jpg?w=620");
		photo17.put("date","03/03/2014");
		jsonArray.add(photo17);

		JSONObject photo18 = new JSONObject();
		photo18.put("id", 18l);
		photo18.put("title", "Gabriel Braga Nunes causa tanto mal-estar nos bastidores de \"Em Fam�lia\" que Laerte pode morrer");
		photo18.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16297742.jpg?w=620");
		photo18.put("description", "Com fama de temperamental e pouco soci�vel, o ator Gabriel Braga Nunes tem causado problemas nos bastidores da novela Em Fam�lia. Segundo o jornal Extra, o int�rprete do flautista Laerte n�o cumprimenta os colegas e reclama de tudo. J� o colunista Ricardo Feltrin, do Uol, relatou que a atmosfera nas grava��es est� t�o pesada que a emissora considera resolver a quest�o \"matando\" o personagem Laerte. Outra op��o seria reduzir o n�mero de cenas e a relev�ncia do papel.");
		photo18.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16297742.jpg?w=620");
		photo18.put("date","21/03/2014");
		jsonArray.add(photo18);

		JSONObject photo19 = new JSONObject();
		photo19.put("id", 19l);
		photo19.put("title", "Irm�os Coragem � lan�ada em DVD pela Globo Marcas");
		photo19.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10782875.jpg?w=620");
		photo19.put("description", "Em 1970, a descoberta de um diamante transformou a vida de tr�s irm�os � e a hist�ria da TV no Brasil. Ao criar a trama de Irm�os Coragem, Janete Clair marcou a teledramaturgia e arrebatou os brasileiros, incluindo o p�blico masculino, que pela primeira vez aderiu em massa a um folhetim, lan�ando um novo panorama de consumo de novelas.");
		photo19.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10782875.jpg?w=620");
		photo19.put("date","13/04/2011");
		jsonArray.add(photo19);

		JSONObject photo20 = new JSONObject();
		photo20.put("id", 20l);
		photo20.put("title", "10 remakes da teledramaturgia que podem vir por a�");
		photo20.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/14039041.jpg?w=620");
		photo20.put("description", "O que n�o falta no mundo do entretenimento s�o projetos sobre futuras produ��es de teledramaturgia _ e neste pacote incluem-se os remakes de tramas j� exibidas nos canais com grande sucesso. O Segundo Caderno faz um apanhado de novelas cujas hist�rias est�o sendo estudadas para ganhar novas vers�es em breve e outras que j� est�o com produ��o em andamento. Confira a lista e veja se realmente vale a pena ver de novo as seguintes 10 novelas:");
		photo20.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/14039041.jpg?w=620");
		photo20.put("date"," ");
		jsonArray.add(photo20);

		JSONObject photo21 = new JSONObject();
		photo21.put("id", 21l);
		photo21.put("title", "Joaquim Barbosa: negro, popular e agora presidente do Supremo");
		photo21.put("url", "http://www.clicrbs.com.br/rbs/image/14211224.jpg?w=600");
		photo21.put("description", "Joaquim Barbosa se torna presidente do supremo. Ele ficou bastante popular ap�s o julgamento do Mensal�o.");
		photo21.put("image", "http://www.clicrbs.com.br/rbs/image/14211224.jpg?w=600");
		photo21.put("date","17/11/2012");
		jsonArray.add(photo21);

		JSONObject photo22 = new JSONObject();
		photo22.put("id", 22l);
		photo22.put("title", "R�u do mensal�o, Genoino cita m�sica de Chico Buarque em recurso ao STF");
		photo22.put("url", "http://www.clicrbs.com.br/rbs/image/15836385.jpg?w=600");
		photo22.put("description", "Um dos condenados no processo do mensal�o, o deputado licenciado Jos� Geno�no (PT-SP) enviou nesta sexta-feira ao Supremo Tribunal Federal (STF) recurso contra a decis�o da Corte. Em 25 p�ginas, sua defesa cita Chico Buarque e chama de ing�nuo quem acreditou na hist�ria de compra de apoio parlamentar no primeiro governo de Luiz In�cio Lula da Silva.");
		photo22.put("image", "http://www.clicrbs.com.br/rbs/image/15836385.jpg?w=600");
		photo22.put("date","08/11/2013");
		jsonArray.add(photo22);

		JSONObject photo23 = new JSONObject();
		photo23.put("id", 23l);
		photo23.put("title", "Laudo aponta que Roberto Jefferson, delator do mensal�o, n�o necessita de pris�o domiciliar");
		photo23.put("url", "http://www.clicrbs.com.br/rbs/image/15728730.jpg?w=600");
		photo23.put("description", "Requisitado pelo Supremo Tribunal Federal (STF), o exame m�dico para avaliar a sa�de do ex-deputado Roberto Jefferson (PTB-RJ) aponta que n�o h� necessidade de o delator do mensal�o cumprir pris�o domiciliar pela pena a qual foi condenado. A informa��o � da Globo News.");
		photo23.put("image", "http://www.clicrbs.com.br/rbs/image/15728730.jpg?w=600");
		photo23.put("date","08/12/2013");
		jsonArray.add(photo23);

		JSONObject photo24 = new JSONObject();
		photo24.put("id", 24l);
		photo24.put("title", "Para Gilmar Mendes, julgamento do mensal�o \"caminha para o final devido\" ");
		photo24.put("url", "http://www.clicrbs.com.br/rbs/image/15874397.jpg?w=600");
		photo24.put("description", "Em entrevista � R�dio Ga�cha, na manh� desta segunda-feira, o ex-presidente do Supremo Tribunal Federal (STF), ministro Gilmar Mendes, disse acreditar que o julgamento do mensal�o \"est� caminhando para o final devido\".");
		photo24.put("image", "http://www.clicrbs.com.br/rbs/image/15874397.jpg?w=600");
		photo24.put("date"," ");
		jsonArray.add(photo24);

		JSONObject photo25 = new JSONObject();
		photo25.put("id", 25l);
		photo25.put("title", "Luiz Fux promete colocar embargos do mensal�o em vota��o t�o logo as partes se manifestem");
		photo25.put("url", "http://www.clicrbs.com.br/rbs/image/15614373.jpg?w=600");
		photo25.put("description", "O ministro do Supremo Tribunal Federal (STF) Luiz Fux, relator da etapa do julgamento do mensal�o que analisar� os embargos infringentes apresentados pelos r�us, promete celeridade no andamento do processo.");
		photo25.put("image", "http://www.clicrbs.com.br/rbs/image/15614373.jpg?w=600");
		photo25.put("date"," ");
		jsonArray.add(photo25);
		
		return jsonArray;
	}
	
}
