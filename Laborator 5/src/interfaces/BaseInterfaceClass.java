package interfaces;

public class BaseInterfaceClass implements BaseInterface {

	@Override
	public void myMethod() {
		System.out.println(this.getClass().getSimpleName() + ": Hello from myMethod");
	}

	@Override
	public void mySecondMethod() {
		System.out.println(this.getClass().getSimpleName() + ": Hello from mySecondMethod");
	}
}
