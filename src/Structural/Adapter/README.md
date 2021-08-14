# Adapter Design Pattern

- Bir sınıfın arayüzünü başka bir sınıfın beklediği arayüze çevirir. Adaptör, uyumsuz arayüzleri sebebiyle
çalışamayacak sınıfların bir arada çalışmalarını sağlar.
  
  
###Problem
- Sıklıkla farklı yapılarda geliştirilmiş sınıfları bir arada kullanmak isteriz.

- Sınıfların farklı yapıda olmaları, kullanım açısından bakıldığında farklı arayüze sahip olmaları
anlamına gelir.
  
- Bu durumda farklı arayüze sahip sınıfları kullanmak gittikçe karmaşıklaşan istemci sınıflarına 
sebep olur.
  
- İstemcilerin sıklıkla birden fazla arayüzle haberleşmeleri ve aralarında gerekli 
çevirmeleri yapmaları gerekir.
  
- Bu ise problemli bir yaklaşımdır. 
  
### Çözüm

  -  Olması gereken, uyum problemini uyumu sağlayacak bir sınıfta çözmektir. 

- Bu sınıf, var olan istemciyi, uyumsuz arayüze sahip olan sınıfla çalışabilir hale 
getirecektir.
  
- Bu sınıf `Adapter` dir. 

- `Adapter` sınıfı, uyumsuz sınıf ile istemcinin kendisiyle çalışmasını bildiği arayüz
arasına girer ve uyumsuz sınıfı, o arayüzle uyumlu hale getirir. 
  
- Bazen adapterler uyumsuz nesneyi uyumlu hale getirmekten daha çok iş yapabilirler.

- Adapter nesnesi arada başka işler yapabilir. 

- İki yönlü olarak da adaptor nesneleri tanımlayabiliriz. 
### Tasarım Kalıbının Yapısı

- Adapter tasarım kalıbı işimize yarayan ama istediğimiz, çağırmasını bildiğimiz arayüze sahip olmayan nesneyi 
kullanılabilir yapar.  (US power source -> işimize yarayacak ama kullanamıyoruz.)
  
- Bunu da istediğimiz arayüze sahip olmayan nesnenin arayüzüne dokunmadan, onu bir adaptör yardımıyla
sarmayalarak gerçekleştirir. 
  
- Artık uyumsuz nesnenin yeni arayüzü `Adapter` nesnesi tarafından belirlenmiştir. 
    - Adapter, uyumsuz nesnenin wrapperı olmuştur.
    
- Adapter'ün ne kadar iş yaptığı, uyumsuzluğun miktarıyla ilgilidir. 


### Uygulanabilirlik

- `Adapter` kalıbını hali hazırda var olan bir sınıfı kullanmak istediğinde fakat onun 
interface sana uygun değilse kullanabilirsiniz.
  
- Bu kalıp kodunuz ile eski bir sınıf, 3. parti bir sınıf ya da uyumsuz bir arayüz 
arasında bilgileri çeviren orta katman olarak kullanmanızı sağlar.
  
- Üst sınıflara eklenemeyen bazı ortak işlevlerden yoksun mevcut birkaç alt sınıfı yeniden
kullanmak istediğimizde bu kalıbı kullanabiliriz.
  

### Uygulanması

- En azından iki tane uyumsuz interface sahip iki sınıfımız olduğunu düşünelim.

  - İşe yarar ve değiştiremeyeceğiz bir service sınıfımız olduğunu düşünün. 
  - Bu service sınıfından faydalanmak isteyen bir ya da daha çok istemci sınıfı.
  
- Bir istemci arayüzü tasarlıyoruz ve istemcinin bu service sınıfı ile iletişim
kurmasını sağlıyoruz.
  
- Adapter sınıfı yaratıyoruz ve tanımladığımız interface'i implemente ediyor. 

- Adapter sınıfına service sınıfında bir nesne oluşturuyoruz. Genel uygulama bu 
nesneyi constructor'da initialize etmektir, fakat bazen adapter sınıfına bu nesneyi
  vererek de çalışabiliriz.
  
- Adapter sınıfı içerisinde client interface'inin methodlarını implemente ediyoruz. 
Adapter methodları implemente ederken service sınıfının hizmetlerini methodlara 
  yansıtmalıdır. Bu sayede aradaki dönüşüm gerçekleşebilsin.
  
- İstemci interface sayesinde adapter'i kullanacak hale gelmelidir. Bu sayede client 
kodunu değiştirmeden ya da extend etmeden adapter ile service nesnesini kullabiliriz.
  
### Artı Eksiler

+ Single Responsibility Principle -> Arayüzleri ve data dönüşümlerini bussiness katmanından
ayırarak srp ye uygun dizayn yaparız.
  
+ Open/Closed Principle -> Yeni tipte adaptorler yaratarak client kodunu değiştirmeden
interface'ler aracılığı ile adapterleri kullanarak çalışmaya devam ederiz.
  
- Toplam karmaşıklık artar, yeni arayüzler ve sınıflar yaratmak durumunda kalırız. Bazen service sınfını
değiştirmek uyumluluğu bozmayabilir.