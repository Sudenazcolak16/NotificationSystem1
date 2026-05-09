package src;

public class FastSendingStrategy implements SendingStrategy {
    @Override
    public void send(String message, String target) {
        System.out.println("[HIZLI HAT] Mesaj anında iletiliyor: " + target);
    }
}
