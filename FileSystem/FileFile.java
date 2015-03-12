package FileSystem;

import java.awt.BorderLayout;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FileFile extends Thread {
	
	String path;
	String path2;
	FileFile(String path){
		this.path = path;
	}
	FileFile(String path, String path2){
		this.path = path;
		this.path2 = path2;
	}
	
	
	public void createFile(){
		File file = new File(path);
		if (!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				JOptionPane.showMessageDialog (null, "Не удалось создать файл" , "Exception", JOptionPane.ERROR_MESSAGE);
				
			}
		}
		
	}
	
	
	public void renameFile(){
		File file = new File(path);	
		File file2 = new File (path2);
		String [] f1 = path.split("\\");
		String [] f2 = path2.split("\\");
		if(f1.length != f2.length){
			JOptionPane.showMessageDialog (null, path+",и "+path2+" должны совпадать!" , "Exception", JOptionPane.ERROR_MESSAGE);
		}
		for(int i=0; i<f1.length; i++){
			if(!f1[i].equals(f2[i])){
JOptionPane.showMessageDialog (null, path+",и "+path2+" должны совпадать!" , "Exception", JOptionPane.ERROR_MESSAGE);	
}		
		}
		if(file.exists() && file.isFile())
		file.renameTo(file2);
		if(!file.exists())
			JOptionPane.showMessageDialog (null, "Не удалось найти файл"+path , "Exception", JOptionPane.ERROR_MESSAGE);
			
		
	}
	
	
	public void deleteFile(){
		File file = new File(path);
		if(file.exists() && file.isFile()){
			file.delete();			
		}else{
			JOptionPane.showMessageDialog (null, "Такой файл не обнаружен" , "Exception", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void run(){
		File file = new File(path);
		File file2 = new File(path2);
		CopyProgress co = new CopyProgress(path, path2);
		if (!file.exists()){
			JOptionPane.showMessageDialog (null, "Файл который Вы хотите скопировать НЕ существует" , "Exception", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		if(file2.exists()){
			JOptionPane.showMessageDialog (null, "Файл в который Вы хотите скопировать уже существует" , "Exception", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(file.exists()){
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			try {
				
				fis = new FileInputStream(file);
				fos = new FileOutputStream(file2);
				
				bis = new BufferedInputStream(fis);
				bos = new BufferedOutputStream(fos);
				
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog (null, "Файл для копирования не был найден" , "Exception", JOptionPane.ERROR_MESSAGE);
			}
			
			int l;
			
			byte [] buf = new byte [1024];
			
			//ff.showProcess();
			co.start();
			
			try {
				while ((l = bis.read(buf))>0)
					bos.write(buf, 0 , l);
				
			
				
			} catch (IOException e) {
				
				JOptionPane.showMessageDialog (null, "Ошибка копирования файла" , "Exception", JOptionPane.ERROR_MESSAGE);
			}
			finally{
				try {
					bis.close();
					bos.close();
				} catch (IOException e) {
					
					JOptionPane.showMessageDialog (null, "Файлы после копирования не были закрыты" , "Exception", JOptionPane.ERROR_MESSAGE);
				}	
			}
		}
	}
}
