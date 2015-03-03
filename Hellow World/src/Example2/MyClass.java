package Example2;

import java.util.Date;

public class MyClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		StudentList sl = new StudentList();
		
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986-1970, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970-1970, 3, 28)));
		sl.add(new Student("Vas", "Pup", new Date(1971-1970, 2, 28)));
		sl.add(new Student("Va", "Pu", new Date(1972-1970, 2, 28)));
		sl.add(new Student("V", "P", new Date(1972-1970, 2, 28)));
		
		
		
		
		int n = sl.find("Seva");
		System.out.println(sl.get(n).getBirth().toString());
	}
}
