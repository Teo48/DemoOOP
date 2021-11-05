package test;

class Cake extends Food {
    public void cut() {
        System.out.print(" Cake ");
    }
}
class Food {
    public void cut() {
        System.out.print(" Food ");
    }
}

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food();
        Food food2 = new Cake();
        Cake cake = new Cake();
        food1.cut();
        food2.cut();
        cake.cut();
    }
}