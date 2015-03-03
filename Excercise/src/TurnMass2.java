import java.util.Arrays;
import java.util.Random;
public class TurnMass2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int a[] = new int [4];
		for (int i=0; i<a.length; i++){
			a[i]= r.nextInt(10);
		}
		
		System.out.println(Arrays.toString(a));
		
		for (int i=0;i<a.length/2;i++){
			int temp = 0;
			temp= a[i];
			a[i]= a[a.length-1-i];
			a[a.length-1-i]=temp;
			
			
		}System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		

	}

}
