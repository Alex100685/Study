
public class Car {

	int jamesDistance = 0;
	int distance = 0;
	public void start () {
		
		System.out.println ("��� ������ ������ ��������");
		
	};
	
	public void stop () {
		
		System.out.println ("��� ������ ������������");
		
	};
	
	public int drive (int howlong) {{
	
		distance = distance+howlong * 60;
		if (distance>500) {
			System.out.println("�� ���� ����, ������ ������� �� ����� ��������!");
		}else{
		
		System.out.println ("��� ������ ����� ���" +howlong+ "�����");
		System.out.println ("��� ������ �������� �����" +distance+ "����");
	return distance;}}
	return distance;
	}
	
	public int jamesDrive (int jamesHowlong)
	{
		jamesDistance = jamesDistance+jamesHowlong * 180;
		
		if (jamesDistance>500){
		System.out.println("�� �� �����? ���� � ������� ������ ������� �� ����!))");
	}else{
		System.out.println("���������� ������� ����� �������� ���" +jamesHowlong+ "�����");
		System.out.println("���������� ������� ���������� �����" +jamesDistance+ "����");
		return jamesDistance;}
		return jamesDistance;
		
	}
	
public void jamesStart () {
		
		System.out.println ("����� ������� ����� ������ ����� � �����");
		
	};
public void jamesStop () {
		
		System.out.println ("����� ������� ����� � ������ ���� �� �������� ���� �� ��������� � �������");
		
	};
	
}
