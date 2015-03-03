package lesson5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ChangeText {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		
		File d = new File("d:\\temp");
		if (!d.exists()){
			d.mkdirs();
		}
		File f = new File("d:\\temp\\1.txt");
		f.isFile();
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Введите текст, содержащий слово hello несколько раз");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//We are writting our Text in file
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try {
			bw.write(s);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			try {
			
				bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		//we are reading the text from file
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		
		while ((line = br.readLine()) == null);
		
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		line = line.replace("Анютка", "Сашутка");
		
		FileWriter fw2 = new FileWriter(f);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		
		System.out.println(line);
		try {
			
			bw2.write(line);
		//	BufferedWriter buff2 = new BufferedWriter(fw2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (!fw2.equals(null)){
				bw2.close();
				
			}
		}
		
		
		

	}

}
