import java.util.Arrays;


public class Hi {

	public static void main(String[] args) {
		int []a = new int []{1,1,1};
		a[a[a[0]++]] = 6;
		System.out.println(Arrays.toString(a));
		a[a[0]--]=5;
		System.out.println(Arrays.toString(a));
		a[++a[0]]=7;
		System.out.println(Arrays.toString(a));
	
	
}}
