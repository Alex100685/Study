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

public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static HashMap <String, User> logPass = new HashMap<>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		InputStream is = request.getInputStream();
		OutputStream os = response.getOutputStream();
		while (true){
		if (is.available() > 0){
		byte [] buf = new byte [1024];
		is.read(buf);
		String login = null;
		String password = null;
		String okString;
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
		if(logPass.containsKey(login)){
			okString = "Such login exists! Please write another login----";
			
		}else{
			logPass.put(login, new User(password, new Date().getTime()));
			okString = "Registration successfully executed!----";
		}
		
		byte [] byteOkString = okString.getBytes();
		os.write(byteOkString);
		os.close();
		break;
		
		
		}
		
		
		}
		
		
	}

}
