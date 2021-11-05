package test;

public class Parent {
    //public Parent(String s) { System.out.println("B"); }
    public static void main(String[] args) {
        System.out.println("C");
        Child c = new Child("C");
    }
}
class Child extends Parent {
    public Child(String s) { System.out.println("D"); }
}

