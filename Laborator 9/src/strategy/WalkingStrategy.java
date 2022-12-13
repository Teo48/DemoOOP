package strategy;

public class WalkingStrategy implements Strategy {

  @Override
  public void buildRoute() {
    System.out.println("Walk");
  }
}
