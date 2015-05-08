package com.part;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
		static String room;
		static String login;
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			final Scanner scanner = new Scanner(System.in);
			
			
			String act;
			login = null;
			String okString = null;
			
			while(true){
			System.out.println("Press 'r' for registration, or 'a' for authorization");
act = scanner.nextLine();
			
			if(act.equals("r")){
				while(true){
				System.out.println("Enter login: ");
				login = scanner.nextLine();
				
				System.out.println("Enter password: ");
				String password = scanner.nextLine();
				
				System.out.println("Confirm your password: ");
				String password2 = scanner.nextLine();
				
				
				if(password.equals(password2)){
					URL obj = new URL("http://127.0.0.1:8080/ChatEEServer/reg");
					HttpURLConnection con = (HttpURLConnection) obj.openConnection();
					con.setRequestMethod("POST");
					con.setDoOutput(true);
					OutputStream regStream = con.getOutputStream();
					
					byte [] log = login.getBytes();
					byte [] pas = password.getBytes();
					ByteArrayOutputStream bs = new ByteArrayOutputStream();
					bs.write(log);
					bs.write("----".getBytes());
					bs.write(pas);
					bs.write("----".getBytes());
					byte [] regData = bs.toByteArray();
					regStream.write(regData);
					regStream.flush();
					regStream.close();
					InputStream regInStream = con.getInputStream();
					while(true){
						if(regInStream.available()>0){
							
							byte [] regResp = new byte [1024];
							regInStream.read(regResp);
							for (int i =0; i<regResp.length; i++){
								if(regResp[i] == 45){
									if(regResp[i+1] == 45){
										if(regResp[i+2] == 45){
											if(regResp[i+3] == 45){
												okString = new String(regResp, 0, i);
												break;
											}
										}
									}
								}
							}
							
							regInStream.close();
							break;
							
						}
						Thread.sleep(500);
					}
					
					if(okString.equals("Registration successfully executed!")){
						System.out.println(okString);
					break;
					}
					if(okString.equals("Such login exists! Please write another login")){
						System.out.println(okString);
					}
					
				}if(!password.equals(password2))
					System.out.println("The passwords are not equal. Please repeat your attemption of registration");
				
				
				}
				break;
			}
			if(act.equals("a")){
				while(true){
				System.out.println("Enter login: ");
				login = scanner.nextLine();
				
				System.out.println("Enter password: ");
				String password = scanner.nextLine();
				
				
				
				URL obj = new URL("http://127.0.0.1:8080/ChatEEServer/auth");
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setRequestMethod("POST");
				con.setDoOutput(true);
				OutputStream regStream = con.getOutputStream();
				
				byte [] log = login.getBytes();
				byte [] pas = password.getBytes();
				ByteArrayOutputStream bs = new ByteArrayOutputStream();
				bs.write(log);
				bs.write("----".getBytes());
				bs.write(pas);
				bs.write("----".getBytes());
				byte [] regData = bs.toByteArray();
				regStream.write(regData);
				regStream.flush();
				regStream.close();
				InputStream regInStream = con.getInputStream();
				while(true){
					if(regInStream.available()>0){
						
						byte [] regResp = new byte [1024];
						regInStream.read(regResp);
						for (int i =0; i<regResp.length; i++){
							if(regResp[i] == 45){
								if(regResp[i+1] == 45){
									if(regResp[i+2] == 45){
										if(regResp[i+3] == 45){
											okString = new String(regResp, 0, i);
											break;
										}
									}
								}
							}
						}
						
						regInStream.close();
						break;
						
					}
					Thread.sleep(500);
				}
				
				if(okString.equals("Welcome to EE chat, dear "+login+"!")){
					System.out.println(okString);
				break;
				}
				else{
					System.out.println(okString);
				}
				
			}	
				break;
			}
			if(!act.equals("a") && act.equals("r")){
				System.out.println("Wrong symbol!");
			}
		}
					
			
			Thread th = new Thread() {
				
				private int n=0;
				
				@Override
				public void run() {
					try {
						while ( ! isInterrupted()) {
							URL url = new URL("http://127.0.0.1:8080/ChatEEServer/get?from=" + n);
						   	HttpURLConnection http = (HttpURLConnection) url.openConnection();
						    try {
						    	InputStream is = http.getInputStream();
						    	Message m = null;    
						    	
						    	do {
						    		Thread.sleep(200);
						    		m = Message.readFromStream(is);
						    		if (m != null) {
						    			if(m.isPrivate == true){
						    				if(m.to.equals(login)){
						    				System.out.println(m.toString());
						    				n++;
						    			}
						    				if(!m.to.equals(login)){
						    					n++;
						    					continue;
						    				}
						    			}
						    			if(m.isPrivate == false){
						    				if(m.room.equals(room)){
						    					System.out.println(m.toString());
								    			n++;
						    				}
						    				else{
						    					n++;
						    					continue;
						    				}
						    			
						    			}
						    		}
						    	} while (m != null);
						    } finally {
						    	http.disconnect();
						    }
						}
					} catch (Exception e) {
						return;
					}
				}
			};
			th.setDaemon(true);
			th.start();
			SendStatus ss = new SendStatus();
			ss.setDaemon(true);
			ss.start();
			
			try {
				System.out.println("Please, press: \n 1 - to enter Straits room,\n 2 - to enter homosexuals room, \n 3 - to enter onanists room");
				String choose = scanner.nextLine();
				if(choose.equals("1")){
					room = "geteroroom";
					System.out.println("Dear "+login+", welcome to room for straight lovers");
				}
				if(choose.equals("2")){
					room = "gomoroom";
					System.out.println("Dear "+login+", welcome to room for homosexuals");
				}
				if(choose.equals("3")){
					room = "onanistroom";
					System.out.println("Dear "+login+", welcome to room for onanists");
				}
				while (true) {
					String s = scanner.nextLine();
					if (s.isEmpty())
						break;
					
					int del = s.indexOf(':');
					String to = "";
					String text = s;
					boolean isPrivate =false;
					
					if (del >= 0) {
						to = s.substring(0, del);
						text = s.substring(del + 1);
					}
					
					if( to.endsWith("private")){
						to = to.substring(0, (to.indexOf('p')-1));
						isPrivate = true;
					}
					
					Message m = new Message();
					m.text = text;
					m.from = login;
					m.to = to;
					m.isPrivate = isPrivate;
					m.room = room;
					
					int res = m.send("http://127.0.0.1:8080/ChatEEServer/add");
					if (res != 200) {
						System.out.println("HTTP error: " + res);
						break;
					}
				}
			} finally {
				th.interrupt();
				scanner.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
