
public class PictureTriangle {

	public static void main(String[] args) {
		
		String pict [][] = new String [7][4];
		int i;
		for (i = 0; i<7; i++){
			for (int j=0; j<i+1-3; j++){
				
				
				System.out.print("*");
			}
			System.out.println();
		
		}
		for (i = 0; i<7; i++){
			for (int j=i; j<3; j++){
				
				
				System.out.print("*");
			}
			System.out.println();
		
		

	}

}}
