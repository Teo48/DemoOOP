package abstractclasses;

public abstract class BaseClass {
	private int value;
	private String secretCode;

	public BaseClass() {}

	public BaseClass(int value, String secretCode) {
		this.value = value;
		this.secretCode = secretCode;
	}

	public void doSomething() {
		System.out.println("Do something");
	}

	public abstract void doSomethingElse();
}
