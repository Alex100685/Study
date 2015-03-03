package Practice;
public class JuniorDeveloper extends Developer {
	
	

	JuniorDeveloper(String name, double salary, int experience){
		super( name, salary, experience);
		level = "Джуниор";
	}

	public void setName(String name){
		this.name = name;
	}
	
	
}	

