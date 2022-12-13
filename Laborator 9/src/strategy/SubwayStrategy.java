package strategy;

public class SubwayStrategy implements Strategy {
  @Override
  public void buildRoute() {
    System.out.println("Subway");
  }
}
