package examples.withoutInstanceof;

class Animal {
    public void eat() {
        System.out.println("Animal eating");
    }

    public void action() {
        // avem nevoie de această metodă deoarece vom crea un vector
        // cu instanțe Animal și vom apela această metodă pe ele
    }
}
