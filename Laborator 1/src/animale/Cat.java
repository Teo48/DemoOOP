package animale;

public class Cat {
    private int age;
    String eyeColour;
    public String hairColour;
    
    void showAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.age = 10;

        myCat.showAge();

    }
}
