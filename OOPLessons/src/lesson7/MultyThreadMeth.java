package lesson7;

import java.util.Random;
import java.util.concurrent.Callable;

public class MultyThreadMeth implements Callable <Integer> {
	int result;
	int value1;
	int value2;
	
	
	MultyThreadMeth(int value1, int value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	
	
	@Override
	public Integer call() throws Exception {
		result = value1+value2;
		return result;
	}


	

}
