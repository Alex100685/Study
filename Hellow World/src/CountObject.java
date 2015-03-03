
public class CountObject {
	
	static int count1=0;
	static int count2=0;
	static int count3=0;
	int param1;
	String param2;
	double param3;
	
	
	
	CountObject(){
		
		param1 = 5;
		param2 = "Vasya";
		param3 = 2.22;
		count1++;
		
	}
	
	CountObject(int param1, String param2, double param3){
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		count2++;
		
	}
	
	CountObject(int param1, double param3){
		this.param1 = param1;
		this.param2 = "Vasya";
		this.param3 = param3;
		count3++;
		
	}
	
	void getCountObject(){
		System.out.println("Результат1 : " + param1+ " Результат2 :" +param2+" Результат 3: "+param3);
	}
	

	public static void main(String[] args) {
		
		CountObject co = new CountObject();
		
		co.getCountObject();
		
CountObject co2 = new CountObject(1,"Петя",30.22);
		
		co2.getCountObject();
		
		CountObject co3 = new CountObject(3,17.22);
		CountObject co4 = new CountObject(1,13.04);
		
		
		co3.getCountObject();

		
		System.out.println("Количество объектов класса: "+(count1+count2+count3));
	}

}
