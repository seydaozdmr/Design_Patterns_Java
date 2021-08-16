# Decorator Design Pattern

- `Decorator` nesneleri davranışları içeren özel sarmalayıcı (wrapper) nesnelere yerleştirerek
yani davranışlar elde etmemize yardımcı olur.
  
- Mirasa alternatif sağlar. 
  
###Problem
- Sıklıkla, yeni sorumluluğu ve yetkinliği tüm sınıfa değil, nesnelere eklemek isteriz.

- Sorumlulukları sınıfa eklemek için tipik olarak mirası kullanırız.

- Sınıflara yetklin eklemek için miras kullanılmasının en temel problemi, mirasın bir derleme zamanı 
  (compile-time) yapısı olmasıdır.
  
- Her yeni yetkinlik için kod değişikliği ve tekrar derleme (recompilation) gerekir.

- Ayrıca böyle çok yetkinliğin ve kombinasyonların söz konusu olduğu hallerde, hem derin ve geniş
nesne hiyerarşileri oluşur hem de çoklu miraz kullamk zorunda kalırız.
  
  - n farklı sorumluluk için n! alt sınıf yaratmak gerekebilir.
  
### Çözüm

- Miras (inheritance) ile is-a ilişkisi yerine nesne bileşimi (object composition) ile has-a 
ilişkisini kullanmak gerekir.
  
- Yeni sorumuluklar yeni alt sınıflarla yerine getirmektense, alt sınıf ihtiyacı doğran şeyi bir
dekorasyon- bezeme malzemesi, nesnesi olarak görmek ve sınıfın nesnelerine eklemek daha sağlıklıdır.
  
- Bu şekilde nesnenin en basit halinden başlayarak farklı dekorasyonlar uygulamak mümkün olacaktır.

- gof'un ikinci prensibi favor object composition over class inheritance.

- Sınıf kalıtımı bir derleme zamanı yapısıdır ve çalışma zamanında değişemez.

- Nesne birleştirmesi ise çalışma zamanında yapılabilir.

- Dolaysıyla, kalıtım (inheritance) static, bileştirme (decorator) ise dinamik bir yapıdır.

- Bu sebeple bileştirme, çok sayıda farklı durumu ifade etmede esneklik sağlar.


  
### Örnek

- Bir bildirim library ile çalıştığınızı hayal edin. Bu kütüphane kendisini kullanan programların
kullanıcılarına bildirim göndermelerine yardım ettiğini düşünün.
  
- Kütüphanenin ilk versiyonunda `Notifier` isimli bir sınıf olduğunu ve bu sınıfın bir kaç tane alan
  (field) , constrcutor ve yalnızca `send` methoduna sahip olduğunu düşünün. Bu method istemciden bir 
  mesaj argüman alıyor ve liste olarak tuttuğu maillere bu mesajı gönderiyor. 
  
- Bu noktada zamanla kütüphaneyi kullanan kişilerin yalnızca e-mail dışında bildirim de göndermek
istediklerini fark ediyorsunuz. 
  
- Pek çoğu sms olarak bildirim almak isterken, bazıları facebook, slack gibi kanallardan bildirim
almak isteyebilir.
  
- Klasik çözüm `Notifier` sınıfını extend etmek ve yeni bildirim özelliklerini alt sınıflara 
eklemektir. İstemci yeni alt sınıfları kullanarak istediği bildirim gönderme özelliklerini kullanabilir.
  
- Fakat çözüm bu kadar basit değil, eğer bütün bildirim gönderme özelliklerini bir sınıf üzerinden
çalıştırmak istersek. Çok acil bir durum olduğunda her kanaldan bildirim göndermek isteriz.
  
- Kalıtım ile yeni alt sınıflar yaratme yoluna gidebiliriz bütün bildirim özelliklerini kapsayan.
Fakat bu çözüm kütüphane kodunu ve istemci kodunu aşırı derecede şişirecek ve alt sınıf patlamasına
  neden olacaktır.
  
- Bu sorunu kalıtım kullanmadan daha iyi bir şekilde çözmek zorundayız.

### Problemin Çözümü

- Bir nesnenin davranışını değiştirmek istediğimizde aklımıza gelen ilk yöntem interitance'dır.
Fakat bununla beraber farkında olmamız gereken bazı sorunları olabilir.
  
  - İnheritance static'dir. Run time da değişiklik yapamayız. Kodun baştan derlenmesi gerekir.
  - Alt sınıfların yalnızca bir parent sınıfı vardır, pek çok dil çoklu kalıtıma izin vermez.
  
- Bu problemi çözmenin yollarından biri inheritance yerine aggregation(toplama) ya da composition (bileştirme)
kullanmaktır. Her iki çözğmde de bir nesnenin referansı vardır ve bazı işler ona devredilir (delegates).
  Oysa kalıtımda nesnenin kendisi bu işi yapabilir, davranış üst sınıftan devralınır.
  
- Bu yeni yaklaşımla, bağlantılı "yardımcı" nesneyi başka bir nesne ile değiştirebilir ve çalışma
zamanında kapsayıcının davranışını değiştirebilirsiniz.
  
- Bir nesne çeşitli sınıfların davranışını kullanabilir, birden çok nesneye referans verebilir 
ve onlara her türlü işi devredebilir. 
  
- `Wrapper` bu desenin ana fikrini uygulayan `Decorator` kalıbının alternatif takma adıdır.

- `Wrapper` bası hedef nesnelere bağlanabilen bir nesnedir. `Wrapper` hedef nesnenin sahip olduğu
aynı method grubuna sahiptir ve aldığı istekleri delege eder. Bununla birlikte `wrapper` isteği
  hedefe iletmeden önce veya sonra bir şeyler yaparak sonucu değiştirebilir.
  
- Peki bir sarmalayıcı nasıl `decorator` olur. Bunu sarmaladığı nesne ile aynı interface'i implemente
ederek yapar. İstemcinin bakış açısına göre ikisi de aynı tür nesnedir. 
  
- Sarmalayıcının referans alanının bu interface'i implemente eden bütün nesneleri kabul etmesini
sağlayın.
  
- Bu tüm sarmalayıcıların birleşik davranışını ona ekleyerek, bir nesneyi birden çok sarmalayıcıda 
decore etmenize olanak sağlar.
  
### Uygulanabilirlik

- 
