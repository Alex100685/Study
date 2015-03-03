package polymorphism;

public class Employee extends Man {

	public Employee(String name, String suname) {
		super(name, suname);
		
	}

	public boolean increasePay(int percent) {
		System.out.println("Increasing salary by "+percent+ " % " +getName());
		return true;
	}
	

	
	
	
}
