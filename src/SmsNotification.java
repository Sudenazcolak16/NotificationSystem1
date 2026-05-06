package src;

public class SmsNotification implements Notification {
    @Override
    public void sendMessage(String message, String target) {
        System.out.println("SMS gönderiliyor -> Alıcı: " + target + ", Mesaj: " + message);
    }
}
