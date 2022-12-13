package factorymethod;

public class PushNotification implements Notification {

  @Override
  public void notifyUser() {
    System.out.println("Sent push notification");
  }
}
