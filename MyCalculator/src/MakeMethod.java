import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class MakeMethod {

	public static void main(String[] args) {
	
		int [][] arr;
		System.out.println("¬ведите количество строк");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("¬ведите количество столбцов");
		int m = sc.nextInt();
		arr = arraygen(n,m);
		aver(arr);
		printarray(arr);
		System.out.println("—реднее число массива составл€ет"+aver(arr));
	}

	static int [][] arraygen (int n, int m){
		Random rand = new Random();
		int a [][] = new int [n][m];
		for (int i = 0; i<a.length;i++){
			for (int j = 0; j<a[i].length; j++){
				a [i][j] = rand.nextInt(20);
			}
		}return a;
		
	}
	
	
	
	static void printarray (int a [][]){
		for (int [] b:a){
			for (int c:b){
				c++;
				System.out.print(c+ "   ");
			}
		System.out.println();}
		
	}
static int aver (int a [][]){
	int avarage =0;
	int sum=0;
	int col = 0;
	for (int i=0; i<a.length; i++){
		for(int j=0;j<a[i].length; j++){
			col = a.length*a[i].length;
			sum = a[i][j]+sum;
			avarage = sum/col;
			
		}
	}return avarage;
}




}
