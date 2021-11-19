package claseinterneinmetodesiblocuri;

interface Engine {
	int getFuelCapacity();
}

class Car {
	public Engine getEngine() {
		class OttoEngine implements Engine {
			private int fuelCapacity = 11;

			public int getFuelCapacity() {
				return fuelCapacity;
			}
		}

		return new OttoEngine();
	}

	public Engine getEngine(int fuelCapacity) {
		if (fuelCapacity == 11) {
			class OttoEngine implements Engine {
				private int fuelCapacity = 11;

				public int getFuelCapacity() {
					return fuelCapacity;
				}
			}

			return new OttoEngine();
		}

		return null;
	}
}

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		Engine e1 = car.getEngine();

		System.out.println(e1.getFuelCapacity());

		Engine e2 = car.getEngine(11);
		System.out.println(e2.getFuelCapacity());
	}
}

