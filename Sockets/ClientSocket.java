package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocket {

	

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 2000);
		System.out.println("ClientSocket"+socket);
		
		OutputStream out = socket.getOutputStream();
		
		InputStream input = socket.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(input);
		BufferedReader inBuff = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
	
		
		String response;
		
		while (true){
			System.out.println("Insert the request :");
			
			String request = sc.nextLine();
			
			out.write((request).getBytes());
			out.write(("\n done").getBytes());
			
			char[] buf = new char[1000];
			StringBuilder sb = new StringBuilder();
			int r;
			
			if ((r = inBuff.read(buf)) > 0)
			sb.append(new String(buf, 0, r));
			
			response = sb.toString();
			
			if ("done".equals(response)){
				break;
			}
			System.out.println(response);	
		}
		
		out.close();
		inBuff.close();
	}
}
