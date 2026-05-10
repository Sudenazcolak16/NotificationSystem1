## Phase 2: Behavioral Patterns (Strategy & Observer)

Bu fazda, sistemin davranışsal esnekliğini artırmak ve bileşenler arası bağımlılığı (coupling) azaltmak amacıyla iki temel örüntü uygulanmıştır.

###  1. Strategy Pattern (Strateji Örüntüsü)
* **Nerede Uygulandı:** Bildirim gönderim sürecinde (`FastSendingStrategy` ve `EconomicSendingStrategy`).
* **Neden:** Bildirimlerin gönderim hızını ve maliyetini belirleyen algoritmaları, ana sınıflardan (Notification sınıfları) ayırmak için.
* **Ne Kazandık:** 
    - **Esneklik:** Çalışma zamanında (runtime) gönderim stratejisi değiştirilebilir hale geldi.
    - **Genişletilebilirlik:** Yeni bir gönderim modu (örn. `InstantDelivery`) eklendiğinde mevcut kodları bozmadan sadece yeni bir strateji sınıfı eklemek yeterli oldu.

###  2. Observer Pattern (Gözlemci Örüntüsü)
* **Nerede Uygulandı:** `AdminLogCenter` ve bildirim gönderim takip mekanizmasında.
* **Neden:** Sistemde gerçekleşen önemli olaylardan (bildirim gönderimi vb.) log merkezinin otomatik olarak haberdar olmasını sağlamak için.
* **Ne Kazandık:** 
    - **Gevşek Bağlılık (Loose Coupling):** `Main` sınıfı log merkezinin iç detaylarını bilmek zorunda kalmadan sadece olayları yayınlar (Publish).
    - **Otomasyon:** Manuel loglama yerine olay tabanlı otomatik bir takip sistemi kuruldu.

###  Mimari Diyagram Güncellemesi (Phase-2)
![Phase 2 Mimari](umldiyagrami3.png)
