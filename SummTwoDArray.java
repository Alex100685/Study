import java.util.Arrays;


public class SummTwoDArray {

	public static void main(String[] args) {
	
		int twodarray [][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		int i;
		int j;
		
		System.out.println(" оличество строк :" +twodarray.length);
		
		int sumpari = 0;
		for (i=1;i<twodarray.length;i=i+2)//спросить у преподавател€ почему длина строки а не длина строки -1
		{for  (j=0;j<twodarray[i].length;j++)
		{sumpari = sumpari+twodarray[i][j];}
		}
		System.out.println("—умма парных строк составл€ет :" +sumpari);
	}}


