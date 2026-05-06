package src;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message, String target) {
        System.out.println("Email gönderiliyor -> Alıcı: " + target + ", Mesaj: " + message);
    }
}
