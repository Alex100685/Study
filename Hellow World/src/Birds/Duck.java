package Birds;

public class Duck extends Bird {
	
	Duck(){
		weight = 10;
		height = 20;
		width = 30;
		depth = 20;
		wild = false;
		name = "���� �������";
		predator = false;	
	}

	@Override
	void run() {
		System.out.println("� ����� �����!");
		
	}
	public void sweem(){
		System.out.println("� ����� ������!");
		
	}
	public void fly(){
		System.out.println("� ���� �����!");
	}

}
