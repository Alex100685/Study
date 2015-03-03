package multythreadbank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Action {
Account acc;
int withdraw;
public Action(Account acc, int withdraw) {
this.acc = acc;
this.withdraw = withdraw;
}
Lock lock = new ReentrantLock();


public void doAction() {
	lock.lock();
try {
Thread.sleep(System.currentTimeMillis() % 100);
} catch (InterruptedException e) {}

int has = acc.get();
if (has >= withdraw+acc.getUnwithd()) {
acc.set(acc.get() - withdraw);
System.out.println("You took "+withdraw+" dollars! "+acc.get()+" left on your balance ");
}
if (has<withdraw+acc.getUnwithd()){
	try {
		throw new Exception ("Not enough money on your account! You can withdraw only "+(has-acc.getUnwithd()));
	} catch (Exception e) {
		e.printStackTrace();
	}
}
lock.unlock();
}
}

