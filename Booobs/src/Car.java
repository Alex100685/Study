
public class Car {

	int jamesDistance = 0;
	int distance = 0;
	public void start () {
		
		System.out.println ("Моя машина начала движение");
		
	};
	
	public void stop () {
		
		System.out.println ("Моя Машина остановилась");
		
	};
	
	public int drive (int howlong) {{
	
		distance = distance+howlong * 60;
		if (distance>500) {
			System.out.println("Не гони беса, машина столько не может проехать!");
		}else{
		
		System.out.println ("Моя машина ехала еще" +howlong+ "часов");
		System.out.println ("Моя машина проехала всего" +distance+ "миль");
	return distance;}}
	return distance;
	}
	
	public int jamesDrive (int jamesHowlong)
	{
		jamesDistance = jamesDistance+jamesHowlong * 180;
		
		if (jamesDistance>500){
		System.out.println("Шо ты гониш? Даже у Джеймса машина столько не едет!))");
	}else{
		System.out.println("Супертачка Джеймса Бонда проехала еще" +jamesHowlong+ "часов");
		System.out.println("Супертачка Джеймса промчалась всего" +jamesDistance+ "миль");
		return jamesDistance;}
		return jamesDistance;
		
	}
	
public void jamesStart () {
		
		System.out.println ("Тачка Джеймса Бонда начала рвать с места");
		
	};
public void jamesStop () {
		
		System.out.println ("Тачка Джеймса Бонда с трудом дала по тормозам чтоб не врезаться в поворот");
		
	};
	
}
