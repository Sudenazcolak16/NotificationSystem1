
package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FAZ 2 SİSTEM KONTROLÜ ===\n");

        
        ModernSmsLib disKutuphane = new ModernSmsLib();
        Notification adapterSms = new SmsAdapter(disKutuphane);
        
        System.out.println("[Test 1: Adapter]");
        adapterSms.sendMessage("Adapter üzerinden gelen mesaj.", "123456");

        System.out.println("\n-----------------------------------\n");

        Notification logluAdapterSms = new LogDecorator(adapterSms);

        System.out.println("[Test 2: Decorator + Adapter Birlikte]");
        logluAdapterSms.sendMessage("Loglanmış ve adapte edilmiş mesaj.", "987654");
     
    }
}
