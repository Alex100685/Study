package Figures;

public class Triangle extends Figure {

	Triangle(int hight, int width){
		this.hight = hight;
		this.width = width;
		
	}
	
	public double area(){
     area = (hight*width)/2;
		 return area;
	}
	
	
	
	
}
