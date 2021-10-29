package examples.agregare;

public class Foo {
    private Bar bar;
    // Obiectul Bar poate continua să existe chiar dacă obiectul Foo nu există
    Foo(Bar bar) {
        this.bar = bar;
    }
}