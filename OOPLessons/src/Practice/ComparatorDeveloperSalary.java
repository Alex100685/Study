package Practice;

import java.util.Comparator;

public class ComparatorDeveloperSalary implements Comparator {
	
	
	@Override
	public int compare(Object o1, Object o2) {
		Developer d1 = (Developer)o1;
		Developer d2 = (Developer)o2;
		if (d1.getSalary()<d2.getSalary())
		return 1;
		if (d1.getSalary()>d2.getSalary())
		return -1;
		if (d1.getSalary()==d2.getSalary())
		return 0;
		return 0;
	}

}
