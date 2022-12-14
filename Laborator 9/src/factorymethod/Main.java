package factorymethod;

public class Main {
  public static void main(String [] args) {
    NotificationFactory pushNotificationFactory = new PushNotificationFactory();
    pushNotificationFactory.createNotification().notifyUser();

    NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
    emailNotificationFactory.createNotification().notifyUser();
  }
}
