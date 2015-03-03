package lesson3;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	class CarsPolym {
	    public String getName() {
	          return "автомобиль";
	    }
	}

	class BMW extends CarsPolym {
	    @Override
	    public String getName() {
	         return "BMW";
	    }
	}

	class Lada extends CarsPolym {
	    @Override
	    public String getName() {
	         return "Lada";
	    }
	}

	class BMW_M extends BMW {
	    @Override
	    public String getName() {
	         return super.getName() + "_M";
	    }
	}



