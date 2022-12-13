package abstractfactory;

public class ModernChair implements Chair {

  @Override
  public void sitOn() {
    System.out.println("Modern sit on");
  }
}
