package factory;

public class NotificationFactory {
  public Notification createNotification(NotificationType notificationType) {
    switch (notificationType) {
      case EMAIL: return new EmailNotification();
      case PUSH: return new PushNotification();
      case SMS: return new SMSNotification();
    }

    return null;
  }
}
