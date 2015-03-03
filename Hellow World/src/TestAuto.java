public class TestAuto {
	
	
	
	

	public static void main(String[] args) {
		Auto az = new Auto("Запорожец", 1000, 1.3, 2.2, 1.4, "желтый ", " легковая ",0.8, 0.4);
		Auto am = new Auto("Mercedess", 2500, 1.8, 4.3, 1.9, "черный ", " легковая ",6.0, 0.8);
		
		az.startEngine();
		System.out.println("Меня зовут "+az.getName()+". Я машинка"+az.getType()+" весом "+az.getWeight()+" высотой "+az.getHeight()+" шириной "+az.getWidth()+" длиной "+"\n"
				+az.getLength()+", "+az.getColor()+"цвет. ЗАВЕЛА двигатель. Моя скорость "+az.getSpeed());
		az.startMove();
		System.out.println("Я поехала. Моя скорость :"+az.getSpeed());
		az.stopMove();
		System.out.println("Я остановилась. Моя скорость :"+az.getSpeed());
		az.stopEngine();
		System.out.println("Я заглушила мотор...");
		
		am.startEngine();
		System.out.println("Меня зовут "+am.getName()+". Я машинка"+am.getType()+" весом "+am.getWeight()+" высотой "+am.getHeight()+" шириной "+am.getWidth()+" длиной "+"\n"
				+am.getLength()+", "+am.getColor()+"цвет. ЗАВЕЛА двигатель. Моя скорость " +am.getSpeed());
		am.startMove();
		System.out.println("Я поехала. Моя скорость :"+am.getSpeed());
		am.stopMove();
		System.out.println("Я остановилась. Моя скорость :"+am.getSpeed());
		am.stopEngine();
		System.out.println("Я загушила мотор....");

	}

}
