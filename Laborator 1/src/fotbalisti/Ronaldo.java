package fotbalisti;

import animale.Cat;

public class Ronaldo {
    // Nu functioneaza pentru ca age are specificatorul private
//    void setAgeCat() {
//        Cat myCat = new Cat();
//        myCat.age = 2;
//    }

    // Nu functioneaza pentru ca eyeColour are specificatorul de acces default
//    void setEyeColourCat() {
//        Cat myCat = new Cat();
//        myCat.eyeColour = "brown";
//    }

    void setHairColourCat() {
        Cat myCat = new Cat();
        myCat.hairColour = "black";

        System.out.println(myCat.hairColour);
    }

    public static void main(String[] args) {
        Ronaldo r = new Ronaldo();
        r.setHairColourCat();
    }
}
