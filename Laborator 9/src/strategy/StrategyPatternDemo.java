package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.buildRoute();

        navigator = new Navigator(new SubwayStrategy());
        navigator.buildRoute();

        navigator = new Navigator(new WalkingStrategy());
        navigator.buildRoute();
    }
}
