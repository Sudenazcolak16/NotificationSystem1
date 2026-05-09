package src;

public class AdminLogCenter implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[ADMİN PANELİ] Uyarı: Sistemden mesaj çıktı -> " + message);
    }
}
