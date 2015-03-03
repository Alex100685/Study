package filesfromdiffstrings;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadStreamFiles extends Thread {
	private String scr;
	private String dest;
	
	ThreadStreamFiles(String scr, String dest){
		this.scr = scr;
		this.dest = dest;
	}
	
	
	public void run(){
		StreamReader sr = new StreamReader(scr, dest);
		try {
			
			sr.filesCopy();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	}
		
		
	

	
	


