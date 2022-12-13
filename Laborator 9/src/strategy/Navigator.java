package strategy;

public class Navigator {
  Strategy strategy;
  public Navigator(Strategy strategy) {
    this.strategy = strategy;
  }

  public void buildRoute() {
    strategy.buildRoute();
  }
}
