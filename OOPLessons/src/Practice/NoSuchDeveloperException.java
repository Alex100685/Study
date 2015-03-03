package Practice;

public class NoSuchDeveloperException extends Exception {
	String msg;
	
	NoSuchDeveloperException (String msg){
		super ( msg);
	}

}
