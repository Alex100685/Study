import java.util.Scanner;
public class TheSimplestCalculator {

	
public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("������� ������ �����");
	String num1text = sc.nextLine ();
	System.out.println("������� �������� (+;-;/;*)");
	String oper = sc.nextLine ();
	if (!oper.equals("+") & !oper.equals("-") &  !oper.equals("*") &  !oper.equals("/")) {
	System.out.println("No such operator!!!");
	return;}
	
	System.out.println("������� ������ �����");
	String num2text = sc.nextLine ();
	float num1 = Float.parseFloat(num1text);
	float num2 = Float.parseFloat(num2text);

	float result = 0;
	if (oper.equals("+")){result = num1+num2;
	}
	else if (oper.equals("-")) {result = num1-num2;
	}else if (oper.equals("/")) {result = num1/num2;}
	else if (oper.equals("*")) {result = num1*num2;}
	
	System.out.println("��� ���������: " + result); 
	
	

	
	
	
	
}

}
