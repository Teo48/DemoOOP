package enums;

import java.util.Random;

enum CarType {
	TESLA,
	AUDI,
	PORSCHE
}

class Car {
	CarType carType;

	public Car(CarType t) {
		switch (t) {
			case AUDI: carType = CarType.AUDI; break;
			case TESLA: carType = CarType.TESLA; break;
			case PORSCHE: carType = CarType.PORSCHE; break;
			default: break;
		}
	}

	public void printCarType() {
		System.out.println(carType);
	}
}

public class Test {
	public static void main(String [] args) {
		Car car = new Car(CarType.TESLA);
		Random r = new Random();
		int x = r.nextInt(0, 300);
		car.printCarType();
	}
}
