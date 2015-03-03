package Birds;

public class BirdTest {

	public static void main(String[] args) {
		Owl o = new Owl();
		FieldEadle f = new FieldEadle();
		MountainEagle m = new MountainEagle();
		Duck d = new Duck();
		
		o.introduction();
		o.fly();
		o.eat();
		o.sleep();
		o.run();
		
		
		System.out.println("--------------------------------------");

		f.introduction();
		f.fly();
		f.eat();
		f.sleep();
		f.run();
		
		
		System.out.println("--------------------------------------");
		
		m.introduction();
		m.fly();
		m.eat();
		m.sleep();
		m.run();
		
		System.out.println("--------------------------------------");
		
		d.introduction();
		d.fly();
		d.eat();
		d.sleep();
		d.run();
		d.sweem();
		
		System.out.println("--------------------------------------");
		
	}

}
