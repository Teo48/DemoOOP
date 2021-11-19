package claseinner;

interface Engine {
	int getFuelCapacity();
}

class Car {
	private int plateNumber = 10;
	private class OttoEngine implements Engine {
		private int fuelCapacity;
		private int plateNumber;

		public OttoEngine(int fuelCapacity) {
			this.fuelCapacity = fuelCapacity;
		}

		public int getFuelCapacity() {
			return fuelCapacity;
		}

		public void printPlateNumber() {
			System.out.println(plateNumber);
			System.out.println(Car.this.plateNumber);
		}
	}

	public Engine getEngine() {
		OttoEngine engine = new OttoEngine(11);
		return engine;
	}
}

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		Engine firstEngine = car.getEngine();
		System.out.println(firstEngine.getFuelCapacity());


	}
}

