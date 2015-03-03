package lesson6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time implements Runnable{
	Thread thrd = new Thread(this);
	
	private String i;
	
	public String getI(){
		return i;
	}
	public void setI(String i){
		this.i=i;
	}
	
	
	public String getDate(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String date = sdf.format(d);
		return date;
		}

	public static void main(String[] args) {
		
		Time t = new Time();
		
	    t.thrd.start();
		System.out.println("Нажмите i для прерывания потока");
		Scanner sc = new Scanner(System.in);
		t.setI(sc.nextLine());
		if ("i".equals(t.getI())){
			t.thrd.interrupt();
			
		}
	}

	@Override
	public void run() {
		while (true){
			
			System.out.println("Сейчас "+getDate());
			try {
				thrd.sleep(1000);
				
			} catch (InterruptedException e) {
				System.out.println("FUCKING SHIT!!! INTERRUPTED THREAD");
				e.printStackTrace();
				return;
			}
			
		}
		
	}

}
