package interfaces;

public class Test {
	public static void main(String [] args) {
		BaseInterfaceClass b = new BaseInterfaceClass();
		b.myMethod();
		b.mySecondMethod();
		System.out.println(b.x);

		ExtendedInterfaceClass e = new ExtendedInterfaceClass();
		e.myMethod();
		e.mySecondMethod();
		e.myThirdMethod();
		System.out.println(e.x);
	}
}
