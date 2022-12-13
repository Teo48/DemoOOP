package factorymethod;

public class EmailNotification implements Notification {

  @Override
  public void notifyUser() {
    System.out.println("Sent email notification");
  }
}
