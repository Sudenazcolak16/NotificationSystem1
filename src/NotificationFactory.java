package src;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }
        return null;
    }
}
