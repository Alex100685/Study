import java.sql.Date;
import java.text.SimpleDateFormat;


public class HourGlass {
	
	static Thread t = new Thread();
	
	public static void countForvard() throws InterruptedException{
		
		for(int i=1; i<31; i++){
			
			t.sleep(1000);
			System.out.println(i);
			
		} countBack();
	}
	
	public static void countBack() throws InterruptedException{
		for(int i=30; i>0; i--){
			
			t.sleep(1000);
			System.out.println(i);
			
		}countForvard();
	}
	public static void main(String[] args) {
		
			try {
				countForvard();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		}
		
	
				
		
		
		

}
		
		
		
	
