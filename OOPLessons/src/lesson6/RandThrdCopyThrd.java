package lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandThrdCopyThrd extends Thread {
	
	String scr = "d:\\Movies\\Кайт.2014.avi";
	String dest = "d:\\2.avi";
	private long count;
	private int  quantthreads;
	File f = new File(scr);
	File f2 = new File(dest);
	final int BLOCK = 1024;
	
	RandThrdCopyThrd(int count){
		this.count = count;
	}
	
	public void run(){
		
		RandomAccessFile in=null;
		RandomAccessFile out=null;
		try {
			in = new RandomAccessFile(f, "r");
			out = new RandomAccessFile(f2, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int l = 0;
		
		byte [] buf = new byte [BLOCK];
		try {
			in.seek(f.length()/quantthreads*count);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
				
			while ((l = in.read(buf))>((f.length()/quantthreads)*count)) {
				out.write(buf, (int)((f.length()/quantthreads)*count) , l);
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getQuantthreads() {
		return quantthreads;
	}

	public void setQuantthreads(int quantthreads) {
		this.quantthreads = quantthreads;
	}

}
