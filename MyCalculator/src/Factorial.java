import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����� ��� ������� ���������� �� 3 �� 15");
		
		int factnum = sc.nextInt();
		
		int factorial=1;
		for (int i = 1; i<=factnum; i++){
			factorial=factorial*i ;
			if (factnum<3 || factnum>15){
				System.out.println("�� ����� ������������ �����");
				return;
		}else{
		
		sc.close();
		

	}
		}		System.out.println("��������� ����������" +factorial);	
		}
}