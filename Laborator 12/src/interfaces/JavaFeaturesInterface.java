package interfaces;

public interface JavaFeaturesInterface {
	default int sum(int a, int b) {
		return a + b;
	}

	default int difference(int a, int b) {
		return diff(a, b);
	}

	static int product(int a, int b) {
		return a * b;
	}

	private int diff(int a, int b) {
		return a - b;
	}
}

class Test implements JavaFeaturesInterface {
	public static void main(String[] args) {
		Test javaFeaturesMethods = new Test();
		System.out.println(javaFeaturesMethods.sum(2, 1));
		System.out.println(javaFeaturesMethods.difference(2, 1));
		System.out.println(JavaFeaturesInterface.product(2, 5));
//		javaFeaturesMethods.diff(2,1);
	}
}