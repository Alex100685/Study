package lesson5;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Lenovo\\Desktop\\Spring\\pom.xml");
try {
	f.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	

	}

}
