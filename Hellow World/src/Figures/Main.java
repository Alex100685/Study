package Figures;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Figure f = new Figure();
		
		Figure [] figures = new Figure[3];
		
		figures [0] = new Circle(10);
		figures [1] = new Ractangle(5,10);
		figures [2] = new Triangle(15,10);
		
		for (int i=0; i<figures.length; i++){
		
		System.out.println(figures[i].area());
		
		}
		Arrays.sort(figures,new FiguresComparator());
		for(Figure f1: figures){
			System.out.println(f1.area);
		}
	}

}
