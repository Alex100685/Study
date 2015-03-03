package lesson4;

public class Main {
public static void main(String[] args) {
	
Monitor m = new Monitor(new FileEvent()); // null
try {
	m.findTmpFiles();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
m.start();
}
}