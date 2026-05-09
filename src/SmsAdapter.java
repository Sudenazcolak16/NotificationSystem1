package src;

public class SmsAdapter implements Notification {
    private ModernSmsLib modernSmsLib = new ModernSmsLib();

    @Override
    public void sendMessage(String message, String target) {
        int phone = Integer.parseInt(target);
        modernSmsLib.sendFastMessage(message, phone);
    }
}
