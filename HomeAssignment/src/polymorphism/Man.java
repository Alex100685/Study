package polymorphism;

abstract public class Man {
	
	private String name;
	private String suname;
	
	final int INCREASE_CAP = 20;


public  Man (String name, String suname){
	
	this.name = name;
	this.suname = suname;
	
	
}
public String getName(){
	
	
	return "Man`s name is " +name+ "  " +suname;
}

public void changeAddress (String address){
	System.out.println("New address is " +address);
}

private void giveDayOff(){
	System.out.println("Giving day off to "+name+" "+suname);
}

public void promote (int percent) {
	System.out.println("Promoting a worker...");
	giveDayOff();
	
	increasePay (percent);
}

public abstract boolean increasePay(int percent);


}