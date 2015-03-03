
public class Pet {
	
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep () {
		
		System.out.println("Спокойной ночи! до завтра!");
	}

	public void eat () {
			
			System.out.println ("Я голоден! Давайте перекусим чипсами!");
			
		}
	public String fight (String aWord) {
		
		String petAngr = "Не буди меня, а то дам в дыню!" +aWord;
return petAngr;
		
	}
	
	
	public String say (String aWord) { 
		
		String petResponse = "Ну ладно!! " +aWord;
		return petResponse;
	}
	
}
