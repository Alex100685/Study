package lesson6;

import java.util.Scanner;

public class MainRandThrdCopy {

	public static void main(String[] args) {
		System.out.println("Insert the quantity of threads");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RandThrdCopyThrd [] threads = new RandThrdCopyThrd[n];
		for(int i=0; i<n; i++){
			threads [i] = new RandThrdCopyThrd(i);
			threads [i].setQuantthreads(n);
			threads [i].start();
		}

	}

}
