import java.util.Random;
import java.util.Arrays;
public class RandomDoubleArray {

	public static void main(String[] args) {
	Random rand = new Random ();
		int array [][]= new int [8][5];
		
		for (int i = 0; i < array.length;i++){
			for (int j = 0; j < array[i].length;j++) {
				array [i][j] = rand.nextInt(89)+10;}}
			
				
				for (int i = 0; i <array.length;i++){
					for (int j = 0; j < array[i].length;j++){
				
				System.out.print(array[i][j]+ " ");
					}
		System.out.println();
		
					
				}
			}}

