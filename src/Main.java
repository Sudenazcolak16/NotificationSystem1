package src;

public class Main {
    public static void main(String[] args) {
       
        NotificationService service = new NotificationService();

        System.out.println("========= FAZ 1: FACTORY METHOD TESTI =========");

        
        service.send("SMS", "Sisteme giriş yapıldı.", "555-123-4567");

        System.out.println("-----------------------------------------------");

        
        service.send("EMAIL", "Haftalık rapor hazır.", "ogrenci@universite.edu.tr");

        System.out.println("-----------------------------------------------");

        
        service.send("PUSH", "Bu tür henüz desteklenmiyor.", "User123");

        System.out.println("===============================================");
    }
}
