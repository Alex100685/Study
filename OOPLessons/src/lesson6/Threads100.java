package lesson6;

public class Threads100 implements Runnable {
	Thread [] t = new Thread[100];

	public static void main(String[] args) throws InterruptedException {
		Threads100 th = new Threads100();
		 
		for(int i=0; i<100; i++){
			th.t[i] = new Thread(th);
		}
		
		for (int i=0;i<th.t.length; i++){
			
			th.t[i].setName("Поток №"+i);
			System.out.println(th.t[i].getName()+" введен в строй");
			
		}
		
		for(int i=0; i<th.t.length; i++){
			th.t[i].start();
		}
		
		
		//Thread.sleep(100000);
		
		for(int i=0; i<th.t.length; i++){
		th.t[i].interrupt();
		System.out.println(th.t[i].getName()+" прерван");
		Thread.sleep(1000);
		}
		
		

	}

	@Override
	public void run() {
		
		while (true){
			
			for(int i=0;i<t.length; i++){
				
		try {
			
				
			t[i].sleep(3000);
			
		} catch (InterruptedException e) {
			return;
		}
			
		}
		}
	}
	}

