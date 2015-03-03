package lesson6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Character.Subset;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MultyThreadCopyFiles implements Runnable {
	
	Thread t = new Thread(this);
	int l;
	long lenout = 1;
	long lennewfile = 0;
	File out = new File ("d:\\1.avi");

	public static void main(String[] args) throws IOException, InterruptedException {
		
		MultyThreadCopyFiles mtcf = new MultyThreadCopyFiles();
		
		mtcf.t.start();
		String n = "d:\\Movies\\The.Interview.avi";
	File in = new File (n);
	File out = new File ("d:\\1.avi");
	FileInputStream fis = new FileInputStream(in);
	FileOutputStream fos = new FileOutputStream(out);
	BufferedInputStream bis = new BufferedInputStream(fis);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	mtcf.lenout = in.length();
	
	System.out.println(mtcf.lenout);
	byte [] buf = new byte [1024];
	
	while ((mtcf.l = bis.read(buf))>0) {
		bos.write(buf, 0 , mtcf.l);
		
	}
	
	bis.close();
	bos.close();
	
	
	
	
	}

	@Override
	public void run() {
		while (lenout!=lennewfile){
			lennewfile = out.length();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double res = lennewfile/((lenout)/100);
			String formatedDouble = String.format("%.1f", res);
			
			
			
			System.out.println("Файл скопировано на "+formatedDouble+"%");
			
			
		}
		
	}
	 

}
