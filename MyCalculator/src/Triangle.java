import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите значение точки по х ");
		double x = sc.nextDouble();
		System.out.println("¬ведите значение точки по у ");
		double y = sc.nextDouble();
		
		if (2*y+3*x <=20) {
			System.out.println("¬аша точка находитс€ внутри триугольника");
		}else{
			System.out.println("¬аша точка находитс€ за пределами треугольника");
		}
		
		
		
		
		
		

	}

}
