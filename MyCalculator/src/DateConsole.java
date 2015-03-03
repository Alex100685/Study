import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;
public class DateConsole {

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
			
			Calendar diff = Calendar.getInstance();
			Long diffl = currentcl.getTimeInMillis() - inputcl.getTimeInMillis();
			Date diffd  = new Date(diffl);
			diff.setTime(diffd);
			int years = diff.get(Calendar.YEAR)-1970;
			
					
			int d=dd.compareTo(dt);
			int curmonth = currentcl.get(Calendar.MONTH);
			String strmonth = indate.substring(3, 5);
			int intmonth = Integer.parseInt(strmonth);
			int diffmonth = (curmonth+1) - intmonth;
			if (d>0){
				
				
				
				System.out.println("��������� ���� ����� ������ ��� �������");
			}else{
				System.out.println("��������� ���� ����� ������� ��� �������");
			}
			
			System.out.println("������� �� ������� ����������" +years+ " ��� " +diffmonth+ 
					" ������ " +diff.get(Calendar.DAY_OF_MONTH)+ " ���� "+diff.get(Calendar.HOUR_OF_DAY)+ " ����� ");
			
			if (currentcl.get(Calendar.DAY_OF_MONTH) == (inputcl.get(Calendar.DAY_OF_MONTH))){
				System.out.println("");
			}else{ System.out.println("��������� ���� ���������� �� ��������");
				
			}
			if (curmonth == intmonth-1) {//������ ����� � ������ ��� Calendar.MONTH of indate for some reason is "0"
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

