1. **Genişletilebilirlik Sorunu:** Yeni bir bildirim türü eklemek için sürekli ana kodu (if-else bloklarını) değiştirmek zorundayız.

2. **Karmaşıklık:** Bildirim sayısı arttıkça if-else blokları içinden çıkılmaz bir hale gelecek (Spagetti Kod).

3. **Tek Sorumluluk Prensibi İhlali(SOLİD İHLALİ):** Bir sınıf hem bildirim türünü seçiyor hem de gönderim işlemini yapıyor.

4. **Kod Tekrarı:** SMS, Email gibi farklı türler için benzer mantıklar tekrar tekrar yazılıyor.

5. **Bakım Zorluğu:** Kodun bir yerini değiştirirken hata yapma riski çok yüksek çünkü her şey birbirine bağlı.



Al Cevabı

Tasarım Sorunları (Design Problems)

Katı Bağımlılık (Tight Coupling

Open-Closed Prensibi İhlali:

Tek Sorumluluk Prensibi (SRP) İhlali

Kod Tekrarı ve Spagetti Yapı:

Esneklik ve Genişletilebilirlik Eksikliği

Çözüm Önerileri

Factory Method (Fabrika Yöntemi):Bildirim nesnelerinin üretimini ayrı bir Factory sınıfına alarak if-else kalabalığını ana servisten uzaklaştırır.

Strategy (Strateji):Her gönderim yöntemini (SMS, Email) kendi sınıfına ayırır ve çalışma anında hangisinin kullanılacağını seçmemizi sağlar.

Decorator (Dekoratör):Mevcut sınıfları değiştirmeden, bildirimlerin üzerine "katmanlar" ekleyerek yeni yetenekler kazandırır.

Adapter (Adaptör):Farklı arayüzleri, sistemimizin beklediği arayüze dönüştürerek uyumlu çalışmasını sağlar.

Observer (Gözlemci):Nesneler arasında "yayıncı-abone" ilişkisi kurarak sistemin tepkisel çalışmasını sağlar.
