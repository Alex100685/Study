
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


public class Main {
	
	public static void main (String [] args){
		try{
		final Scanner sc = new Scanner(System.in);
		final Socket socket = new Socket("192.168.1.9", 5000);
		final InputStream is = socket.getInputStream();
		final OutputStream os = socket.getOutputStream();
		
		
		System.out.println("Enter Login :");
		final String login = sc.nextLine();
		
		Thread th = new Thread(){
			public void run(){
				try{
					while(!isInterrupted()){
						
						Thread.sleep(100);
						Message msg = Message.readFromStream(is);
						
						if(msg!=null && msg.isPrivate==true && msg.isFile == true && msg.to.equals(login)){
							if (msg.i == 0){
							System.out.println("Вам лично отправлен файл "+msg.fileName+" ...");
							}
							msg.text = "";
							File f= new File ("d:\\ПриходЧата\\"+msg.fileName);
							if(!f.exists()){
								f.createNewFile();
							}
							FileOutputStream fos = new FileOutputStream(f, true);
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							
							bos.write(msg.buf, 0, msg.buf.length);
							bos.close();
							
							
						}
						
						if(msg!=null && msg.isPrivate==false && msg.isFile == true){
							if(msg.i == 0){
							System.out.println("Всем чувакам отправлен файл "+msg.fileName+" ...");
							msg.text = "";
							System.out.println(msg.toString());
							}
							File f= new File ("d:\\ПриходЧата\\"+msg.fileName);
							if(!f.exists()){
								f.createNewFile();
							}
							FileOutputStream fos = new FileOutputStream(f, true);
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							
							bos.write(msg.buf, 0, msg.buf.length);
							bos.close();
						}
						
						
						if(msg !=null && msg.isPrivate == true && !msg.to.equals(login)){
							msg = null;
						}
						
						if((msg == null)){
							Thread.yield();
						}
						if(msg !=null && msg.isPrivate == true && msg.to.equals(login)){
							System.out.println(msg.toString());
						}
						if(msg !=null && msg.isPrivate == false && msg.isFile == false){
							System.out.println(msg.toString());
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
		try{
			while(true){
				String s = sc.nextLine();
				if(s.isEmpty())
					break;
			
				
				int del = s.indexOf(':');
				String to = "";
				String text = s;
				String fileName = null;
				int delPath = s.indexOf(':')-1;
				String path = "";
				boolean isPrivate =false;
				boolean isFile = false;
				int fileLength = 0;
				byte [] buf = null;
				
				Message m = new Message();
				
				if(del >=0){
					to = s.substring(0,del);
					text = s.substring(del+1);
				}
				
				if( to.endsWith("private")){
					to = to.substring(0, (to.indexOf('p')-1));
					isPrivate = true;
				}
				if(to.startsWith("send file")){
					to = "";
					isPrivate = false;
					isFile = true;
					File f = new File(path);
					fileLength = (int) f.length();
					path = s.substring(s.indexOf('l')+3, s.length());
					String [] sp = path.split("\\\\");
					fileName = sp[sp.length-1];
					
				}
				String [] t = to.split(" ");
				
				if(t.length>=2){
				if(t[1].equals("send")){
					to = t[0];
					isPrivate = true;
					isFile = true;
					path = s.substring(delPath, s.length());
					String [] sp = path.split("\\\\");
					fileName = sp[sp.length-1];
					
				}
				}
				if(isFile == true){
					File f = new File(path);
					long fLength = f.length();
					long BLOCK = 1024*20;
					int count = (int) (fLength/BLOCK);
					
					for(int i=0; i<=count; i++){
					RandomAccessFile raf = new RandomAccessFile(f, "r");
					raf.seek(BLOCK*i);
					long bufLength;
					if (f.length()>=(BLOCK)){
					bufLength = (BLOCK);
					}
					else {
						bufLength = (int) f.length();
					}
					buf = new byte [(int) bufLength];
					raf.read(buf, 0, buf.length);
					raf.close();
					
					
					m.text = text;
					m.from = login;
					m.to = to;
					m.path = path;
					m.isPrivate = isPrivate;
					m.isFile = isFile;
					m.fileName = fileName;
					m.fileLength = fileLength;
					m.buf = buf;
					m.i = i;
					
					
					m.writeToStream(os);
				Thread.sleep(500);
					}
				}
					if(isFile == false){
						
						m.text = text;
						m.from = login;
						m.to = to;
						m.path = path;
						m.isPrivate = isPrivate;
						m.isFile = isFile;
						m.fileName = fileName;
						m.fileLength = fileLength;
						m.buf = buf;
						
						
						m.writeToStream( os);
						
					
					}
					
	
			}
		}finally{
			th.interrupt();
			socket.close();	
			}
		}catch (Exception e){
			e.printStackTrace();
			
		}			
		}
	}