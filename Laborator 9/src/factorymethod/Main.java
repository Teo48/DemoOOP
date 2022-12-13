package factorymethod;

public class Main {
  public static void main(String [] args) {
    NotificationFactory notificationFactory = new NotificationFactory();

    for (var type : NotificationType.values()) {
      Notification notification = notificationFactory.createNotification(type);
      notification.notifyUser();
    }
  }
}
