import java.util.Scanner;
public class TheSimplestCalculator {

	
public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("¬ведите первое число");
	String num1text = sc.nextLine ();
	System.out.println("¬ведите оператор (+;-;/;*)");
	String oper = sc.nextLine ();
	if (!oper.equals("+") & !oper.equals("-") &  !oper.equals("*") &  !oper.equals("/")) {
	System.out.println("No such operator!!!");
	return;}
	
	System.out.println("¬ведите второе число");
	String num2text = sc.nextLine ();
	float num1 = Float.parseFloat(num1text);
	float num2 = Float.parseFloat(num2text);

	float result = 0;
	if (oper.equals("+")){result = num1+num2;
	}
	else if (oper.equals("-")) {result = num1-num2;
	}else if (oper.equals("/")) {result = num1/num2;}
	else if (oper.equals("*")) {result = num1*num2;}
	
	System.out.println("¬аш результат: " + result); 
	
	

	
	
	
	
}

}
