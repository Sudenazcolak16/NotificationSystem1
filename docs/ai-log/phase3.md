1. Tartışılan Konular ve İlerleme
Strategy ve Observer Entegrasyonu: FastSendingStrategy, EconomicSendingStrategy ve Observer arayüzlerinin projeye nasıl dahil edileceği tartışıldı.

Commit Mesajı Standartları: Her sınıf için anlamlı ve açıklayıcı commit mesajları oluşturuldu.

Mevcut Kodu Koruma (Open/Closed Prensibi): En kritik tartışma burada yaşandı. NotificationService sınıfını değiştirmeden Main üzerinden bu desenlerin nasıl test edilebileceği üzerine odaklanıldı.

Hata Ayıklama (Debugging): Main sınıfında yaşanan "undefined method" hataları incelendi. Sınıfın içini değiştirmek yerine, Main test senaryosunu sınıflara doğrudan erişecek şekilde revize ederek "kod kırma" riskini ortadan kaldırdık.

2. Karşılaşılan Sorunlar ve Çözümler
Sorun: AI başlangıçta NotificationService sınıfının güncellenmesini önerdi, ancak bu durum Faz 1 kodunun değiştirilmemesi kuralıyla çelişiyordu.

Çözüm: AI ile yapılan diyalog sonucunda, NotificationService'e dokunmadan, nesneleri (Strategy ve Observer somut sınıflarını) Main içinde doğrudan örneklendirerek bağımsız bir test senaryosu kurgulandı.

3. Öz Değerlendirme Soruları
AI olmadan bu faz ne kadar sürerdi?
Cevap: AI olmadan bu faz muhtemelen 2-3 saatimi alırdı. Özellikle Strategy deseninin if-else yapısını nasıl ortadan kaldıracağını anlamak ve her dosya için doğru commit mesajlarını (hoca standartlarında) hazırlamak manuel süreçte zaman kaybettirici olurdu. AI sayesinde hata mesajlarını anında analiz edip çözüm üretebildik.

AI sizi nerede yanılttı?
Cevap: AI, başlangıçta NotificationService sınıfını tamamen modernize etmemi (içini değiştirmemi) önerdi. Bu teknik olarak doğru bir yaklaşım olsa da, projenin "mevcut kodu değiştirmeme" kısıtlamasını ilk etapta göz ardı etti. Bu noktada benim müdahalem ve kısıtlamayı hatırlatmamla birlikte, AI rotasını değiştirerek koda dokunmayan alternatif bir test senaryosu (Main düzenlemesi) sundu. Bu durum, AI'nın bağlamı bazen teknik
