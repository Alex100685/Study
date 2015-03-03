package lesson3Developers;


public class TeamLeadDeveloper extends Developer {

	public TeamLeadDeveloper(String name, double salary, int experience) {
		super(name, salary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
