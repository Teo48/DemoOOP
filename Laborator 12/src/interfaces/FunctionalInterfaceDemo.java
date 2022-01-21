package interfaces;

@FunctionalInterface
interface Summable {
	default void sayHello() {
		System.out.println("Hello from a functional interface");
	}

	static void sayHelloFromStatic() {
		System.out.println("Say hello from a static method in a functional interface");
	}

	void sum();
}

public class FunctionalInterfaceDemo {
}
