package abstractfactorypattern;

public class PizzaLover {
    public static void main (String args[]) {
        Factory factory = new PizzaFactory();
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
            System.out.println("Price of " + pizzaType + " is " + factory.createPizza(pizzaType).getPrice());
        }
    }
}
