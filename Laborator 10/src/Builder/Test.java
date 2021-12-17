package Builder;

public class Test {
	public static void main(String [] args) {
		Pizza pizza = new Pizza.Builder("large", "thin")
				.cheeseCount(1)
				.pepperoniCount(1)
				.hamCount(10)
				.build();

		System.out.println(pizza);
	}
}
