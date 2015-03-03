
public class Test {

		
		final static double PI = 3.14;
		
		private int rad;
		
		private double area;
		
		Test(int rad){
			this.rad = rad;
		
		
	}

		public double getArea(){
		
			area = rad*rad * PI;
			return area;
			
		}
		
		
		public static void main (String [] args){
			
			Test t = new Test(10);
			
			System.out.println("Area "+t.getArea());
			
		}
		
		
		
		
		
}
