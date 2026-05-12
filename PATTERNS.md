
## Nerede Kullandım:

Bildirim nesnelerinin (Email, SMS gibi) oluşturulma sürecini main içindeki karmaşık yapıdan kurtarıp, bu işi üstlenen bir fabrika yapısına taşıdım. 

## Neden Seçtim:

Faz 0'da tespit ettiğim en büyük sorun, her yeni bildirim tipinde ana kodu değiştirmek zorunda kalmamdı. Factory Method sayesinde nesne üretimini soyutlayarak, istemci kodun (client code) hangi nesnenin nasıl üretildiğiyle ilgilenmemesini sağladım. 

## Ne Kazandım:

Artık yeni bir bildirim kanalı eklemek istediğimde mevcut sınıflardaki o meşhur if-else yığınlarına dokunmuyorum. Bu da bana daha esnek bir yapı ve daha temiz bir nesne yaratma süreci kazandırdı.

##  önce
![UML Diyagramı 2](docs/diagrams/umldiyagrami%20(2).png)
## sonra
![UML Diyagramı 1](docs/diagrams/umldiyagrami.png)


