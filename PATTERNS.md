# Faz 3: Yapısal Tasarım Örüntüleri (Structural Patterns)

Bu aşamada, mevcut sisteme yeni özellikler eklemek ve dış kütüphanelerle uyumluluk sağlamak amacıyla **Decorator** ve **Adapter** tasarım desenleri projeye dahil edilmiştir.

---

## 1. Decorator Pattern (Süsleyici Örüntüsü)

### Kullanım Amacı
Mevcut bildirim sınıflarının yapısını değiştirmeden, onlara çalışma anında (runtime) dinamik olarak yeni sorumluluklar (Loglama, ekstra güvenlik vb.) eklemek için kullanılmıştır.

### Uygulanan Sınıflar ve Roller
- **`NotificationDecorator` (Abstract Decorator):** `Notification` arayüzünü implemente eder ve içinde bir `Notification` nesnesi barındırarak diğer süsleyicilere temel oluşturur.
- **`LogDecorator` (Concrete Decorator):** Bildirim gönderilmeden hemen önce veya sonra loglama işlemi yaparak mevcut bildirim fonksiyonunu genişletir.

### Avantajı
Alt sınıflar oluşturup hiyerarşiyi karmaşıklaştırmak yerine, özellikleri "sararak" (wrapping) esnek bir şekilde eklememizi sağlar.

---

## 2. Adapter Pattern (Adaptör Örüntüsü)

### Kullanım Amacı
Sisteme sonradan dahil edilen ve mevcut `Notification` arayüzümüzle uyumlu olmayan dış kütüphaneleri veya eski (legacy) kodları sisteme entegre etmek için kullanılmıştır.

### Uygulanan Sınıflar ve Roller
- **`ModernSmsLib` (Adaptee):** Sisteme entegre edilmek istenen, ancak metot isimleri veya parametreleri uyumsuz olan dış kütüphane.
- **`SmsAdapter` (Adapter):** Dış kütüphaneyi sararak, sistemimizin beklediği `Notification` arayüzüne uygun hale getirir.

### Avantajı
Mevcut istemci kodunu (Main veya Service) değiştirmeden, tamamen farklı yapıdaki kütüphanelerin sistemle "konuşmasını" sağlar.

---

## Genel Proje Yapısı (Faz 1, 2 ve 3 Birleşimi)

Proje şu an 5 farklı tasarım deseninin uyum içinde çalıştığı bir mimariye sahiptir:
1. **Factory Method:** Bildirim nesnelerinin yaratılmasını sağlar.
2. **Strategy:** Gönderim algoritmalarını (Hızlı/Ekonomik) yönetir.
3. **Observer:** Sistem olaylarını takip eder.
4. **Decorator:** Bildirimlere dinamik özellikler ekler.
5. **Adapter:** Dış kütüphane uyumluluğunu sağlar.
