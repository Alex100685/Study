package Birds;

public class MountainEagle extends Eagle {

	MountainEagle(){
		weight = 15;
		height = 150;
		width = 300;
		depth = 150;
		wild = true;
		name = "орел Летающий Пожиратель";
		predator = true;	
	}
	
	@Override
	void run() {
		System.out.println("Горные орлы мало бегают потому как хорошо летают");		
	}
	

}
