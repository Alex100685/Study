package Birds;

public class Owl extends Bird {
	Owl(){
		weight = 2;
		height = 20;
		width = 40;
		depth = 20;
		wild = true;
		name = "���� ������";
		predator = true;	
	}

	@Override
	void run() {
		System.out.println("� ����� ���� �����, ����� ������ ������� �� ������");
		
	}
	public void sleep(){
		System.out.println("� ����� �� ����, ���� � �������� ����");
	}

	public void eat(){
		System.out.println("� ����� ��������� ���������");
	}
}
