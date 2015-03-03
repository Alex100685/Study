
public class Delitel {

	public static void main(String[] args) {
		double num;
		double num2=0;
		double result;
		double resnorm = 0;
		double max = 0;
		num = 600851475143d;
		for (double i=600800000000d; i<num; i++) {
			result = num/i;
			String res = Double.toString(result);
			
			if (res.substring(res.length()-2, res.length()).equals(".0")) {
				resnorm = num2+i;
				
			}
		if (resnorm>max) {
			max = resnorm;
		}System.out.println(max);
		
		
		}
		

	}

}
