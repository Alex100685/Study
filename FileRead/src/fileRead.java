import java.io.*;
public class fileRead {

	public static void main(String[] args) {
		
		File f = new File("b.txt");
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		BufferedReader readconsol = new BufferedReader(new InputStreamReader (System.in));
		try {
			String data = readconsol.readLine();
			System.out.println(data);
		
			BufferedWriter writefile = new BufferedWriter (new FileWriter("b.txt"));
			writefile.write(data);
			System.out.println("Записывается информация в файл...");
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		try {
			BufferedReader readfile = new BufferedReader(new FileReader("b.txt"));
			
			String line = null;
			
		while ( (line =	readfile.readLine()) != null);
		
		System.out.println(line);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

	}

}
