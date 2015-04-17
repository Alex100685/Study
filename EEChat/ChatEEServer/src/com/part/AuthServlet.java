package com.part;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InputStream is = request.getInputStream();
		OutputStream os = response.getOutputStream();
		while (true){
		if (is.available() > 0){
		byte [] buf = new byte [1024];
		is.read(buf);
		String login = null;
		String password = null;
		String okString = null;
		for(int i=0; i<buf.length; i++){
			if(buf [i] == 45){
				if(buf [i+1] == 45){
					if(buf [i+2] == 45){
						if(buf [i+3] == 45){
							login = new String(buf, 0 , i);
							for(int k=i; k<buf.length; k++){
								if(buf [k+1] == 45){
									if(buf [k+2] == 45){
										if(buf [k+3] == 45){
											password = new String(buf, i+4, k );
											break;
										}
									}
								}
							}
							
						break;
						}
						
					}
				}
			}
			
		}
		is.close();
		if(RegServlet.logPass.containsKey(login)){
			if(RegServlet.logPass.get(login).getPassword().equals(password)){
				RegServlet.logPass.get(login).setBeaconTime(new Date().getTime());
			okString = "Welcome to EE chat, dear "+login+"!----";
			}
			if(!RegServlet.logPass.get(login).getPassword().equals(password)){
			okString = "Wrong password!----";
			}
			
		}else{
			okString = "No such login! Please insert data correctly----";
		}
		
		byte [] byteOkString = okString.getBytes();
		os.write(byteOkString);
		os.close();
		break;
		
		
		}
		
		
		}
		
		
	}

}
