package animale.Insecte;

import animale.Cat;

public class Bee {
    // Nu functioneaza pentru ca age are specificatorul private
//    void setAgeCat() {
//        Cat myCat = new Cat();
//        myCat.age = 2;
//    }

    // Nu functioneaza pentru ca eyeColour are specificatorul default si Bee se afla in alt pachet
//    void setEyeColourCat() {
//        Cat myCat = new Cat();
//        myCat.eyeColour = "brown";
//        System.out.println(myCat.eyeColour);
//    }

    void setHairColourCat() {
        Cat myCat = new Cat();
        myCat.hairColour = "red";

        System.out.println(myCat.hairColour);
    }
    public static void main(String[] args) {
        Bee myBee = new Bee();
        myBee.setHairColourCat();
    }
}
