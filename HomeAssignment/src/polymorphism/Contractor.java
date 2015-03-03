package polymorphism;

public class Contractor extends Man {

	public Contractor(String name, String suname) {
		super(name, suname);
	}

	public boolean increasePay(int percent) {
		// TODO Auto-generated method stub
		if (percent<INCREASE_CAP) {
			System.out.println("Increasing hourly rate by" +percent+ " % "+getName());
		
		return true;}
		else{
			System.out.println("Sorry, can`t increase pay more than " +INCREASE_CAP+ " % ");
			return false;}
		}
	}


