package animale;

public class Dog {
    // Nu functioneaza pentru ca age are specificatorul private
//    void setAgeCat() {
//        Cat myCat = new Cat();
//        myCat.age = 2;
//    }

    void setEyeColourCat() {
        Cat myCat = new Cat();
        myCat.eyeColour = "brown";
        System.out.println(myCat.eyeColour);
    }

    void setHairColourCat() {
        Cat myCat = new Cat();
        myCat.hairColour = "white";

        System.out.println(myCat.hairColour);
    }
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setEyeColourCat();
        myDog.setHairColourCat();
    }
}
