public class TestAuto {
	
	
	
	

	public static void main(String[] args) {
		Auto az = new Auto("���������", 1000, 1.3, 2.2, 1.4, "������ ", " �������� ",0.8, 0.4);
		Auto am = new Auto("Mercedess", 2500, 1.8, 4.3, 1.9, "������ ", " �������� ",6.0, 0.8);
		
		az.startEngine();
		System.out.println("���� ����� "+az.getName()+". � �������"+az.getType()+" ����� "+az.getWeight()+" ������� "+az.getHeight()+" ������� "+az.getWidth()+" ������ "+"\n"
				+az.getLength()+", "+az.getColor()+"����. ������ ���������. ��� �������� "+az.getSpeed());
		az.startMove();
		System.out.println("� �������. ��� �������� :"+az.getSpeed());
		az.stopMove();
		System.out.println("� ������������. ��� �������� :"+az.getSpeed());
		az.stopEngine();
		System.out.println("� ��������� �����...");
		
		am.startEngine();
		System.out.println("���� ����� "+am.getName()+". � �������"+am.getType()+" ����� "+am.getWeight()+" ������� "+am.getHeight()+" ������� "+am.getWidth()+" ������ "+"\n"
				+am.getLength()+", "+am.getColor()+"����. ������ ���������. ��� �������� " +am.getSpeed());
		am.startMove();
		System.out.println("� �������. ��� �������� :"+am.getSpeed());
		am.stopMove();
		System.out.println("� ������������. ��� �������� :"+am.getSpeed());
		am.stopEngine();
		System.out.println("� �������� �����....");

	}

}
