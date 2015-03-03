package lesson5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FilesList {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Введите директорию :");
		String directory = sc.nextLine();
		
		File f = new File(directory);
		File textfile = new File (directory+"\\fileslist.txt");
		if(!f.exists()){
			f.mkdir();
			textfile.createNewFile();
		}
		
		File [] d = f.listFiles();
		String [] listofpath = new String [d.length];
		for (int i=0; i<d.length; i++){
			listofpath [i] = d [i].getAbsolutePath();
		}
		long [] listoflongdates = new long [d.length];
		for(int i=0;i<d.length;i++){
			listoflongdates [i] = d[i].lastModified();
		}
		Date [] listofdates = new Date [d.length];
		for (int i=0; i<d.length; i++){
			listofdates [i] = new Date(listoflongdates[i]);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy HH:mm:SS");
		String [] datestrings = new String [d.length];
		for (int i=0; i<d.length; i++){
			datestrings [i] = sdf.format(listofdates[i]);
		}
		String [] listofnames = new String [d.length];
		for (int i=0; i<d.length; i++){
			listofnames [i] = d[i].getName();
		}
		
		String listtowrite = "";
		for(int i=0; i<d.length; i++){
			listtowrite = listtowrite+"\r\n Имя файла "+listofnames[i]+" Путь файла "+listofpath[i]+" Дата создания/изменения "+datestrings[i];
			}
		
		FileWriter fw = new FileWriter(textfile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(listtowrite);
		bw.close();
		
		
		
		

	}

}
