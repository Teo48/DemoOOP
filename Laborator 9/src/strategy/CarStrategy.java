package strategy;

public class CarStrategy implements Strategy {

  @Override
  public void buildRoute() {
    System.out.println("Car");
  }
}
