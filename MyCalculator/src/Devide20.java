import java.util.Arrays;
public class Devide20 {

	public static void main(String[] args) {
	double result = 0;	
		for (double i=1;i<1000000000;i++){
			
				if (i%11==0 && i%12==0 && i%13 ==0 && i%14==0 && i%15==0 && i%16 == 0 && i%17 == 0 && i%18==0 && i%19==0 && i%20==0){
					result = i;
					break;
					}
				
				}
		System.out.println(String.valueOf(result));
				
				
				
				
			}
		}
			
		
		
		