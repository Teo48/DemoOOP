package polimorfism;

class Animal {
	String name;

	public Animal() {}

	public Animal(String name) {
		this.name = name;
	}

	public void saySomething() {
		System.out.println("Hello, I'm an animal!");
	}

	public void printInfo() {
		System.out.println("My name is " + this.name);
	}
}

class Dog extends Animal {
	String name;

	public Dog() {}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void saySomething() {
		System.out.println("Hello, I'm a dog!");
	}

	public void printInfo(int age) {
		System.out.println("My name is " + age);
	}
}

public class ExempluPolimorfism {
	public static void main(String [] args) {
		Animal dog1 = new Animal("Azorel");
		Animal dog2 = new Dog("Fluffy");
		dog2.saySomething();
		dog2.printInfo();
	}
}
