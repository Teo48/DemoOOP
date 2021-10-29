package examples.withoutInstanceof;

class Wolf extends Animal {
    public void action() {
        System.out.println("Wolf howling");
    }

    public void eat() {
        super.eat();
        System.out.println("Wolf eating");
    }
}

/*
* Animal
* Wolf, Snake
* */
