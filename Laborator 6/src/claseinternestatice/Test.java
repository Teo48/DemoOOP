package claseinternestatice;

import java.util.Map;

interface Engine {
	int getFuelCapacity();
}

class Car {
	static class OttoEngine implements Engine {
		private int fuelCapacity;

		public OttoEngine(int fuelCapacity) {
			this.fuelCapacity = fuelCapacity;
		}

		@Override
		public int getFuelCapacity() {
			return fuelCapacity;
		}
	}

	public OttoEngine getEngine() {
		OttoEngine engine = new OttoEngine(11);
		return engine;
	}
}

public class Test {
	public static void main(String[] args) {
		Car.OttoEngine firstEngine = new Car.OttoEngine(11);
		System.out.println(firstEngine.getFuelCapacity());

		Map<String, Integer> map = Map.of("Gigel", 10, "Ionel", 5);

		for (Map.Entry<String, Integer> i : map.entrySet()) {
			System.out.println(i.getKey() + ": " + i.getValue());
		}
	}
}

