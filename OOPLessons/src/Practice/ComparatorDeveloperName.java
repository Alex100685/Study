package Practice;

import java.util.Comparator;

public class ComparatorDeveloperName implements Comparator {
	
	
	public int compare(Object o1, Object o2) {
		Developer d1 = (Developer)o1;
		Developer d2 = (Developer)o2;
		return d1.getName().compareTo(d2.getName());
	}

}