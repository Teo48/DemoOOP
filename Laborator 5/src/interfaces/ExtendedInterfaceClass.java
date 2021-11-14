package interfaces;

public class ExtendedInterfaceClass implements ExtendedInterface {
	@Override
	public void myMethod() {
		System.out.println(this.getClass().getSimpleName() + ": Hello from myMethod");
	}

	@Override
	public void mySecondMethod() {
		System.out.println(this.getClass().getSimpleName() + ": Hello from mySecondMethod");
	}

	@Override
	public void myThirdMethod() {
		System.out.println(this.getClass().getSimpleName() + ": Hello from myThirdMethod");
	}
}
