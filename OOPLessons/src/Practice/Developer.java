package Practice;

public class Developer {

	protected String name;
	protected int experience;
	protected double salary;
	protected String level;
	
	public Developer(String name, double salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
		level = "Девелопер";
	}
	
	public String getName() {
		return name;
	}
	
	public int getExperience() {
		// TODO Auto-generated method stub
		return experience;
	}

	public double getSalary(){
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary){
		this.salary= salary;
	}
	public void setExp(int experience) {
		// TODO Auto-generated method stub
		this.experience = experience;
	}
	public void add(Developer d){
		
	};
	public String getLevel(){
		return level;
	}
	
	
	
	
}

