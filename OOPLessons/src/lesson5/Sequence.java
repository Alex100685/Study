package lesson5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Sequence {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите путь первого файла ");
		String file1 = sc.nextLine();
		System.out.println("¬ведите путь второго файла ");
		String file2 = sc.nextLine();
		System.out.println("¬ведите путь дл€ нового комбинированного файла");
		String file3 = sc.nextLine();
		File f1 = new File(file1);
		File f2 = new File(file2);
		File f3 = new File(file3);
		if(!f3.exists()){
			try {
				f3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);
		FileOutputStream fos = new FileOutputStream(f3);
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		SequenceInputStream sis = new SequenceInputStream(bis1, bis2);
		int data;
		byte [] b = new byte [1024];
		try {
			while ((data = sis.read(b))>0){
				bos.write(b, 0, data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (!bis1.equals(null)){
			bis1.close();}
			if (!bis2.equals(null)){
				bis2.close();}
			if(!sis.equals(null)){
				sis.close();}
			if (!bos.equals(null)){
				bos.close();
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
