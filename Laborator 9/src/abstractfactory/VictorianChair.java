package abstractfactory;

public class VictorianChair implements Chair {

  @Override
  public void sitOn() {
    System.out.println("Victorian sit on");
  }
}
