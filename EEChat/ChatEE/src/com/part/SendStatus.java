package com.part;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Date;

public class SendStatus extends Thread {
	
	public void run(){
		while(true){
		try{
		URL obj = new URL("http://127.0.0.1:8080/ChatEEServer/stat");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		
		OutputStream statusStream = con.getOutputStream();
		
		long date = new Date().getTime();
		byte [] byteDate = ByteBuffer.allocate(8).putLong(date).array();
		byte [] byteLogin = Main.login.getBytes();
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		bs.write(byteDate);
		bs.write("----".getBytes());
		bs.write(byteLogin);
		bs.write("----".getBytes());
		byte [] regData = bs.toByteArray();
		statusStream.write(regData);
		statusStream.flush();
		statusStream.close();
		con.getResponseCode();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
