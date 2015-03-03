package lesson3Developers;

public class SeniorDeveloper extends Developer {

	public SeniorDeveloper(String name, int salary, int experience) {
		super(name, salary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
