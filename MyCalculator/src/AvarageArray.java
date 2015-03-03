import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class AvarageArray {

	public static void main(String[] args) {
	// сгенерировать двумерный массив путем ввода количества строк и столбцов
		
		//найти среднее значение строк и столбцов массива
		//найти количество значений элементов, которые больше 10
		//вывести на экран и массив
		// вывести на экран количество строк больше 10
	int n;	
	Scanner sc = new Scanner (System.in);	
	System.out.println("¬ведите количестов столбцов и строк ¬ашего массива");
	n = sc.nextInt();
	int arraische [][] = gentwoDarray(n);
	Arrays.sort(arraische);;
	prinTwoDarray(arraische);
	System.out.println(numten(arraische));
	
	
	
	
	}

	static int [][] gentwoDarray (int n){
		Random rand = new Random();
		int a [][] = new int [n][n];
		int i;
		int j;
		for (i=0; i<a.length;i++){
			for(j=0; j<a[i].length; j++){
			a[i][j] = rand.nextInt(20);
				
		}
		} return a;
		
	}
	
		
			static void prinTwoDarray (int [][] a) {
				
				for (int [] b : a){
					for(int c : b) {
					
				System.out.print(c+ " ");
					}
					System.out.println();
				}
				
			}
			
			
			
			static double avarEl (int a [][]) {
				double avarage = 0;
				int sum = 0;
				for(int b=0; b<a.length;b++) {
					for(int c=0;c<a[b].length;b++){
						sum = a[b][c]+sum;
						avarage = sum/a[b].length;
					}
					}
				return avarage;
				
				
				
			}
		
		static int numten (int a [][]) {
			int ten = 0;
			for (int [] b : a){
				for (int c:b){
					if (c < 10) {
						ten++;
					}
				}
			}
			return ten;
		
	}
	static void sort (int a [][]){
		
		Arrays.sort(a);
		}
		
	}
	
	
	

