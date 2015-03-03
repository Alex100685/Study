package filesfromdiffstrings;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class StreamReader {
	
	private String scr;
	private String dest;
	
	StreamReader(String scr, String dest){
		this.scr = scr;
		this.dest = dest;
	}
	
	private final static Object o = new Object();
	
	public void filesCopy() throws FileNotFoundException{
		synchronized(o){
		
		
		File fscr = new File (scr);
		File fdest = new File (dest);
		
		FileInputStream fis = new FileInputStream(fscr);
		FileOutputStream fos = new FileOutputStream(fdest, true);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		if (!fdest.exists()){
			try {
				fdest.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int l = 0;
		
		byte [] buf = new byte [1024];
			
				try {
					while ((l = bis.read(buf))>0) 
					bos.write(buf, 0, l);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					
					bos.flush();
					bis.close();
					bos.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
		}
	}
}
