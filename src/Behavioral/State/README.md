# State Design Pattern

- `State` bir nesnenin iç durumu değiştiğinde (herhangi bir state'i) davranışının
da değişmesine olanak tanıyan davranışsal bir tasarım kalıbıdır. Nesne durumu
  değiştiğinde sınıfı da değişmiş gibi görünür. 
  
###Problem
- Uygulamalarda sıklıkla karmaşık durumlara sahip sınıflarla karşılaşabiliriz.

- Burada amaçlanan durum herhangi bir zamanda, nesnenin durumu sonlu sayıda olabilir,
uygulamanız bu durumlar içinde geçiş yaptığında davranışı da değişmelidir. Ancak nesne
  mevcut durumuna bağlı olarak bazı durumlara geçebilir ya da geçmeyebilir.
  Transitions olarak nitelendirilen bu kurallar sonludur ve önceden tanımlanmalıdır.
  Bu tarz bir kod yapısının bakımının yapılması oldukça güçtür. Çünkü meydana 
  gelecek değişiklikler transitions yapısının değişmesine if-else durumlarının
  eklenmesine sebep olacaktır.

  
### Çözüm

- `State` tasarım kalıbı bu durumun çözümü için, yeni bir sınıf yaratılmasını, bu sınıfa
oluşabilecek tüm olası durumların da bu sınıfa extract edilmesini önerir. Dolaysıyla
  nesnenin üzerinden çağırdığımız methodlar bu ayrı durumları temsil eden sınıflarda ayrı ayrı
  davranacak şekilde override edilir- gerçekleştirilir. Sınıfların ortak davranışları ise
  üstteki tipte soyut olarak toplanır. 

### Uygulanabilirlik

- 

### Uygulanması

- 
  
### Artı Eksiler

+ 