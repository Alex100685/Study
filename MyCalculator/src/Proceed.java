import java.util.Scanner;
public class Proceed {

	public static void main(String[] args) {
		int a = 1;
		int nextvalue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число ");
		int n = sc.nextInt();
		System.out.println("Введите второе число ");
		int m = sc.nextInt();
		System.out.println("Введите третье число ");
		int o = sc.nextInt();
		System.out.println("Введите четвертое число ");
		int p = sc.nextInt();
if(p-o == 2 && o - m ==2 && m-n == 2){
	nextvalue = p+2;
	System.out.println(nextvalue);
	return;}
else if(p-o == 3 && o - m == 3 && m-n == 3) {
	nextvalue = p+3;
	System.out.println(nextvalue);
	return;}
else if (o == Math.sqrt(p) && m == Math.sqrt(o) && n == Math.sqrt(m)){
	nextvalue = p*p;
	System.out.println(nextvalue);
}
			
		
		System.out.println("Введите пятое число ");
		int q = sc.nextInt();
		if(q/2 == p && p/2 == o && o/2 == m && m/2 == n){
			nextvalue = q*2;
			System.out.println(nextvalue);
			return;}
		else if (q == p+9 && p == o+7 && o == m+5 && m == n+3){
			nextvalue = q+11;
			System.out.println(nextvalue);}
			else if (q == Math.pow(Math.cbrt(p)+1,3) && p == Math.pow(Math.cbrt(o)+1,3) && o == Math.pow(Math.cbrt(m)+1,3) && m == Math.pow(Math.cbrt(n)+1,3)) {
				
				double nextval = Math.pow(Math.cbrt(q)+1,3);
				
				System.out.println(nextval);}
			else {
				System.out.println("Нет такой последовательности");
			}
				
				
			
		
		
		
		
		
		
		
		
	
}
}
