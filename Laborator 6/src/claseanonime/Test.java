package claseanonime;

interface Engine {
	int getFuelCapacity();
}

class Car {
	public Engine getEngine(int fuelCapacity) {
		return new Engine () {
			private int fuelCapacity = 11;

			@Override
			public int getFuelCapacity() {
				return fuelCapacity;
			}
		};
	}
}



public class Test {
	public static void main(String[] args) {
		Car car = new Car();

		Engine engine = car.getEngine(11);
		System.out.println(engine.getFuelCapacity());


	}
	/*
	 * Effectively final
	 */
	static Engine createEngine() {
		int x = 10;

		Engine e = new Engine() {
			@Override
			public int getFuelCapacity() {
				return x;
			}
		};

		return e;
	}
}

