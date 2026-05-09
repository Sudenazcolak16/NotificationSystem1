## 1. AI'dan İstenen İnceleme (Prompt)
"Yazdığım Factory Method uygulamasını tasarım desenleri ve temiz kod prensipleri açısından incele. NotificationService'in nesne oluşturma sorumluluğundan kurtulması doğru şekilde sağlandı mı?"

## 2. AI Yanıtı (Özet)
AI kodumu inceledi ve şu geri bildirimleri verdi:
* **Doğru Uygulama:** `Notification` arayüzü (interface) kullanımı sayesinde 'Dependency Inversion' prensibine uyulduğu, servisin somut sınıflara bağımlılığının bittiği onaylandı.
* **Eleştiri/Öneri:** `NotificationFactory` içindeki `createNotification` metodunun parametre olarak aldığı `String` değerinin ("SMS", "EMAIL") küçük/büyük harf duyarlılığı nedeniyle hata riskine açık olduğu belirtildi. Daha güvenli bir yapı için `Enum` kullanılması önerildi.

## 3. Benim Uygulamam ve Kararım
AI'ın önerdiği `Enum` yapısı mantıklı olsa da, projenin bu aşamasında (Phase 1) temel amacımız nesne yaratma mantığını fabrikaya taşımaktı. Bu yüzden:
* **Aynı Bıraktığım Kısım:** Nesne üretimini `static` bir fabrika metoduyla yapmaya devam ettim, çünkü bu yapı şu anki ihtiyaçlarımızı karmaşıklık yaratmadan karşılıyor.
* **Öğrendiğim Nokta:** Gelecek fazlarda hata payını azaltmak için `String` yerine daha katı tip kontrolü (Type Safety) sağlayan yapılar kullanmanın önemini not ettim.
