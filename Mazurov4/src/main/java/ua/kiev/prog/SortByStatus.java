package ua.kiev.prog;

import java.util.Comparator;

public class SortByStatus implements Comparator <Document> {

	@Override
	public int compare(Document o1, Document o2) {
		String s1 = o1.getStatus();
		String s2 = o2.getStatus();
		return s1.compareTo(s2);
	}
	

}
