package exemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {

		System.out.println("Servidor iniciando...");
		
		ServerSocket server = null;
		
		Socket socket = abrirConexao(server, 1234);
		  
		String path = recebeDadosCliente(socket);
		String resposta = "Teste";
                
                
                Pagina p = null;
                
                p = Config.getPagina(path);
                resposta = p.getHTML();
                
		enviaRespostaAoCliente(socket, resposta);
	          
		
		
		System.out.println("Servidor finalizando...");
		

	}

	private static void enviaRespostaAoCliente(Socket socket, String resposta) {
		
            System.out.println("Enviando resposta ao cliente.");
            
                OutputStream outputStream;
		try {
			outputStream = socket.getOutputStream();
			PrintWriter outputWriter =
		            new PrintWriter(
		                new OutputStreamWriter( outputStream ));
	        
                outputWriter.println("HTTP/1.0 200 sucesso");
                //outputWriter.println("HTTP/1.0 302 Nao eh aqui");
                //outputWriter.println("Location: http://www.uniceub.br");
	        outputWriter.println(); // The empty line
	        
                outputWriter.println(resposta);
                
                
	        outputWriter.close();
	          socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String recebeDadosCliente(Socket socket) {
		try {
			
              //Prepara as classes para leitura dos dados   			
			  InputStream inputStream = socket.getInputStream();
			  InputStreamReader isReader = new InputStreamReader( inputStream );
			  BufferedReader inputReader = new BufferedReader( isReader );
			  
			  
			  System.out.println("Enviado pelo cliente:");
			  System.out.println("----------------------------------");
			  
			  //L� os dados at� o fim 
			  String lido = "";
                          
                          lido = inputReader.readLine();
                          String aux = lido.substring(lido.indexOf(" ")+2);
                          aux = aux.substring(0, aux.indexOf(" "));
                          
                          
			  do {
				  lido = inputReader.readLine();
                                  
                                  
                                  
				  System.out.println(lido); //Exibe o que foi recebido na tela
			  } while (!lido.equals(""));
			  
			  System.out.println("----------------------------------");
			  System.out.println("Fim do conteudo enviado pelo cliente.");
			  
                          return aux;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
                return "";
	}

	private static Socket abrirConexao(ServerSocket server, int porta) {
		try {
			 server = new ServerSocket( porta );  //Cria um novo Socket na porta informada
			 System.out.println("Servidor criado. Aguardando cliente na porta: " + porta);
			 Socket socket = server.accept();  //Interrompe a execu��o esperando um cliente
			 System.out.println("Cliente conectado.");
			 return socket;

		  } catch (IOException e) {
			  System.out.println("Erro ao receber conexao: " + e.getMessage());
			  e.printStackTrace();
		  }
		return null;
	}

}
