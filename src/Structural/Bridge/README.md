# Bridge Design Pattern

- `Bridge` tasarım kalıbı büyük bir sınıfı ya da birbirine bağlı sınıfları iki farklı hiyerarşiye
ayırmamıza yardımcı olur. abstraction and implementation durumları birbirinden bağımsız olarak
  geliştirilir. 
  
- Bir diğer tanım da, bir soyutlamayı gerçekleştirmesinden ayır öyle ki ikisi birbirinden bağımsız
olarak değişebilsin.
  
###Problem
- Elimizde küre ve küp isminde iki sınıf olsun ve biz bunları ayrı ayrı mavi ve kırmızı olarak 
üretelim. Bu bizim elimizdeki sınıfları genişletmemize neden olur. Mavi küre, kırmızı küre, mavi küp ve
  kırmızı küp. Dahası yeni şekil eklediğimizde 2, yeni bir renk eklediğimizde 3 yeni sınıf yaratmak 
  zorunda kalırız ve bu geometrik olarak büyür.
  
  
### Çözüm

- Bu problemin nedeni Shape  sınıfımızı iki farklı interface ile genişletmeye çalışmamız.
Bu sınıf mirası ile ilgili çok yaygın bir sorundur.
  
- `Bridge` kalıbı kalıtım yerine nesne kompozisyonunu kullanarak bu sorunu çözmeye çalışır.
Bu arayüzlerden birini ayrı bir sınıf hiyerarşisine ayırarak, orjinal sınıfın bu yeni nesneye
  referans olarak bağlanmasını sağlayarak gerçekleştirilebilir. 
  
- Bu yaklaşımı kullandığımız takdirde. Renkle ilgili uygulamaları Shape'den ayırırız, ayrı bir 
interface içerisinde `Color` implemente ederiz. Shape ise bu `Color` interface'ine referans olarak
  alır. Shape'den türeyen küre ya da küp bu color interface'inin davranışını kendi içindeki methodlarda
  çağırır. Böylece istediğimiz renge boyadığımız bir şekli çizdirebiliriz.
  
- Bu andan itibaren yeni renkler eklemek `Shape` hiyerarşisini etkilemez. Aynı durum `Color` hiyerarşisi 
için de geçerlidir.

### Uygulanabilirlik

- `Bridge` tasarım kalıbını yekpare olan (monolithic) sınıfınızı bölmek ve organize etmek 
istediğinizde ve bu sınıfınıza çeşitli fonksiyonalite eklemek istediğinizde (örneğin sınıfınızın
  çeşitli database'ler ile aynı anda çalışmasını istediğinizde) kullanabilirsiniz.
  
  - Bir sınıf çok büyüdüğünde, çalışma dinamiklerini anlamak ya da değişiklikler yapmak zorlaşır.
  Kodun bir noktasında yapılan değişiklik tüm sınıfa yayılabilir. bu da hatalara ya da yan etkilere
    neden olur.
    Bridge kalıbı monolothic sınıfı çeşitli sınıf hiyerarşisine bölmenize olanak sağlar. Bundan sonra
    her bir hiyerarşideki sınıfı bağımsız olarak değiştirebilirsiniz. Bu yaklaşım kod bakımını
    kolaylaştırır ve kodun kırılmasının önüne geçer.
    
- Bu kalıbı bir sınıfı bir kaç bağımsız boyutta genişletmeniz gerektiğinde kullanabilirsiniz.

  - Bridge sınıfı çeşitli hiyerarşilere ayırmanızı tavsiye eder. Orjinal sınıf ilgili işleri 
  kendisi yapmak yerine bu hiyerarşilere delege eder yani iletir ve gerçekleştirir.
    
- Uygulamaları çalışma zamanında değiştirmek istiyorsanız Bridge kullanın.

  - Bridge kalıbı ile soyutlama katmanındaki referansın implementasyonunu değiştirebilmenize
  olanak sağlar. Bu yönüyle Strategy kalıbı ile karıştırılabilir. Bu kalıp sınıf yapılandırmanıza
    yardımcı olur. 

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