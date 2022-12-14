package singletonfactory;

import factory.Notification;
import factory.NotificationType;

public class Main {
  public static void main(String [] args) {
    SingletonFactory singletonFactory = SingletonFactory.getInstance();

    for (var type : NotificationType.values()) {
      Notification notification = singletonFactory.createNotification(type);
      notification.notifyUser();
    }
  }
}
