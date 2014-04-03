package br.com.timemachine.repository;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Repositório estático de PDF (usado como exemplo de como os dados devem trafegar)
 * não possui implementação definida, serve de esboço.
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class PdfRepository {

	/**
	 * Monta a lista com dados estáticos de PDF editados pela redação.
	 * @return
	 */
	public JSONArray findAllStaticPdfs() {
		
		JSONArray jsonArray = new JSONArray();
		
		JSONObject jornal1 = new JSONObject();
		jornal1.put("id", 1);
		jornal1.put("title", "Copa do Mundo de 1950");
		jornal1.put("description", "copa do mundo, copa de 1950, 1950, copa, eucaliptos, estádio dos eucaliptos");
		jornal1.put("image", "copa.jpg");
		jornal1.put("date","22/03/2014");
		jornal1.put("factdate","01/01/1950");
		jsonArray.add(jornal1);

		JSONObject jornal2 = new JSONObject();
		jornal2.put("id", 2);
		jornal2.put("title", "Copa do Mundo de 1950");
		jornal2.put("description", "copa do mundo, copa de 1950, 1950, copa, eucaliptos, estádio dos eucaliptos");
		jornal2.put("image", "copa.jpg");
		jornal2.put("date","22/03/2014");
		jornal2.put("factdate","01/01/1950");
		jsonArray.add(jornal2);

		JSONObject jornal3 = new JSONObject();
		jornal3.put("id", 3);
		jornal3.put("title", "Copa do Mundo de 1950");
		jornal3.put("description", "copa do mundo, copa de 1950, 1950, copa, eucaliptos, estádio dos eucaliptos");
		jornal3.put("image", "copa.jpg");
		jornal3.put("date","22/03/2013");
		jornal3.put("factdate","01/01/1950");
		jsonArray.add(jornal3);

		JSONObject jornal4 = new JSONObject();
		jornal4.put("id", 4);
		jornal4.put("title", "As lições do Catarina");
		jornal4.put("description", "desastre natural, desastres naturais, tornado, furacão, catarina");
		jornal4.put("image", "desastre.jpg");
		jornal4.put("date","22/03/2014");
		jornal4.put("factdate","27/03/2004");
		jsonArray.add(jornal4);

		JSONObject jornal5 = new JSONObject();
		jornal5.put("id", 5);
		jornal5.put("title", "As lições do Catarina");
		jornal5.put("description", "desastre natural, desastres naturais, tornado, furacão, catarina");
		jornal5.put("image", "desastre.jpg");
		jornal5.put("date","22/03/2014");
		jornal5.put("factdate","27/03/2004");
		jsonArray.add(jornal5);

		JSONObject jornal6 = new JSONObject();
		jornal6.put("id", 6);
		jornal6.put("title", "As lições do Catarina");
		jornal6.put("description", "desastre natural, desastres naturais, tornado, furacão, catarina");
		jornal6.put("image", "desastre.jpg");
		jornal6.put("date","22/03/2014");
		jornal6.put("factdate","27/03/2004");
		jsonArray.add(jornal6);

		JSONObject jornal7 = new JSONObject();
		jornal7.put("id", 7);
		jornal7.put("title", "Após regalia, Delúbio é transferido");
		jornal7.put("description", "mensalão, escândalo, política, delúbio soares");
		jornal7.put("image", "mensalão.jpg");
		jornal7.put("date","22/03/2014");
		jornal7.put("factdate","22/03/2014");
		jsonArray.add(jornal7);

		JSONObject jornal8 = new JSONObject();
		jornal8.put("id", 8);
		jornal8.put("title", "Após regalia, Delúbio é transferido");
		jornal8.put("description", "mensalão, escândalo, política, delúbio soares");
		jornal8.put("image", "mensalão.jpg");
		jornal8.put("date","22/03/2014");
		jornal8.put("factdate","22/03/2014");
		jsonArray.add(jornal8);

		JSONObject jornal9 = new JSONObject();
		jornal9.put("id", 9);
		jornal9.put("title", "Após regalia, Delúbio é transferido");
		jornal9.put("description", "mensalão, escândalo, política, delúbio soares");
		jornal9.put("image", "mensalão.jpg");
		jornal9.put("date","22/03/2014");
		jornal9.put("factdate","22/03/2014");
		jsonArray.add(jornal9);

		JSONObject jornal10 = new JSONObject();
		jornal10.put("id", 10);
		jornal10.put("title", "Vingativa até não poder mais");
		jornal10.put("description", "novela, novelas, ângela vieira, em família");
		jornal10.put("image", "novela.jpg");
		jornal10.put("date","09/03/2014");
		jornal10.put("factdate","09/03/2014");
		jsonArray.add(jornal10);

		JSONObject jornal11 = new JSONObject();
		jornal11.put("id", 11);
		jornal11.put("title", "Vingativa até não poder mais");
		jornal11.put("description", "novela, novelas, ângela vieira, em família");
		jornal11.put("image", "novela.jpg");
		jornal11.put("date","09/03/2014");
		jornal11.put("factdate","09/03/2014");
		jsonArray.add(jornal11);

		JSONObject jornal12 = new JSONObject();
		jornal12.put("id", 12);
		jornal12.put("title", "Vingativa até não poder mais");
		jornal12.put("description", "novela, novelas, ângela vieira, em família");
		jornal12.put("image", "novela.jpg");
		jornal12.put("date","09/03/2014");
		jornal12.put("factdate","09/03/2014");
		jsonArray.add(jornal12);

		JSONObject jornal13 = new JSONObject();
		jornal13.put("id", 13);
		jornal13.put("title", "Atrás de seu celular");
		jornal13.put("description", "ceular, telefone, smartphone, tecnologia");
		jornal13.put("image", "tecnologia.jpg");
		jornal13.put("date","02/03/2014");
		jornal13.put("factdate","02/03/2014");
		jsonArray.add(jornal13);

		JSONObject jornal14 = new JSONObject();
		jornal14.put("id", 14);
		jornal14.put("title", "Atrás de seu celular");
		jornal14.put("description", "ceular, telefone, smartphone, tecnologia");
		jornal14.put("image", "tecnologia.jpg");
		jornal14.put("date","02/03/2014");
		jornal14.put("factdate","02/03/2014");
		jsonArray.add(jornal14);

		JSONObject jornal15 = new JSONObject();
		jornal15.put("id", 15);
		jornal15.put("title", "Atrás de seu celular");
		jornal15.put("description", "ceular, telefone, smartphone, tecnologia");
		jornal15.put("image", "tecnologia.jpg");
		jornal15.put("date","02/03/2014");
		jornal15.put("factdate","02/03/2014");
		jsonArray.add(jornal15);
		
		return jsonArray;
	}

}
