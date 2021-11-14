package interfaces;

public interface JavaFeaturesInterfaces {

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

class JavaFeaturesMethods implements JavaFeaturesInterfaces {

	public static void main(String[] args) {
		JavaFeaturesMethods javaFeaturesMethods = new JavaFeaturesMethods();
		System.out.println(javaFeaturesMethods.sum(2, 1));
		System.out.println(javaFeaturesMethods.difference(2, 1));
		System.out.println(JavaFeaturesInterfaces.product(2, 5));
//		javaFeaturesMethods.diff(2,1);
	}
}