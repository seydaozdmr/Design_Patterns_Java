# Mediator Design Pattern

- `Strategy` tasarım kalıbı, bir algoritma ailesi tanımlamanıza, bunların herbirini ayrı sınıflara
koymanıza ve kullanmak istediğinizde değişitirilebilir olarak (interface'in altında) çağırmanıza
  olanak sağlar.
  
###Problem
- Bir navigasyon uygulaması yazdığınızı ve bir şehirde istenen konuma göre rota çizdiğini düşünün.
Uygulamanız araç kullanıcıları için mükemmel bir çözüm yaratacaktır. Fakat zamanla yayalar için,
  bisikletler için ya da toplu taşıma kullananlar için de algoritmalar geliştirdiğinizde, kodunuz
  sürekli büyüyecek ve algoritmalar birbiri içine karışmaya başlayacaktır. Kod üzerinde yapılacak 
  değişiklikler tüm uygulamayı etkilemeye başlayacaktır. Oluşabilecek bugların ise çözümü oldukça
  zorlaşacaktır.
  
### Çözüm

- Problemin çözümü her bir algoritmayı ortak bir arayüz altında ayrı ayrı sınıflarda ifade etmektir.
Böylece her bir strateji ayrı somut sınıflarda bulunacaktır. İstemci içinde bulunduğu duruma göre 
  sizden bir navigasyon algoritması isteyecek, sizde içinde bulunduğu duruma uygun olan strateji ile
  navigasyon işlemini gerçekleştireceksiniz. 

### Uygulanabilirlik

- `Strategy` kalıbını bir algoritmanın farklı şekillerde çözüldüğü çeşitli tipleri olduğu ve
bazen bu çözüm yollarının değiştirilebildiği durumlarda kullanın.
  
- Aynı işi farklı şekillerde gerçekleştiren çok sayıda sınıfınız olduğunda Strategy tasarım kalıbını
kullanabilirsiniz.

### Uygulanması

- Sınıfınızdaki dikey boyutları belirleyin. Bu bağımsız konseptler abstraction-platform,
  domain/infrastructure, front-end/back-end, ya da interface/implementation olabilir.
  
- İstemcinin hangi methodlara ihtiyacı olacağını belirleyin ve ana soyut sınıfta tanımlayın.

- Tüm platformlarda kullanılacak olan methodları belirleyin ve soyutlamanın ihtiyacı olan genel
bir interface içinde tanımlayın.
  
- İmplementation inteface'indeki methodları somut sınıflarda yaratın ve tanımlayın.

- Ana soyutlama sınıfına implementasyon interface'ini referans olarak ekleyin. Soyutlama 
içinde yapılması gereken işleri referans olan implementasyona devretsin. 
  
- Eğer çok fazla üst seviye iş mantığına sahipseniz, genel soyutlama sınıfını genişleterek
her bir değişken için bir interface soyutlaması yapın.
  
- Client kodu, uygulamalarını soyutlama sınıfına iletir, arada yapılan implementasyonlardan haberi 
olmaz yalnızca ana soyutlama sınıfı ile çalışır.
  
### Artı Eksiler

+ Platformdan bağımsız sınıflar ve uygulamalar geliştirebilirsiniz.

+ Client kodu üst düzey soyutlamalar ile çalışır ve arka taraftaki detayları bilmez.

+ Open/Closed Principle. Mevcut kod yapısını değiştirmeden yeni soyutlamalar ve 
  implementasyonlar yaratabilirsiniz.
  
+ Single Responsibility Principle. Üst düzey iş mantığını soyutlama katmanında gerçekleştirip
platform detaylarını implementasyonlara bırakırsınız.
  
- Kodunuz cohesyonu yüksek sınıflarda çok karmaşık olabilir. 