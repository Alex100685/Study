import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Scanner;
import java.io.OutputStream;


public class IncomeSocket extends Thread {
	
	String ip;
	
	IncomeSocket (String ip){
		this.ip = ip;
	}
	@Override
	public void run(){
		
		try{
		final Socket socket = new Socket(ip, 5000);
		final InputStream is = socket.getInputStream();
		
		
		
		Thread th = new Thread(){
			public void run(){
				try{
					while(!isInterrupted()){
						
						Thread.sleep(100);
						Message msg = Message.readFromStream(is);
						
						if(msg == null){
							Thread.yield();
						}
						if ((msg != null) && msg.isConnection == true){
							IncomeSocket is = new IncomeSocket(msg.myIp);
							is.start();
							ChatWindowEngine.socketList.add(is);
							Window.button.setEnabled(true);
							
							
							
						}
						if(msg !=null && msg.isConnection == false){
							Window.incomeMessageArea.setText(msg.toString()+"\n"+Window.incomeMessageArea.getText());
						}
					}
				}
				catch(Exception e){
					return;
				}
				
				
			}
		};
		th.setDaemon(true);
		th.start();
		
		
		
		
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
		}
	}