import java.util.Scanner;
public class ScanMaxNum {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the first number");
		a = sc.nextInt();
		System.out.println("Insert the second number");
		b = sc.nextInt();
		System.out.println("Insert the third number");
		c = sc.nextInt();
		System.out.println("Insert the fourth number");
		d = sc.nextInt();
		/*
		if (a+b+c>b+c+d && b+c+d>c+d+a) {
			System.out.println(b);
		}else if (b+c+d>c+d+a && c+d+a>d+a+b){
			System.out.println(c);
		}
		else if (c+d+a>d+a+b && d+a+b>a+b+c) {
			System.out.println(d);
		}else if(d+a+b>a+b+c && a+b+c>b+c+d)
			System.out.println(a);
		}
		*/
		if (a>=b && a>=c && a>=d) {
			System.out.println("first"+a);
		}else if (b>=c && b>=a && b>=d){
			System.out.println("second"+b);
		}
		else if (c>=a && c>=b && c>=d) {
			System.out.println("third" +c);
		}else if (d>=a && d>=b && d>=c) {
			System.out.println("fourth"+d);
		}
	
}}
