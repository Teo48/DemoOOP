package abstractclasses;

public class Test {
	public static void main(String [] args) {
		// Nu pot instantia o clasa abstracta
//		BaseClass baseClass = new BaseClass(5, "007");
		FirstClass firstClass = new FirstClass();
		firstClass.doSomethingElse();

		SecondClass secondClass = new SecondClass();
		secondClass.doSomethingElse();
		secondClass.doSomethingSpecial();
	}
}
