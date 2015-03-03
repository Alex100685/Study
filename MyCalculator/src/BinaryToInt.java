import java.util.Scanner;
public class BinaryToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите битовое выражение числа вида (пр: 0101...)");
		String s = sc.nextLine();
		char [] binchar = s.toCharArray();
		double value =0;
		for (int i=0; i<binchar.length; i++){
			if (binchar[i]=='1'){
				value =value+(Math.pow(2,binchar.length-1-i));
			}else if (binchar.length == 16 && binchar[0] == '1'&& binchar[i]=='0'){
				value = (value+1+(Math.pow(2,binchar.length-1-i))*-1);
				
			}
		}System.out.println(value);
	
		
		
		

	}

}
