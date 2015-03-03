package lesson6;

public class ThreadOfThreadOfThread extends Thread {
		
	public void run() {
	while (true){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(getId()+" Прервать!");
			return;
		}
		
		
	}
		
	}

}
