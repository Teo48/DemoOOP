package multipleinheritance;

public class Test implements A, B {

	public static void main(String [] args) {
		Test t = new Test();
		t.doSomething();
		t.doSomething();
	}


	@Override
	public void doSomething() {
		System.out.println("Do something");
	}
}
