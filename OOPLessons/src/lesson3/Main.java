package lesson3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

	public class Main {
		public static void main(String[] args) throws Exception {
	        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	        String s = d.readLine();
	        
	        CarsPolym c = new CarsPolym();
	        System.out.println(c.getName());
	        
	        if (s.equals("1"))
	            c = new BMW();
	        else if (s.equals("2"))
	            c = new BMW_M();
	        else
	            c = new Lada();
	        
	        System.out.println(c.getName());
	}

	}