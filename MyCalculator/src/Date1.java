
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Date1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
SimpleDateFormat stf=new SimpleDateFormat("d MM yyyy");
System.out.println("Input Date");
String str=sc.nextLine();
try{
Date dd=stf.parse(str);
System.out.println(dd);
} catch(ParseException e){
System.out.println("Wrong input");
}
}
}