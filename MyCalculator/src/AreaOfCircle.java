import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {

		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �������� x");
		
		x = sc.nextDouble();
		
		System.out.println("������� �������� y");
		
		y = sc.nextDouble();
		
		double circlein;
		double a;
		double b;
		a = x*x;
		b = y*y;
		circlein = Math.sqrt(a+b);
		if (circlein > 5) {
			System.out.println("����� ����� �� ��������� �����");
		}else if (circlein < -5) {
			System.out.println("����� ����� �� ��������� �����");
		}else{
			System.out.println("����� ����� � �������� �����");
			
		}
		
		
	}

}
