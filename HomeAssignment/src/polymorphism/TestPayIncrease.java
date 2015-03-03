package polymorphism;

public class TestPayIncrease {

	public static void main(String[] args) {
		Man workers [] = new Man [3];
		workers [0] = new Contractor("Vasya","Piterskiy");
		workers [1] = new Employee("Kolyan","Tantsuetluchshevseh");
		workers [2] = new Employee("Petrovich","Montirovchenko");
		
		for (Man m: workers){
			
			m.promote(30);
		}

	}

}
