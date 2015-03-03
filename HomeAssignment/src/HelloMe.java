import java.util.Scanner;
public class HelloMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите свое ФИО");
		String fio = sc.nextLine ();
		
		System.out.println("Введите дату рождения");
		//DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		String date = sc.nextLine ();
		
		
		
		
		System.out.println("Здравствуйте, " +fio+ ", Ваша дата рождения " +date);
		
		
	}

}
