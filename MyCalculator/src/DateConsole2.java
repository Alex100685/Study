import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;
public class DateConsole2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Date dd = new Date();
		SimpleDateFormat sdt  = new SimpleDateFormat("EEEE dd MMMM yyyy '�i�, �������� ���' HH mm ss");
		SimpleDateFormat sdtinput = new SimpleDateFormat("dd.mm.yyyy");
		System.out.println(sdt.format(dd));
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���� � �������: dd.mm.yyyy");
		String indate = sc.nextLine();
		String ddstring=sdt.format(dd);
		
		try {
			Date dt = sdtinput.parse(indate);
			Calendar currentcl = Calendar.getInstance();
			
			currentcl.setTime(dd);
			Calendar inputcl = Calendar.getInstance();
			inputcl.setTime(dt);
			System.out.println(inputcl);
			int d=dd.compareTo(dt);
			if (d>0){
				
				
				
				System.out.println("��������� ���� ����� ������ ��� �������");
			}else{
				System.out.println("��������� ���� ����� ������� ��� �������");
			}
			if (currentcl.get(Calendar.DAY_OF_MONTH) == (inputcl.get(Calendar.DAY_OF_MONTH))){
				System.out.println("");
			}else{ System.out.println("��������� ���� ���������� �� ��������");
				
			}
			if (currentcl.get(Calendar.MONTH) == (inputcl.get(Calendar.MONTH))) {
				System.out.println("");
			}else{
				System.out.println("��������� ����� ���������� �� ��������");
			}
			if (currentcl.get(Calendar.YEAR) == (inputcl.get(Calendar.YEAR))){
				System.out.println("");
			}else{
				System.out.println("��������� ��� ���������� �� ��������");
			}
		}
		catch(ParseException e){
			System.out.println("�� ����� ������ ������ ����!!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}}


