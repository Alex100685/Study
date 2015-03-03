import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class MaxValue {

	public static void main(String[] args) {
		
		int array [][] = new int [5][5];
		
		Random rand = new Random();
		int sum = 0;
		for (int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				array[i][j] = rand.nextInt(10);
				sum = sum + array[i][j];
				System.out.print(array[i][j]+ "  ");	
			}
			System.out.println();
		}
		for (int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				sum = sum+array[i][j]/2;
			}}
			System.out.println(sum);
}}