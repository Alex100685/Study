
public class Fish extends Pet {

	int currentDepth=0;
	public String say(String something) {
		return "“ы че, не знаешь что рыбы не разговаривают?";
	}
	public int dive (int howDeep) {
		currentDepth=currentDepth+howDeep;
		if (currentDepth>100){
			System.out.println("я маленька€ рыбка и плавать не могу глубоко");
			currentDepth=currentDepth-howDeep;
			}else{
				
		System.out.println ("Ќыр€ю на глубину " + howDeep + "футов");
		System.out.println ("я на глубине" + currentDepth + "футов ниже уровн€ мор€");}
		return currentDepth;
		
	}
	
	}
