
public class Fish extends Pet {

	int currentDepth=0;
	public String say(String something) {
		return "�� ��, �� ������ ��� ���� �� �������������?";
	}
	public int dive (int howDeep) {
		currentDepth=currentDepth+howDeep;
		if (currentDepth>100){
			System.out.println("� ��������� ����� � ������� �� ���� �������");
			currentDepth=currentDepth-howDeep;
			}else{
				
		System.out.println ("����� �� ������� " + howDeep + "�����");
		System.out.println ("� �� �������" + currentDepth + "����� ���� ������ ����");}
		return currentDepth;
		
	}
	
	}
