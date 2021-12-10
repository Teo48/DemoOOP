package abstractfactorypattern;

public interface Factory {
    Pizza createPizza(PizzaFactory.PizzaType pizzaType);
}
