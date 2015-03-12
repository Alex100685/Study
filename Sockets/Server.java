package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;


public class Server {

	public static void main(String[] args) throws IOException {
		
		
		ServerSocket serverSocket = new ServerSocket(2000);
		
		System.out.println("Server is waiting for request...");
		
		Socket socket = serverSocket.accept();
		
		InputStream input = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(input);
		BufferedReader inBuff = new BufferedReader(isr);
		
		OutputStream out = socket.getOutputStream();
		int count=0;
		
		String socketRequest;
		while (true){
			
		socketRequest = inBuff.readLine();
		
		try{
		if (socketRequest.endsWith("systemInf")){
			count++;
			out.write(("Pentium 4 2.4 GzH, Op mem. 2 Gb, Operation System Windows 7! Request NUMBER  "+count+"\n").getBytes());
			out.write(("done!").getBytes());
		}
		if (socketRequest.endsWith("stopServer")){
			break;
		}	
		}
		catch (Exception e){
			System.out.println("NO SUCH COMMAND");
		}	
	}
		inBuff.close();
		out.close();		
	}
}
