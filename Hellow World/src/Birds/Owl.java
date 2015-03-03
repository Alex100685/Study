package Birds;

public class Owl extends Bird {
	Owl(){
		weight = 2;
		height = 20;
		width = 40;
		depth = 20;
		wild = true;
		name = "сова Мудрец";
		predator = true;	
	}

	@Override
	void run() {
		System.out.println("Я очень мало бегаю, почти всегда прячусь на дереве");
		
	}
	public void sleep(){
		System.out.println("Я ночью не сплю, сплю в основном днем");
	}

	public void eat(){
		System.out.println("Я кушаю маленьких носякомых");
	}
}
