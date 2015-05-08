
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;


public class ClientThread extends Thread {
	
	private Socket socket;
	private List<Message> msg;
	private List<Message> privateMsg;
	private int pos = 0;
	private int privatePos = 0;
	public boolean getFromPrivate = false;
	
	public ClientThread (Socket socket, List <Message> msg, List <Message> privateMsg){
		this.socket = socket;
		this.msg = msg;
		this.privateMsg = privateMsg;
	}
	
	private void listToBytes (OutputStream os) throws IOException{
		if(getFromPrivate == false){
		final int sz = msg.size();
		for (int i =pos; i<sz; i++)
			msg.get(i).writeToStream(os);
		pos = msg.size();
		}
		if(getFromPrivate == true){
			privateMsg.get(privateMsg.size()-1).writeToStream(os);
			privatePos = privateMsg.size();
		}
	}
	public void run(){
		try{
			final InputStream is = socket.getInputStream();
			final InputStream is2 = socket.getInputStream();
			final OutputStream os = socket.getOutputStream();
			final OutputStream os2 = socket.getOutputStream();
			while (!isInterrupted()){
				if(pos < msg.size()){
					getFromPrivate = false;
					listToBytes(os);	
				}
				if(privatePos < privateMsg.size()){
					getFromPrivate = true;
					listToBytes(os);
				}
				
				Thread.sleep(100);
				Message m = Message.readFromStream(is);
				if (m!=null && m.isPrivate == false){
					if(m.isFile == false){
						msg.add(m);
						getFromPrivate = false;
					}
					else{
						m.writeToStream(os);
						
					}
					
					
				}
				if (m!=null && m.isPrivate == true){
					if(m.isFile == false){
					privateMsg.add(m);	
				getFromPrivate = true;
					}
					else{
						m.writeToStream(os);
					
					}
				}
				
			}
			
			socket.close();
			
			
		}catch (Exception e) {
			return;
		}
		
		
	}
}