

package src;

public class Main {
    public static void main(String[] args) {
<<<<<<< phase-3
        System.out.println("=== FAZ 3: DAVRANIŞSAL ÖRÜNTÜLER TESTİ (Genişletilmiş) ===\n");

        String mesaj = "Faz 3 Test Mesajı";
        String alici = "05551112233";
=======
        System.out.println("=== FAZ 2 SİSTEM KONTROLÜ ===\n");
>>>>>>> main

        System.out.println("[Test 1: Strateji Kullanımı]");
        
<<<<<<< phase-3
        SendingStrategy fast = new FastSendingStrategy();
        fast.send(mesaj, alici); 

        SendingStrategy economic = new EconomicSendingStrategy();
        economic.send(mesaj, alici); 

        System.out.println("\n-----------------------------------\n");

        System.out.println("[Test 2: Gözlemci Takibi]");
        
        AdminLogCenter admin = new AdminLogCenter();
        
        
        System.out.println("Sistem mesajı gönderiliyor, Admin logluyor...");
        admin.update(mesaj); 

        System.out.println("\n-----------------------------------\n");

        
        System.out.println("[Test 3: Faz 1 Servis Uyumluluğu]");
        NotificationService eskiServis = new NotificationService();
        eskiServis.send("SMS", mesaj, alici);

        System.out.println("\nFaz 3 başarıyla tamamlandı. Mevcut kodlar korunarak yeni desenler test edildi.");
=======
        ModernSmsLib disKutuphane = new ModernSmsLib();
        Notification adapterSms = new SmsAdapter(disKutuphane);
        
        System.out.println("[Test 1: Adapter]");
        adapterSms.sendMessage("Adapter üzerinden gelen mesaj.", "123456");

        System.out.println("\n-----------------------------------\n");

        Notification logluAdapterSms = new LogDecorator(adapterSms);

        System.out.println("[Test 2: Decorator + Adapter Birlikte]");
        logluAdapterSms.sendMessage("Loglanmış ve adapte edilmiş mesaj.", "987654");
     
>>>>>>> main
    }
}
