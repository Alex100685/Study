import java.util.Scanner;
public class HelloMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ���� ���");
		String fio = sc.nextLine ();
		
		System.out.println("������� ���� ��������");
		//DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		String date = sc.nextLine ();
		
		
		
		
		System.out.println("������������, " +fio+ ", ���� ���� �������� " +date);
		
		
	}

}
