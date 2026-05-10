package src;

public class EconomicSendingStrategy implements SendingStrategy {
    @Override
    public void send(String message, String target) {
        System.out.println("[EKONOMİK HAT] Mesaj yoğunluk bitince iletilecek: " + target);
    }
}
