
1. Problem
Başlangıçta NotificationService sınıfı, hangi bildirim türünün (SMS, Email) oluşturulacağına if-else blokları kullanarak kendisi karar veriyordu. Bu durum, sisteme yeni bir bildirim türü eklendiğinde servis kodunun sürekli değiştirilmesini gerektiriyordu (Open-Closed prensibine aykırı). Nesne oluşturma mantığı ile iş mantığı birbirine karışmıştı.

2. Çözüm
Nesne oluşturma sorumluluğu NotificationService üzerinden alınarak NotificationFactory sınıfına devredildi. Servis artık somut sınıfları (SmsNotification, EmailNotification) tanımak yerine sadece Notification arayüzünü ve fabrikayı tanıyor.

3. Kazanımlar
Esneklik: Yeni bir bildirim türü eklemek için mevcut servis koduna dokunmaya gerek kalmadı.
Bakım Kolaylığı: Nesne oluşturma mantığı tek bir merkezde toplandı.
Gevşek Bağlılık (Loose Coupling): Sınıflar arası bağımlılık azaltıldı.


