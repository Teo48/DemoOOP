package singletonfactory;

import factorymethod.Notification;
import factorymethod.NotificationType;

public class Main {
  public static void main(String [] args) {
    SingletonFactory singletonFactory = SingletonFactory.getInstance();

    for (var type : NotificationType.values()) {
      Notification notification = singletonFactory.createNotification(type);
      notification.notifyUser();
    }
  }
}
