package src;

public class NotificationService {
    public void send(String type, String message, String receiver) {
        
        Notification notification = NotificationFactory.createNotification(type);
        
        if (notification != null) {
           
            notification.sendMessage(message, receiver);
        } else {
            System.out.println("Hata: Desteklenmeyen bildirim türü -> " + type);
        }
    }
}
