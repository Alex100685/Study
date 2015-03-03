package lesson3Developers;

public class JuniorDeveloper extends Developer {

	public JuniorDeveloper(String name, double salary, int experience) {
		super(name, salary, experience);
	}

	@Override
	public double getSalary() {
		return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
