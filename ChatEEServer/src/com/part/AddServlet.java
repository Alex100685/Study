package com.part;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private MessageList msgList = MessageList.getInstance();
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException 
	{
		Message m = null;
		
		try {
			m = Message.readFromStream(req.getInputStream());
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		if (m == null) {
			resp.setStatus(400); // bad request
			return;
		} else{
			
			if(m.to.equals("serverlist")){
				m.isPrivate = true;
				m.to = m.from;
				m.text = "";
				for (String key : RegServlet.logPass.keySet()){
					m.text = "\n"+key+m.text;
				}	
			}
			if(m.to.equals("statuslist")){
				m.isPrivate = true;
				m.to = m.from;
				m.text = "";
	
				long time = new Date().getTime();
				for (String key : RegServlet.logPass.keySet()){
					
				long time2 = RegServlet.logPass.get(key).getBeaconTime();
				if((time - time2)>20000){
					RegServlet.logPass.get(key).setStatus("offline");
				}
				if((time - time2)<20000){
					for(int i = MessageList.getInstance().size()-1; i>0; i--){
						if ((MessageList.getInstance().get().get(i).from).equals(key)){
							if((time - (MessageList.getInstance().get().get(i).timeMills))>100000){
								RegServlet.logPass.get(key).setStatus("non available");
								break;
							}
							else{
								RegServlet.logPass.get(key).setStatus("online");
								break;
							}
					
						}
				
					}
				}
				
					m.text = "\n"+key+" "+RegServlet.logPass.get(key).getStatus()+m.text;
			    }
				
				
				
				
			}
			
			
			
			msgList.add(m);
		}
	}
}
