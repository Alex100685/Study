package Birds;

public abstract class Bird {
	
	protected int weight;
	protected int height;
	protected int width;
	protected int depth;
	protected String name;
	protected boolean predator;
	protected boolean wild;
	protected String wildt = "дикая";
	protected String wildh = "домашняя";
	
	
	Bird(){
		System.out.println("Птичий конструктор");
	}
	
	public String isWildtext(){
		if(wild == true){
			return wildt;
		}else{
		return wildh;}
		
		
	}
	
	
	public void introduction(){
		System.out.println("Привет, меня зовут "+getName()+". Я "+isWildtext()+" птица. Мой рост "+getHeight()+" см, размах крыльев "+getWidth()+" см, длина хвоста "+getDepth()+"см, мой вес "+getWeight()+" кг");
	}
	
	
	private String getName() {
		return name;
	}

	public void fly(){
		System.out.println("Я, лечу!");
	}
	
	public void eat(){
		if (predator == true){
		System.out.println("Я ем маленьких и больших зверьков!");}
		else {
			System.out.println("Я кушаю зерно!");
		}
	}
	
	abstract void run();
	
	
	
	public void sleep(){
		System.out.println("Я сплю!");
	}
	
	public boolean isWild(){
		return wild;
		
	}
	public boolean isPredator(){
		return predator;
		
	}
	public int getWeight(){
		return weight;
	}
	
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public int getDepth(){
		return depth;
	}
	
	
	

}
