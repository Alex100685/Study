package Exceptions;

public class TuInteger {
	
	public int toInteger(String s) throws WrongCharsException{
		for (int n=0; n<s.length(); n++){
			if
			(s.charAt(n)== '1' ||
			s.charAt(n) == '2' ||
			s.charAt(n) == '3' || 
			s.charAt(n) == '4' || 
			s.charAt(n) == '5' ||
			s.charAt(n) == '6' || 
			s.charAt(n) == '7' || 
			s.charAt(n) == '8' || 
			s.charAt(n) == '9' || 
			s.charAt(n) == '0'){ continue;}
		
		else {throw new WrongCharsException ("—трока содержит недопустимые значени€!");
		}}
		int a = 0;
		int count = 1;
		char[] c = s.toCharArray();
		int[]b = new int [c.length];
		for(int i=0; i<c.length; i++){
			if (c[i] =='0'){b[i] = 0;}
			if (c[i] =='1'){b[i] = 1;}
			if (c[i] =='2'){b[i] = 2;}
			if (c[i] =='3'){b[i] = 3;}
			if (c[i] =='4'){b[i] = 4;}
			if (c[i] =='5'){b[i] = 5;}
			if (c[i] =='6'){b[i] = 6;}
			if (c[i] =='7'){b[i] = 7;}
			if (c[i] =='8'){b[i] = 8;}
			if (c[i] =='9'){b[i] = 9;}
		}
		for (int i=0; i<b.length; i++){
			a=a+b[b.length-1-i]*count;
			count=count*10;
		}
		return a;	
	}
	
	public static void main(String[] args) {
		
		TuInteger tu = new TuInteger();
		int k = 0;
		
		String f = "12235";
		try {
			k=tu.toInteger(f);
		} catch (WrongCharsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(k);
		
		

	}

}
