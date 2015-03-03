package lesson6;

public class MainOfThread {

	public static void main(String[] args) throws InterruptedException {
		ThreadOfThread tot = new ThreadOfThread();
		tot.start();
		Thread.sleep(5000);
		tot.interrupt();
		
		
		
		

	}

}
