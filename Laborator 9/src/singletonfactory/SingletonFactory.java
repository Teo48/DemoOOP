package singletonfactory;

import factory.*;

public class SingletonFactory {
  private static SingletonFactory instance = null;

  private SingletonFactory() {}

  public static SingletonFactory getInstance() {
    if (null == instance) {
      return new SingletonFactory();
    }

    return instance;
  }

  public Notification createNotification(NotificationType notificationType) {
    switch (notificationType) {
      case EMAIL: return new EmailNotification();
      case PUSH: return new PushNotification();
      case SMS: return new SMSNotification();
    }

    return null;
  }
}
