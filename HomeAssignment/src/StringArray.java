
import java.util.Arrays;
public class StringArray {

	public static void main(String[] args) {
	
		String array [] = {"abc","def","ghi","gkl","mno","pqr","stu","vwz","yza","bce"};

		int n = array.length;
		System.out.println("���������� ����� ������� " +n);
		
		int revi;
		int m = array.length-1;
		for( revi=9;revi>=0; revi--)
			System.out.println(array[revi]);
	    String concarray = array [9]+array[8] + array[7]+array[6]+array[5]+array[4]+array[3]+array[2]+array[1]+array[0];
	    System.out.println(concarray);
	    //����� ������
	    int sl = concarray.length();
	    System.out.println(sl);
	    //�������� 3-� �������� � ������ ������ � 5-�� �������� � �����
		String copyconcaray = concarray.substring(3,24);
		System.out.println(copyconcaray);
		//������� ��� �������
		String conarraytrim = copyconcaray.trim();
		String bigarray = conarraytrim.toUpperCase();
		System.out.println(bigarray);
		
		int calc = bigarray.length();
		System.out.println(calc);
		
		char bigarray0 = bigarray.charAt(0);
		char bigarrayend = bigarray.charAt(bigarray.length() - 1);
		boolean bstart;
		if (bigarray0 == 'S') {bstart = true;}
		else {bstart=false;}
		boolean bend;
		if (bigarrayend == 'I') {bend = true;}
		else {bend = false;}
		System.out.println("������ ���������� �� S" +bstart+ "������ ������������� �� I" +bend);
		
		
		
		
		
	}

}
