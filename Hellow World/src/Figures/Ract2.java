package Figures;

import java.util.Scanner;

public class Ract2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размер стороны!");
		int n = sc.nextInt();
		System.out.println("¬ведите размер второй стороны!");
		int m = sc.nextInt();
		String [][] s = new String [n][m];
		for (int i=0; i<s.length; i++){
			for (int j = 0; j<s[i].length; j++){
				s[i][j] = "*";
			}
		}
		for (int i=1; i<s.length-1; i++){
			for(int j = 1; j < s[i].length-1; j++){
				s[i][j] = " ";
				System.out.print(s[i][j]+" ");
			}System.out.println();
		
		}
		for (int i=0; i<s.length; i++){
			for(int j = 0; j < s[i].length; j++){
				System.out.print(s[i][j]+" ");
			}System.out.println();
		
		}
	}
	}

