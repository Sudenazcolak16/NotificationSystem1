package src;

public class NotificationService {
    public void send(String type, String message, String receiver) {
        if (type.equalsIgnoreCase("SMS")) {
            System.out.println("SMS gidiyor: " + receiver + " -> " + message);
        } else if (type.equalsIgnoreCase("EMAIL")) {
            System.out.println("Email gidiyor: " + receiver + " -> " + message);
        } else if (type.equalsIgnoreCase("PUSH")) {
            System.out.println("Push gidiyor: " + receiver + " -> " + message);
        }
    }
}
