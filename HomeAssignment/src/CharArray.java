import java.util.Arrays;
public class CharArray {

	public static void main(String[] args) {
		
		char chararray [] = {'a','k','r','j','d','y','d','a','k','j','s','n','a','j','2','u','8','n','s','a','m','n','l','j'};
		Arrays.sort(chararray);
		System.out.println(chararray);
		
		String stringarray= String.valueOf(chararray);
		
		System.out.println(stringarray);
		//������� �������� ��������
		
		String concstring = stringarray.substring(stringarray.length()/2);
		System.out.println(concstring);
		
		//������ ����������
		String ucconcstring = concstring.toUpperCase();
		System.out.println(ucconcstring);
		
		//������� HashCode
		int hashuccon = ucconcstring.hashCode();
		System.out.println(hashuccon);
		
		//�������� ��� N �� P
		
		String repluccon = ucconcstring.replace('N', 'P');
		System.out.println(repluccon);
		

		
	}

}
