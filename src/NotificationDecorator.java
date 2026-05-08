package src;

public abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification notification) {
        this.decoratedNotification = notification;
    }

    public void sendMessage(String message, String target) {
        decoratedNotification.sendMessage(message, target);
    }
}
