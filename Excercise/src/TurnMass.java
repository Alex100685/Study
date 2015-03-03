import java.util.Random;
public class TurnMass {

	public static void main(String[] args) {
		
		int [][] array = new int [6][6];
		for (int i=0; i<array.length/2; i++){
			for (int j=0; j<array.length; j++){
			
		array[i][j] = 1;
		}}
			for (int i=0; i<array.length; i++){
				for (int j=0; j<array.length; j++){
					System.out.print(array[i][j]+"  ");
			}System.out.println();
				
			
			}
			
		for (int i = 0; i<array.length/2; i++){
			for (int j=0; j<array[i].length/2; j++){
			int temp;
		
			temp = array [i][j];
			array [i][j] = array [array.length-1-i][j];
			array [array.length-1-i][j] = array [array.length-1-i][array[i].length-1-j];
			array [array.length-1-i][array[i].length-1-j] = array [i][array[i].length-1-j];
			array [i][array[i].length-1-j] = temp;
		
		
			}
			
		}
		for (int i = 0; i<array.length; i++){
			for (int j=0; j<array[i].length; j++){
				
				System.out.print(array[i][j]+"   ");
			}System.out.println();
		}
		
		
		

	}

}
