package br.com.timemachine.controller;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Classe com implementações para interface de busca
 * @author Isaias_Alves
 * @version hackathon_0.1b
 */
public class SearchCriteria {

	/**
	 * Executa uma formação e filtragem dos resultados de busca (formata as datas ajusta o retorno, quebra
	 * a descrição). Recebe o array do repositório e ajusta ele É uma espécie de máscara para resultados.
	 * @param array
	 * @return
	 */
	public JSONArray filterDataByQuery( final String query, final JSONArray array ) {
		JSONArray returnedArray = new JSONArray();
		for (Object object : array) {
			JSONObject arrayItem = (JSONObject) object;
			try {
				if (arrayItem.get("description").toString().toLowerCase().contains(query.toLowerCase())) {
					
					// Corta os caracteres em 300
					String descriptionText = arrayItem.get("description").toString();
					if (descriptionText.length() >= 300) {
						descriptionText = descriptionText.substring(0, 300 ) + "...";
					}
					
					/* Formata o campo data */
					try {					
						  Date date = new SimpleDateFormat("dd/MM/yyyy").parse(arrayItem.get("date").toString());
						  DateFormat df = new SimpleDateFormat("MMMM");   
						  Locale BRAZIL = new Locale("pt","BR");     
						  df = DateFormat.getDateInstance(DateFormat.LONG, BRAZIL);
						  arrayItem.put("textdate",df.format(date));
					} catch (Exception e) { e.printStackTrace();}
					
					arrayItem.put("description", removeHTMLTags(descriptionText));
					returnedArray.add(arrayItem);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return returnedArray;
	}
	
	/**
	 * Remove TAGs html dos dados a serem filtrados.
	 * @param text texto cujas tags deverão ser removidas
	 * @return String pronta
	 */
	private String removeHTMLTags(final String text) {
        if (text == null) {
               return null;
        }
        Reader reader = new StringReader(text);
        final StringBuilder result = new StringBuilder();
        try {
               new ParserDelegator().parse(reader, new HTMLEditorKit.ParserCallback() {
                      public void handleText(char[] data, int pos) {
                             result.append(new String(data));
                      }
               }, false);
        } catch (IOException e) {
        }
        return result.toString();
  }

}
