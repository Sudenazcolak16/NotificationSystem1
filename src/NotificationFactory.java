package src;

public class NotificationFactory {
  
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        return null;
    }
}
