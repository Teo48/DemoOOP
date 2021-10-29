package examples.agregare;

import examples.exampleprotected.Persoana;

public class Test {
    public static void main(String[] args) {
        Bar myBar = new Bar();
        Foo myFoo = new Foo(myBar); // daca se sterge obiectul myFoo, obiectul myBar va exista in continuare => agregare
        Persoana p = new Persoana();
//        p.varsta;
//        p.afisareVarsta();
    }
}
