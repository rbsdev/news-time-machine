package br.com.timmachine.util;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * Classe utilitária contendo funcionalidades de IO específicas
 * do projeto de Edições digitais, essas funcionalidades deverão
 * ser relacionadas dentro dos sistemas que por ventura possuam a 
 * necessidade de sua utilização. Ex: Se sistema X ou Y necessitar
 * gravar um arquivo JSON, o código que possui essa responsabilidade
 * deverá fazer utilização do utilitário de IO descrito nesta
 * implementação @see "writeToFile"
 * @author Isaias_Alves
 * @version 1.0
 */
public class IOUtil {

	/**
	 * Grava no filesystem o conteúdo de arquivo (JSON ou outro).
	 * Encaminha verificação de tempo de gravação.
	 * @param content Conteúdo do arquivo
	 * @param filepathRootOutput diretorio
	 * @param fileName nome do arquivo
	 * @throws IOException 
	 * @throws Exception possível erro ocorrido durante a gravação
	 */
	public void writeToFile( final String content, final String filepathRootOutput, String fileName) throws IOException {
		
		File directory = new File( filepathRootOutput );
		
		if (!directory.exists()) {
			directory.mkdirs();
		}

		final String destFilename = filepathRootOutput + fileName;
		File fileTemp = new File( destFilename  );
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream( content.getBytes() );
		this.writeToFile( inputStream , fileTemp);
		
	}
	
	/**
	 * Efetua gravação de inputstream em arquivo 
	 * @param inputStream inpustream recebido para gravar obs: a responsabilidade por fechar será do chamador
	 * @param file
	 * @throws IOException
	 */
	public void writeToFile(final InputStream inputStream, final File file) throws IOException {
		
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
		int read = 0;
		byte[] bytes = new byte[1024];
	
		while ((read = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, read);
		}
		
		outputStream.close();
		
		PrintWriter out = new PrintWriter(
				new OutputStreamWriter(new FileOutputStream(file), "UTF-8"), true);
		
		out.print( outputStream);
      
        out.flush();
        out.close();
       
	}
	
	public String getTextFromURL(String url) throws Exception {
		return getTextFromURL(url,"UTF-8");
	}
	
	/**
	 * Método responsável por efetuar leitura de uma URL http e retornar o texto
	 * desta URL.
	 * @param url url que será conectada.
	 * @return String com o texto da URL
	 * @throws Exception
	 */
	public String getTextFromFile(String file, final String charsetName) throws Exception {
    
     
        BufferedReader in = new BufferedReader( new InputStreamReader( new FileInputStream(file) ,charsetName ));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();

        return response.toString();
    }
	
	
	/**
	 * Método responsável por efetuar leitura de uma URL http e retornar o texto
	 * desta URL.
	 * @param url url que será conectada.
	 * @return String com o texto da URL
	 * @throws Exception
	 */
	public String getTextFromURL(String url, final String charsetName) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream(),charsetName ));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();

        return response.toString();
    }

	/**
	 * Efetua a cópia de um arquivo para o outro
	 * @param source Arquivo de origem
	 * @param dest arquivo de destino
	 * @throws IOException Erro ocorrido durante a cópia
	 */
	public void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
	

}
