package lesson6;

public class ThreadOfThread extends Thread {
	ThreadOfThreadOfThread [] threadlist = new ThreadOfThreadOfThread[50];
	
	public void run(){
	
			for(int i =0; i<threadlist.length; i++){
			threadlist [i] = new ThreadOfThreadOfThread();
			System.out.println("����� � ������ "+threadlist[i].getId()+" ������");
			threadlist[i].start();
			}
			
			while(true){
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					System.out.println("Fuck! tot have been interrupted");
					for(int i=0; i<threadlist.length; i++){
						threadlist[i].interrupt();
					}
					return;
				}
				
			}
			
		
		
	}
	
	
	
	
	}
