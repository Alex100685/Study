package Birds;

public class MountainEagle extends Eagle {

	MountainEagle(){
		weight = 15;
		height = 150;
		width = 300;
		depth = 150;
		wild = true;
		name = "���� �������� ����������";
		predator = true;	
	}
	
	@Override
	void run() {
		System.out.println("������ ���� ���� ������ ������ ��� ������ ������");		
	}
	

}
