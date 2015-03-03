import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Random;

public class MethodArrays {

	


	public static void main(String[] args) {
		
		int array [];
		String barray;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество элементов массива");
		int n = sc.nextInt();
		array = randomArray(n);
		barray=convertToString(array);
		System.out.println(Arrays.toString(array));
		System.out.println(barray);
		
		
		
	}

	static int [] randomArray (int n) {
		int a [] = new int [n];
		Random rd = new Random();
		for (int i=0;i<a.length;i++){
		a[i]=rd.nextInt(20);
		}
		return a;}
	
	static String convertToString (int [] a){
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<a.length; i++){
		sb.append(a[i]);
		if (i < a.length-1){sb.append(", ");}
		}
		sb.insert(0, "[");
		String c = sb.toString();
		sb.insert(c.length(),"]");
	
		
		return sb.toString();
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
	
