package multythreadbank;

public class Account {
private int money;
private final int unwithdrowalbalance;
public Account(int money) {
this.money = money;
unwithdrowalbalance = 100;
}

public int get() {
return money;
}
public void set(int x) {
money = x;
}
public int getUnwithd(){
return unwithdrowalbalance;
}



}