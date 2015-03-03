package Birds;

public class Duck extends Bird {
	
	Duck(){
		weight = 10;
		height = 20;
		width = 30;
		depth = 20;
		wild = false;
		name = "утка Дональд";
		predator = false;	
	}

	@Override
	void run() {
		System.out.println("Я много бегаю!");
		
	}
	public void sweem(){
		System.out.println("Я много плаваю!");
		
	}
	public void fly(){
		System.out.println("Я мало летаю!");
	}

}
