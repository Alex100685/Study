
public class WhileLoopDemo {

	public static void main(String[] args) {
	String [] friends = new String [20];
	friends [0] = "Masha";
	friends [1] = "Dasha";
	friends [2] = "Natasha";
	friends [3] = "Pasha";
	friends [18] = "Sasha";
	friends [19] = "Grisha";
	
	int totalElements = friends.length;
	int i = 0;
	
	while (i<totalElements) {
		
	if (friends [i] == null){i++;
	continue;
	}
		System.out.println ("I love" +friends [i]); i++;
	}}}
