import java.util.Random;
import java.util.Arrays;

public class RandomArray {

	public static void main(String[] args) {

		
		int randarray[] = new int [20];
		Arrays.fill(randarray, 0, randarray.length, 50);
		
		
		System.out.println(Arrays.toString(randarray));
		
		Random random = new Random();
		int i;
		for
		(i=0; i<randarray.length; i=i+2){
			
			
		randarray[i] = random.nextInt();
		}
		
		
		System.out.println(Arrays.toString(randarray));
		
		

	}
}