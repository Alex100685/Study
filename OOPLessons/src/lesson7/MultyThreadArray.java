package lesson7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultyThreadArray {
	
	public int [] makeRandomArray(int n){
			
	Random r = new Random();
	int [] a = new int [n];
	for(int i=0; i<n; i++){
		a[i] = r.nextInt(100);
	}
	
	return a;
	}

	public static void main (String[] args) throws Exception {
		
		System.out.println("Insert quantity of elements in array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MultyThreadArray mta = new MultyThreadArray();
		int [] array = new int [n];
		int [] array1 = mta.makeRandomArray(n);
		System.out.println(Arrays.toString(array1));
		array = array1;
		double two = 2.0;
		boolean even = false;
		long timebegin1 = System.currentTimeMillis();
		while(true){
		
		
		double reseven = (double)array.length/two;
		String sreseven = Double.toString(reseven);
		
		
		if (sreseven.contains(".0")){
			even = true;
		}else{
			even = false;
		}
		
		if (even == true){
			int [] newarray = new int [array.length/2];
			MultyThreadMeth [] mtm = new MultyThreadMeth [array.length];
			Future <Integer> [] futures = new Future [array.length];
			for(int i=0; i<array.length; i=i+2){
				mtm[i] = new MultyThreadMeth(array[i],array[i+1]);
				ExecutorService ex =Executors.newCachedThreadPool();
				futures [i] = ex.submit(mtm[i]);
				newarray[i/2] = futures[i].get();
				ex.shutdown();
			}
			
			array = newarray;
			
			
			
		}if (even == false && array.length != 1){
			int [] newarray = new int [(array.length-1)/2];
			MultyThreadMeth [] mtm = new MultyThreadMeth [(array.length-1)];
			Future <Integer> [] futures = new Future [array.length-1];
			for (int i=0;i<(array.length-1);i=i+2){
				mtm[i] = new MultyThreadMeth(array[i],array[i+1]);
				ExecutorService ex = Executors.newCachedThreadPool();
				futures [i] = ex.submit(mtm[i]);
				newarray[i/2] = futures[i].get();
				newarray[0] = newarray[0]+array[array.length-1];
				ex.shutdown();
			}
			array = newarray;
			
			
		}if (array.length == 1){
			
			long timeend1 = System.currentTimeMillis();
			System.out.println(array[0]);
			System.out.println("Time of multythread count "+(timeend1-timebegin1));
			break;
			
		}
		
		
		
		
		
		}
		long timebegin2 = System.currentTimeMillis();
		int sum=0;
		for(int i=0; i<array.length; i++){
			sum = sum + array[i];
		}
		long timeend2 = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Time of usual count "+(timeend2-timebegin2));
		

	}

}

