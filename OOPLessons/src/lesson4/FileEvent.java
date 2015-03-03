package lesson4;

import java.util.Date;
import java.io.File;
import java.text.SimpleDateFormat;

public class FileEvent implements IFileEvent {
@Override
public void onFileAdded(String s) {
	File f = new File(s);
	long l = f.lastModified();
	String date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
	Date d = new Date(l);
	date = sdf.format(d);
System.out.println("File added: " + s+". Creation Date: "+date);

}

public void onFileDeleted(String s2){
	String date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
	Date d = new Date();
	date = sdf.format(d);
System.out.println("File Deleted: " + s2+". Deleting Date: "+date);

}
	
}

