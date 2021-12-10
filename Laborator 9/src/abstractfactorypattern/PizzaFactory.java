package abstractfactorypattern;

class PizzaFactory implements Factory {
    public enum PizzaType {
        HamMushroom, Deluxe, Hawaiian
    }
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case HamMushroom: return new HamAndMushroomPizza();
            case Deluxe:      return new DeluxePizza();
            case Hawaiian:    return new HawaiianPizza();
        }
        throw new IllegalArgumentException("The pizza type " + pizzaType + " is not recognized.");
    }
}