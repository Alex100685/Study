package lesson5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		
		System.out.println("¬ведите место расположени€ файла дл€ копировани€");
		Scanner sc = new Scanner(System.in);
		String source = sc.nextLine();
		if(source.endsWith("\\")){
			String dir = source.substring(0, source.length()-2);
			File d = new File(dir);
			File [] dirfiles = d.listFiles();
			System.out.println("¬ведите путь дл€ копировани€ файла");
			String dest = sc.nextLine();
			for (int i=0; i<dirfiles.length; i++){
			FileInputStream fis = new FileInputStream(dirfiles[i]);
			String [] destf = (dirfiles[i].getAbsolutePath()).split("\\\\");
			String dest1 = dest+"\\"+destf[destf.length-1];
			
			File d1 = new File(dest1);
			
			FileOutputStream fos = new FileOutputStream(d1);
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte [] buf = new byte [1024];
			int l;
			while ((l = bis.read(buf))>0) {
				bos.write(buf, 0 , l);
			}
			
			bis.close();
			bos.close();
			}
			return;
		}
		
		File f = new File(source);
		
		FileInputStream fis = new FileInputStream(f);
		System.out.println("¬ведите путь дл€ копировани€ файла");
		String dest = sc.nextLine();
		
		File d = new File(dest);
		
		FileOutputStream fos = new FileOutputStream(d);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte [] buf = new byte [1024];
		int l;
		while ((l = bis.read(buf))>0) {
			bos.write(buf, 0 , l);
		}
		
		bis.close();
		bos.close();
		
		
		
		
		

	}

}
