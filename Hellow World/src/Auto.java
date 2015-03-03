
public class Auto {
	private String name;
	private double engineperformance;
	private double weight;//kilogram
	private double height;//meter
	private double length;//meter
	private double width;//meter
	private double enginevolume;//liter
	private String color;
	private String type; // truck or car
	private boolean engineon = false;
	private boolean move = false;
	private double speed; //km per hour
	
	

	
	
	Auto(String name, double weight, double height, double length, double width, String color, String type, double enginevolume, double engineperformance){
	this.enginevolume = enginevolume;
	this.name = name;
	this.weight = weight;
	this.height = height;
	this.length = length;
	this.width = width;
	this.color = color;
	this.type = type;	
	this.engineperformance = engineperformance;
	engineon = false;
	move = false;
	double speed=0;
	
	
	
	
	
	}
	
	public String getName(){
		return name;
	}
	
	void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	
	void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	
	void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	void setEnginevolume(double enginevolume){
		this.enginevolume = enginevolume;
	}
	public double getEnginevolume(){
		return enginevolume;
	}
	void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public double getSpeed(){
		return speed;
	}
	
	
	
	public boolean startEngine(){
		
		
		return engineon = true;
	}
public boolean stopEngine(){
		
		return engineon = false;
	}
	
public double startMove(){

	if(engineon = true){
		
		speed = ((5000*(enginevolume/10))/(weight/1000))/(width*height)*engineperformance;
		double s = speed*1000;
		int i = (int) Math.round(s);
		speed = (double)i/1000;
		
		
	}else{
		speed = 0;
	}
	
	return speed;
}
public double stopMove(){
	speed = 0;
	return speed;
}





}
