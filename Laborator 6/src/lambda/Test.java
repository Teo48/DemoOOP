package lambda;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface Engine {
	int getFuelCapacity();
}

class Car {
	public Engine getEngine() {
		return () -> 11;
	}
}

public class Test {
	/**
	 * (param1, param2, ...) -> corp functie
	 * */
	public static void main(String[] args) {
		Car car = new Car();
		Engine e = car.getEngine();

		System.out.println(e.getFuelCapacity());

		ArrayList<Integer> v = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		v.forEach((i) -> System.out.println(i));
		v.removeIf((i) -> i % 2 == 0);
	}
}

