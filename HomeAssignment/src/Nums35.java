
public class Nums35 {

	public static void main(String[] args) {
double sum = 0;
double num3 = 0;
double num5 = 0;
double crat3 = 3;
double crat5 = 5;
		for (int i=0;i<1000;i++){
			num3 = i/crat3;
			num5 = i/crat5;
			
			String num3s = Double.toString(num3);
			String num5s = Double.toString(num5);
			if (num3s.length()<=5 && num3s.contains(".0") || (num5s.length()<=5 && num5s.contains(".0"))) {
				sum = i+sum;
			
				
			}
			
			
			}System.out.println(sum);
					
	}
			
		}
		
		
		
		
	
