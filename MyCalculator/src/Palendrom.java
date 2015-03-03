import java.util.Arrays;
public class Palendrom {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
	int pal=0;
	int count=0;
	int max=0;
		for (int i=0; i<999; i++){
			for (int j=0; j<999; j++){
				count = i*j;
				String s = Integer.toString(count);
				
				if (count>=100000) {
					if (s.substring(0,1).equals(s.substring(5,6)) && s.substring(1,2).equals(s.substring(4,5)) && s.substring(2,3).equals(s.substring(3,4))) {
						pal = count;}
				}
					if (pal>max)
						max = pal;
						
						
					
					
				}
				
				
			}
		System.out.println(System.currentTimeMillis()-t);
		System.out.println(max);
		}}


