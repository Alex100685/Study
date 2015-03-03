import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Calendar;
public class DateConsole {

	public static void main(String[] args) {

		Date dd = new Date();
		SimpleDateFormat sdt  = new SimpleDateFormat("EEEE dd MMMM yyyy 'рiк, поточний час' HH mm ss");
		SimpleDateFormat sdtinput = new SimpleDateFormat("dd.mm.yyyy");
		System.out.println(sdt.format(dd));
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите дату в формате: dd.mm.yyyy");
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
				
				
				
				System.out.println("¬веденна€ дата более ранн€€ чем текуща€");
			}else{
				System.out.println("¬веденна€ дата более поздн€€ чем текуща€");
			}
			
			System.out.println("–азница во времени составл€ет" +years+ " лет " +diffmonth+ 
					" месцев " +diff.get(Calendar.DAY_OF_MONTH)+ " дней "+diff.get(Calendar.HOUR_OF_DAY)+ " часов ");
			
			if (currentcl.get(Calendar.DAY_OF_MONTH) == (inputcl.get(Calendar.DAY_OF_MONTH))){
				System.out.println("");
			}else{ System.out.println("¬веденный день отличаетс€ от текущего");
				
			}
			if (curmonth == intmonth-1) {//сделал через ж потому как Calendar.MONTH of indate for some reason is "0"
				System.out.println("");
			}else{
				System.out.println("¬веденный мес€ц отличаетс€ от текущего");
			}
			if (currentcl.get(Calendar.YEAR) == (inputcl.get(Calendar.YEAR))){
				System.out.println("");
			}else{
				System.out.println("¬веденный год отличаетс€ от текущего");
			}
		}
		catch(ParseException e){
			System.out.println("Ќе верно введен формат даты!!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}}

