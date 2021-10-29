package examples.overloading;

public class Test {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Dacia();
        Dacia c = new Dacia();
        Car d = null;

        a.print(); // afișează Car
        b.print(); // afișează Dacia
        c.print(); // afișează Dacia
        d.print(); // aruncă NullPointerException // Daca metoda e statica, se traduce in: Car.print();
    }
}
