package Figures;

public class Circle extends Figure {
	
	static final double PI = 3.14;
	
	Circle(int width){
		this.width=width;
	}

	public double area(){
		
		area = width/2*(PI*PI);
		return area;
		
	}
	
	
}
