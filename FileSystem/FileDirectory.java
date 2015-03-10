package FileSystem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDirectory extends Thread {

	
	String path;
	String path2;
	FileDirectory(String path){
		this.path = path;
	}
	FileDirectory(String path, String path2){
		this.path = path;
		this.path2 = path2;
	}
	
	public String dir(){
		String s = "";
		File file = new File(path);
		if (file.isDirectory()){
			File [] files = file.listFiles();
			for(int i=0; i<files.length; i++){
				s = s+"\n"+"filename "+files[i].getName()+", file size: "+files[i].length()+", является директорией :"+files[i].isDirectory();
			}
		}
		return s;
		
	}
	
	
	public void createDirectory(){
		File file = new File(path);
		file.isDirectory();
		if (!file.exists()){
			file.mkdir();
		}
		
	}
	
	
	public void renameDirectory(){
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
		if(file.exists() && file.isDirectory())
		file.renameTo(file2);
		if(!file.exists())
			JOptionPane.showMessageDialog (null, "Не удалось найти папку"+path , "Exception", JOptionPane.ERROR_MESSAGE);
			
		
	}
	
	
	public void deleteDirectory(){
		File file = new File(path);
		if(file.exists() && file.isDirectory()){
			file.delete();			
		}else{
			JOptionPane.showMessageDialog (null, "Такой папки не обнаружено" , "Exception", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void run(){
		File file = new File(path);
		File file2 = new File(path2);
		CopyProgress co = new CopyProgress(path, path2);
		if (!file.exists() || !file.isDirectory()){
			JOptionPane.showMessageDialog (null, "Папки которую Вы хотите скопировать НЕ существует" , "Exception", JOptionPane.ERROR_MESSAGE);
			return;
			
		}
		
		if(file2.exists() && file2.isDirectory()){
			JOptionPane.showMessageDialog (null, "Папка, которую Вы хотите скопировать уже существует" , "Exception", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(file.exists() && file.isDirectory()){
			
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
				JOptionPane.showMessageDialog (null, "Папка для копирования не была найдена" , "Exception", JOptionPane.ERROR_MESSAGE);
			}
			
			int l;
			
			byte [] buf = new byte [1024];
			
			
			co.start();
			
			try {
				while ((l = bis.read(buf))>0)
					bos.write(buf, 0 , l);
				
			
				
			} catch (IOException e) {
				
				JOptionPane.showMessageDialog (null, "Ошибка копирования папки" , "Exception", JOptionPane.ERROR_MESSAGE);
			}
			finally{
				try {
					bis.close();
					bos.close();
				} catch (IOException e) {
					
					JOptionPane.showMessageDialog (null, "Папка после копирования не была закрыта" , "Exception", JOptionPane.ERROR_MESSAGE);
				}	
			}
		}
	}
	
	
	

}
