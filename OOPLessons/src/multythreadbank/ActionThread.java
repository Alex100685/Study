package multythreadbank;

public class ActionThread extends Thread {
	Account acc;
	Action a;
	ActionThread(Account acc, Action a){
		this.acc = acc;
		this.a = a;	
	}
	public void run(){
		a.doAction();	
	}
}
