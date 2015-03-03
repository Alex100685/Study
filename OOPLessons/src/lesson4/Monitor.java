package lesson4;

import java.io.File;
public class Monitor {
	File dir = new File ("c:\\tmp");
String [] file = new String[10];
File [] dirFiles = new File[10];
File [] newDirFiles = new File [10];
IFileEvent event;
public String filenew;
public Monitor(IFileEvent event) {

this.event = event;
}




public void findTmpFiles() throws Exception{
	for (int i=0; i<file.length; i++){
		file[i] = "";
	}
	
	if (dir.isDirectory()){
		File dirF[] =dir.listFiles();
		
			dirFiles=dirF;
		
		for(int i=0; i<dirFiles.length; i++){
			file [i]=dirFiles[i].getAbsolutePath();
		}		
	}
	else{
		throw new Exception("TMP не является директорией");
	}
}

public void start() {
	
while (true) {
	String newFileName = null;
	String deletedFileName = null;
	       	newDirFiles =dir.listFiles();
		if (newDirFiles.length > dirFiles.length){
			int a =newDirFiles.length - dirFiles.length;
			for(int i=0; i<a; i++){
			newFileName=newDirFiles[newDirFiles.length-1-i].getAbsolutePath();
			event.onFileAdded(newFileName);
			file[newDirFiles.length-i] = newFileName;
			}
			dirFiles = newDirFiles;
			
}
		if (newDirFiles.length < dirFiles.length){
			for(int i=0;i<dirFiles.length;i++){
				if (!dirFiles[i].exists()){
				deletedFileName = dirFiles[i].getAbsolutePath();
				event.onFileDeleted(deletedFileName);
				
			}
		}dirFiles = dir.listFiles();
			}
		
try {
Thread.sleep(1000);
} catch (InterruptedException e) {}
}
}
}
