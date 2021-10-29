package examples.overloading;

class Dacia extends Car {
    public static void print() {
        System.out.println("Dacia");
    }

    public void init() {
        System.out.println("Dacia");
    }

    // Exemplu de suprascriere
    public void addGasoline() {
        // do something
    }

    // Exemplu de supraîncărcare
    public void addGasoline(Integer gallons) {
        // do something
    }
}
