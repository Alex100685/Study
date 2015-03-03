import java.util.Date;
import java.text.SimpleDateFormat;


public class HourGlass2 {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy   HH.mm.ss");
	
	Thread t = new Thread ();
	
	
	public void countTime() throws InterruptedException{
		Date d = new Date();
		long l = d.getTime();
		System.out.println(sdf.format(d));
		System.out.println(l);
		t.sleep(1000);
		countTime();
		
	}

	public static void main(String[] args) {
		HourGlass2 h = new HourGlass2();
		
		try {
			h.countTime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			
		
			
			
			
			
		
		}
		
	
				
		
		
		

}