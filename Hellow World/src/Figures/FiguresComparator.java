package Figures;

import java.util.Comparator;

public class FiguresComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Figure f1 = (Figure)o1;
		Figure f2 = (Figure)o2;
		if(f1.area()>f2.area)
			return +1;
		if(f1.area()<f2.area)
			return -1;
		if(f1.area()==f2.area)
			return 0;
		return 0;
	}

}
