package Birds;

public class FieldEadle extends Eagle {
	
	
	FieldEadle(){
		weight = 10;
		height = 100;
		width = 200;
		depth = 100;
		wild = true;
		name = "орел Зоркий глаз";
		predator = true;	
	}

	@Override
	void run() {
	System.out.println("Степные орлы мало бегают потому как хорошо летают!");
		
	}
	
	
	

}
