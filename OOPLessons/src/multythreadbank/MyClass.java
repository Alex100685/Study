package multythreadbank;

import java.util.Random;


public class MyClass {
	
public static void main(String[] args) throws Exception {

	ActionThread [] threads = new ActionThread[91];
	Account acc = new Account (1000);
	Action a = new Action(acc, 10);
	Random r = new Random();
for (int i = 0; i < 91; i++) {
	threads [i] = new ActionThread(acc, new Action (acc, r.nextInt(50)));
	threads[i].start();
}
System.out.println(acc.get());
}
}