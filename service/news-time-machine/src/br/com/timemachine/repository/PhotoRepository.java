package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Implementa o repositório de fotos do sistema
 * possui implementação estática, requer implementação final posterior
 * deve ser usada apenas como esboço e esclarecer os conectores (é um esqueleto).
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PhotoRepository {

	/**
	 * Realiza a entrega dos dados estáticos digitados pela redação na hackathon.
	 * @return Objeto array contendo os dados estáticos.
	 */
	public JSONArray findAllStaticPhotos() {
		JSONArray jsonArray = new JSONArray();
		
		JSONObject photo1 = new JSONObject();
		photo1.put("id", 1l);
		photo1.put("title", "Brasil e França na Copa de 1938");
		photo1.put("url", "http://diariogaucho.rbsdirect.com.br/imagesrc/16037024.jpg?w=620");
		photo1.put("description", "Lance do jogo Brasil, de branco, e França na Copa do Mundo de 1938 em que os brasileiros ficaram em terceiro lugar.");
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
		photo3.put("description", "Antes da amarelinha ser \"A\" amarelinha, a seleção brasileira já teve uniforme branco.");
		photo3.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15900837.jpg ");
		photo3.put("date","17/06/1950");
		jsonArray.add(photo3);

		JSONObject photo4 = new JSONObject();
		photo4.put("id", 4l);
		photo4.put("title", "A Laranja Mecânica");
		photo4.put("url", "http://diariogaucho.rbsdirect.com.br/imagesrc/16058917.jpg?w=620");
		photo4.put("description", "A seleção holandesa da época ficou conhecida por seu estilo diferenciado e ofensivo de jogar na Copa do Mundo.");
		photo4.put("image", "http://diariogaucho.rbsdirect.com.br/imagesrc/16058917.jpg?w=620");
		photo4.put("date"," ");
		jsonArray.add(photo4);

		JSONObject photo5 = new JSONObject();
		photo5.put("id", 5l);
		photo5.put("title", "Cafu levanta a taça do título da copa em 2002");
		photo5.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/14274784.jpg");
		photo5.put("description", "Seleção brasileira, treinada por Felipão, conquista o título da Copa do Mundo de 2002 após vitória sobre a Alemanha.");
		photo5.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/14274784.jpg");
		photo5.put("date"," ");
		jsonArray.add(photo5);

		JSONObject photo6 = new JSONObject();
		photo6.put("id", 6l);
		photo6.put("title", "Terremoto atinge Indonésia");
		photo6.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/13296036.jpg");
		photo6.put("description", "Terremoto de 8,6 graus atinge Indonésia e alerta de tsunami é emitido. O desastre deixou a população atônita com as repentinas mudanças climáticas.");
		photo6.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/13296036.jpg");
		photo6.put("date","20/10/2001");
		jsonArray.add(photo6);

		JSONObject photo7 = new JSONObject();
		photo7.put("id", 7l);
		photo7.put("title", "Japão sofre com o pós tsunami");
		photo7.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10603069.jpg");
		photo7.put("description", "Moradores de Sendai na província de Miyagi circulam pela cidade com máscaras ainda temendo problemas com os riscos da radioatividade. O desastre transformou a paisagem do país.");
		photo7.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10603069.jpg");
		photo7.put("date"," ");
		jsonArray.add(photo7);

		JSONObject photo8 = new JSONObject();
		photo8.put("id", 8l);
		photo8.put("title", "Terremoto nas Filipinas provoca 73 mortes");
		photo8.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15729185.jpg ");
		photo8.put("description", "A Organização Mundial da Saúde (OMS) classificou com categoria três, o nível mais elevado, o desastre provocado pelo tufão Haiyan na região central das Filipinas, onde centenas de milhares de pessoas têm dificuldades de acesso a alimentos e água.");
		photo8.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15729185.jpg");
		photo8.put("date"," ");
		jsonArray.add(photo8);

		JSONObject photo9 = new JSONObject();
		photo9.put("id", 9l);
		photo9.put("title", "Terremoto de 8,9 graus na escala Richter causa, ao menos, 90 mortes no Japão");
		photo9.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10527794.jpg?w=620");
		photo9.put("description", "m forte terremoto atingiu a costa do Japão nesta sexta-feira seguido por um enorme tsunami e o desastre causou a morte de pelo menos 90 pessoas, segundo novo balanço da polícia nacional. O tremor de terra atingiu 8,9 graus de magnitude na escala Richter. Pelo menos 56 pessoas estão desaparecidas e outras 241 ficaram feridas. Em uma praia de Sendai, uma das cidades japonesas mais afetadas pelo tsunami, entre 200 e 300 corpos foram encontrados pela polícia.");
		photo9.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10527794.jpg?w=620");
		photo9.put("date"," ");
		jsonArray.add(photo9);

		JSONObject photo10 = new JSONObject();
		photo10.put("id", 10l);
		photo10.put("title", "Terremoto devasta o Paquistão e deixa mais de 300 mortos");
		photo10.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15643359.jpg");
		photo10.put("description", "O terremoto, de 7,8 graus na escala Richter e cujo epicentro se situou em uma região do Irã próxima à fronteira com o Paquistão, pôde ser sentido em pelo menos 20 cidades paquistanesas, especialmente no sudoeste do país. Em Karachi, a cidade mais povoada do Paquistão, com 18 milhões de habitantes, foram evacuados diversos edifícios. A queda de um muro no bairro de Liyari deixou quatro pessoas feridas, de acordo com a NDMA. A notícia do desastre já se espalhou pelo mundo e atraiu atenção de diversas ONGS e instituições, que já enviam ajuda.");
		photo10.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15643359.jpg");
		photo10.put("date"," ");
		jsonArray.add(photo10);

		JSONObject photo11 = new JSONObject();
		photo11.put("id", 11l);
		photo11.put("title", "Smartwacthes são uma tendência");
		photo11.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16218901.jpg");
		photo11.put("description", "A principal mudança em relação aos smartwatches da primeira geração é que os aparelhos não utilizam mais o sistema operacional Android, mas o Tizen, criado pela própria Samsung. A tecnologia envolve conexão com os aparelhos da própria marca.");
		photo11.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16218901.jpg");
		photo11.put("date"," ");
		jsonArray.add(photo11);

		JSONObject photo12 = new JSONObject();
		photo12.put("id", 12l);
		photo12.put("title", "Confira a evolução do iPhone da Apple");
		photo12.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/15577468.jpg");
		photo12.put("description", "O iPhone revolucionou a indústria dos telefones com seu sistema operacional simples e seu design elegante. A tecnologia do telefone criado pela Apple mudou a forma como as pessoas interagem com os aparelhos telefônicos.");
		photo12.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/15577468.jpg");
		photo12.put("date"," ");
		jsonArray.add(photo12);

		JSONObject photo13 = new JSONObject();
		photo13.put("id", 13l);
		photo13.put("title", "Primeiros investimentos em estações de trabalho");
		photo13.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442018.jpg");
		photo13.put("description", "974 - Pesquisadores da Xerox apresentam o Alto, primeira estação de trabalho, cujas características - monitor, teclado e mouse - foram incorporadas aos PCs atuais. A tecnologia serviu de inspiração para a criação de outros computadores.");
		photo13.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442018.jpg");
		photo13.put("date"," ");
		jsonArray.add(photo13);

		JSONObject photo14 = new JSONObject();
		photo14.put("id", 14l);
		photo14.put("title", "O TV Typewriter, de Don Lancaster, era utilizado com um televisor como monitor e custava US$ 120");
		photo14.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442029.jpg");
		photo14.put("description", "O TV Typewriter, de Don Lancaster, foi uma grande novidade tecnológica para a época, era utilizado com um televisor como monitor e custava US$ 120. A tecnologia evoluiu muito, desde então.");
		photo14.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442029.jpg");
		photo14.put("date"," ");
		jsonArray.add(photo14);

		JSONObject photo15 = new JSONObject();
		photo15.put("id", 15l);
		photo15.put("title", "Primeiro computador portátil.");
		photo15.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/8442017.jpg");
		photo15.put("description", "Adam Osborne completou a primeira invenção tecnológica mais próxima de um computador portátil, o Osborne I. Com entradas para as tecnologias existentes, como disquetes e teclado incorporado à tampa, também tinha o conceito de tudo em um. ");
		photo15.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/8442017.jpg");
		photo15.put("date"," ");
		jsonArray.add(photo15);

		JSONObject photo16 = new JSONObject();
		photo16.put("id", 16l);
		photo16.put("title", "Aos 81 anos, morre o ator Paulo Goulart");
		photo16.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16279861.jpg?w=620");
		photo16.put("description", "Paulo Goulart morreu em São Paulo, nesta quinta-feira (13/3), aos 81 anos. Ele lutava há seis anos contra um câncer que começou nos rins. Em 2012, descobriu-se uma metástase para os ossos e o mediastino. O ator estava internado desde 8 de janeiro na Clínica São José, em São Paulo. O enterro será no Cemitério da Consolação, também em São Paulo, e o velório deve ocorrer no Teatro Municipal. ");
		photo16.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16279861.jpg?w=620");
		photo16.put("date","13/03/2014");
		jsonArray.add(photo16);

		JSONObject photo17 = new JSONObject();
		photo17.put("id", 17l);
		photo17.put("title", "Darth Vader é inspiração para vilão de \"Além do Horizonte\"");
		photo17.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16245275.jpg?w=620");
		photo17.put("description", "O ator Antonio Calloni tem buscado no cinema inpiração para seu personagem da novela Além do Horizonte (Globo). O ator revelou nesta segunda-feira ao portal F5 acreditar que L. C. Barcelos é um vilão atípico, alguém que foi seduzido pelo \"lado negro da força\", assim como Darth Vader, de Star Wars (Guerra nas Estrelas).");
		photo17.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16245275.jpg?w=620");
		photo17.put("date","03/03/2014");
		jsonArray.add(photo17);

		JSONObject photo18 = new JSONObject();
		photo18.put("id", 18l);
		photo18.put("title", "Gabriel Braga Nunes causa tanto mal-estar nos bastidores de \"Em Família\" que Laerte pode morrer");
		photo18.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/16297742.jpg?w=620");
		photo18.put("description", "Com fama de temperamental e pouco sociável, o ator Gabriel Braga Nunes tem causado problemas nos bastidores da novela Em Família. Segundo o jornal Extra, o intérprete do flautista Laerte não cumprimenta os colegas e reclama de tudo. Já o colunista Ricardo Feltrin, do Uol, relatou que a atmosfera nas gravações está tão pesada que a emissora considera resolver a questão \"matando\" o personagem Laerte. Outra opção seria reduzir o número de cenas e a relevância do papel.");
		photo18.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/16297742.jpg?w=620");
		photo18.put("date","21/03/2014");
		jsonArray.add(photo18);

		JSONObject photo19 = new JSONObject();
		photo19.put("id", 19l);
		photo19.put("title", "Irmãos Coragem é lançada em DVD pela Globo Marcas");
		photo19.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/10782875.jpg?w=620");
		photo19.put("description", "Em 1970, a descoberta de um diamante transformou a vida de três irmãos — e a história da TV no Brasil. Ao criar a trama de Irmãos Coragem, Janete Clair marcou a teledramaturgia e arrebatou os brasileiros, incluindo o público masculino, que pela primeira vez aderiu em massa a um folhetim, lançando um novo panorama de consumo de novelas.");
		photo19.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/10782875.jpg?w=620");
		photo19.put("date","13/04/2011");
		jsonArray.add(photo19);

		JSONObject photo20 = new JSONObject();
		photo20.put("id", 20l);
		photo20.put("title", "10 remakes da teledramaturgia que podem vir por aí");
		photo20.put("url", "http://zerohora.rbsdirect.com.br/imagesrc/14039041.jpg?w=620");
		photo20.put("description", "O que não falta no mundo do entretenimento são projetos sobre futuras produções de teledramaturgia _ e neste pacote incluem-se os remakes de tramas já exibidas nos canais com grande sucesso. O Segundo Caderno faz um apanhado de novelas cujas histórias estão sendo estudadas para ganhar novas versões em breve e outras que já estão com produção em andamento. Confira a lista e veja se realmente vale a pena ver de novo as seguintes 10 novelas:");
		photo20.put("image", "http://zerohora.rbsdirect.com.br/imagesrc/14039041.jpg?w=620");
		photo20.put("date"," ");
		jsonArray.add(photo20);

		JSONObject photo21 = new JSONObject();
		photo21.put("id", 21l);
		photo21.put("title", "Joaquim Barbosa: negro, popular e agora presidente do Supremo");
		photo21.put("url", "http://www.clicrbs.com.br/rbs/image/14211224.jpg?w=600");
		photo21.put("description", "Joaquim Barbosa se torna presidente do supremo. Ele ficou bastante popular após o julgamento do Mensalão.");
		photo21.put("image", "http://www.clicrbs.com.br/rbs/image/14211224.jpg?w=600");
		photo21.put("date","17/11/2012");
		jsonArray.add(photo21);

		JSONObject photo22 = new JSONObject();
		photo22.put("id", 22l);
		photo22.put("title", "Réu do mensalão, Genoino cita música de Chico Buarque em recurso ao STF");
		photo22.put("url", "http://www.clicrbs.com.br/rbs/image/15836385.jpg?w=600");
		photo22.put("description", "Um dos condenados no processo do mensalão, o deputado licenciado José Genoíno (PT-SP) enviou nesta sexta-feira ao Supremo Tribunal Federal (STF) recurso contra a decisão da Corte. Em 25 páginas, sua defesa cita Chico Buarque e chama de ingênuo quem acreditou na história de compra de apoio parlamentar no primeiro governo de Luiz Inácio Lula da Silva.");
		photo22.put("image", "http://www.clicrbs.com.br/rbs/image/15836385.jpg?w=600");
		photo22.put("date","08/11/2013");
		jsonArray.add(photo22);

		JSONObject photo23 = new JSONObject();
		photo23.put("id", 23l);
		photo23.put("title", "Laudo aponta que Roberto Jefferson, delator do mensalão, não necessita de prisão domiciliar");
		photo23.put("url", "http://www.clicrbs.com.br/rbs/image/15728730.jpg?w=600");
		photo23.put("description", "Requisitado pelo Supremo Tribunal Federal (STF), o exame médico para avaliar a saúde do ex-deputado Roberto Jefferson (PTB-RJ) aponta que não há necessidade de o delator do mensalão cumprir prisão domiciliar pela pena a qual foi condenado. A informação é da Globo News.");
		photo23.put("image", "http://www.clicrbs.com.br/rbs/image/15728730.jpg?w=600");
		photo23.put("date","08/12/2013");
		jsonArray.add(photo23);

		JSONObject photo24 = new JSONObject();
		photo24.put("id", 24l);
		photo24.put("title", "Para Gilmar Mendes, julgamento do mensalão \"caminha para o final devido\" ");
		photo24.put("url", "http://www.clicrbs.com.br/rbs/image/15874397.jpg?w=600");
		photo24.put("description", "Em entrevista à Rádio Gaúcha, na manhã desta segunda-feira, o ex-presidente do Supremo Tribunal Federal (STF), ministro Gilmar Mendes, disse acreditar que o julgamento do mensalão \"está caminhando para o final devido\".");
		photo24.put("image", "http://www.clicrbs.com.br/rbs/image/15874397.jpg?w=600");
		photo24.put("date"," ");
		jsonArray.add(photo24);

		JSONObject photo25 = new JSONObject();
		photo25.put("id", 25l);
		photo25.put("title", "Luiz Fux promete colocar embargos do mensalão em votação tão logo as partes se manifestem");
		photo25.put("url", "http://www.clicrbs.com.br/rbs/image/15614373.jpg?w=600");
		photo25.put("description", "O ministro do Supremo Tribunal Federal (STF) Luiz Fux, relator da etapa do julgamento do mensalão que analisará os embargos infringentes apresentados pelos réus, promete celeridade no andamento do processo.");
		photo25.put("image", "http://www.clicrbs.com.br/rbs/image/15614373.jpg?w=600");
		photo25.put("date"," ");
		jsonArray.add(photo25);
		
		return jsonArray;
	}
	
}
