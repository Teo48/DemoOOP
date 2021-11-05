package static_example;
class SuperClass{
    public void staticMethod(){
        System.out.println("SuperClass: inside staticMethod");
    }
}


class SubClass extends SuperClass{
    //overriding the static method
    public void staticMethod(){
        System.out.println("SubClass: inside staticMethod");
    }
}

public class TestSuperClass {
    public static void main(String[] args) {
        SuperClass superClassWithSuperCons = new SuperClass();
        SuperClass superClassWithSubCons = new SubClass();
        SubClass subClassWithSubCons = new SubClass();

        superClassWithSuperCons.staticMethod();
        superClassWithSubCons.staticMethod();
        subClassWithSubCons.staticMethod();
    }
}
