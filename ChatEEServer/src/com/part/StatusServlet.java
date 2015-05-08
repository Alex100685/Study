package com.part;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StatusServlet extends HttpServlet {
	
	 public StatusServlet() {
	        super();
	        
	    }

	private static final long serialVersionUID = 1L;
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException 
	{
		InputStream is = req.getInputStream();
		if (is.available() > 0){
		byte [] buf = new byte [128];
		is.read(buf);
		long beaconTime = 0;
		String login = null;
		for(int i=0; i<buf.length; i++){
			if(buf [i] == 45){
				if(buf [i+1] == 45){
					if(buf [i+2] == 45){
						if(buf [i+3] == 45){
							ByteBuffer bb = ByteBuffer.wrap(buf, 0, i);
							beaconTime = bb.getLong();
							int k=0;
							for( k=i+4; k<buf.length; k++){
								if(buf [k+1] == 45){
									if(buf [k+2] == 45){
										if(buf [k+3] == 45){
											login = new String(buf, i+4, k-(i+3));
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
		RegServlet.logPass.get(login).setBeaconTime(beaconTime);
		is.close();
			
		}	
		
		
		
	
}
}