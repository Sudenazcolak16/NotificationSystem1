## 1. Neler Konuştuk ve Nasıl İlerledik?

Strateji ve Observer Kurulumu: FastSendingStrategy ve EconomicSendingStrategy gibi yapıları projeye nasıl yedireceğimizi, Observer arayüzüyle bildirim durumlarını nasıl takip edeceğimizi tartıştık. 

Commit Standartları: Hocanın istediği düzende, her dosya ve değişiklik için anlamlı commit mesajlarını nasıl yazacağımı belirledik.  Kodu Değiştirmeden Geliştirme (OCP): En önemli konu buydu. Mevcut NotificationService sınıfına hiç dokunmadan, sadece yeni sınıflar ekleyerek sistemi nasıl genişletebileceğimi (Open/Closed Prensibi) tartıştık. 

Hata Ayıklama: Main sınıfında yaşadığım "metot bulunamadı" hatalarına baktık. Sınıfın içini değiştirmek yerine, Main içindeki test senaryosunu sınıflara doğrudan erişecek şekilde güncelleyerek mevcut yapıyı bozma riskini önledik.

 ## 2. Sorunlar ve Çözümler Sorun: 
 Yapay zeka başta bana NotificationService sınıfının içini tamamen değiştirmemi önerdi. Ama bu durum, önceki fazlarda yazdığım kodu değiştirmeme kuralına (OCP) ters düşüyordu.  Çözüm: AI ile konuşarak bu hatayı fark ettim. NotificationService sınıfına dokunmak yerine, yeni stratejileri ve gözlemcileri doğrudan Main içinde tanımlayıp sistemi test eden bağımsız bir senaryo kurguladık.
 
 ##  3. Öz Değerlendirme AI olmadan bu faz ne kadar sürerdi?
 
AI olmasaydı mantığı kurmak ve if-else yapısından tamamen kurtulmak muhtemelen 2-3 saatimi alırdı. Özellikle strateji deseninin sınıflara nasıl dağıtılacağını ve hata mesajlarını tek tek manuel çözmek vakit kaybettirirdi. AI sayesinde bu süreci hızlandırıp mantığa odaklanabildim.  AI sizi nerede yanılttı?
AI, projenin "eski koda dokunma" kısıtlamasını unutup bana sınıfın içini modernize etmeyi önerdi. Teknik olarak doğru olsa da ödev kurallarına aykırıydı. Bu noktada kuralı ben hatırlattım ve AI rotasını değiştirerek koda dokunmayan bir test senaryosu sundu. Bu da bana AI'ın her söylediğini direkt almamak gerektiğini, kuralları takip etmenin benim sorumluluğumda olduğunu gösterdi.
