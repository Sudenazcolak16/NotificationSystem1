package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FAZ 3: DAVRANIŞSAL ÖRÜNTÜLER TESTİ (Genişletilmiş) ===\n");

        String mesaj = "Faz 3 Test Mesajı";
        String alici = "05551112233";

        System.out.println("[Test 1: Strateji Kullanımı]");
        
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
    }
}
