# Template Design Pattern

- `Template` base class'ta bir algoritma şeması yaratıp,  sub class'larda bu algoritmanın belirli kısımlarını
override edip değiştirmenize olanak tanıyan bir tasarım kalıbıdır.

### Problem

- Örneğin data mining uygulaması yarattığınızı düşünün. Uygulamanız belirli formatlardan dosyaları açıp bilgileri
okuyor ve kapatıyor. Başlangıçta yalnızca DOC dosyalarını okuyan uygulamanız zamanla CSV ya da PDF dosyalarını da
  okumasını isteyeceksiniz. 
  
- Uygulamanızı genişleteceğiniz bu noktada farklı dosya formatlarını okuyan algoritmaların ortak yanları olduğunu
göreceksiniz. Aynı zamanda kodunusu kullanan istemci için de her bir dosya türü için if-else cehennemi yaratmış olacaksınız.
  

### Çözüm

- Böyle durumlarda algoritmanızı belirli adımlara bölerek soyutlayabilirsiniz. Aynı işlemleri tekrar eden adımlar, örneğin
dosyanın açılması, kapatılması ya da herhangi bir işleme adımı gibi, concrete olarak yazılır, soyut kalan ve dosya türüne
  göre değişen kısımlar ise bu yapıyı extend eden her bir sınıf içerisinde düzenlenir. 
  
- İşte bu genel sınıf içerisinde bulunan abstract ya da concrete methodları belirli bir sırada uygulayan methoda template
method denir. Bu bir nevi süreçsel methoddur. Bu durumda base class içindeki abstract methodları sub class larda 
  override etmemiz gerekir, concrete olan methodları ise override etmemiz isteğe bağlıdır.
  
- Bir sınıfta birden çok template method olabilir. Template methodları birbirini çağırabilir. Template method algoritmanın
doğasına göre farklı karmaşıklıkta olabilir. 

### Uygulanabilirlik

- Template methodu yalnızca istemcinin bazı kısımları genişletmesi gerektiği durumlarda kullanabilirsiniz.
Fakat algoritma adımlarının tamamı ya da yapının tamamını değil. 
  - Template method ile monolithic bir algoritmayı belirli adımlara ayrırsınız bu sayede alt sınıflarda
  bu adımlar genişletilir ve ana sınıfta belirlenen yapı içerisinde çalıştırılırlar.
    
- Template methodu bazı küçük farklılıklara sahip algoritmaların olduğu ayrı sınıflara sahip olduğunuzda 
kullanabilirsiniz.
  - Bu sınıflarda tekrar eden yapıları base class içierisinde impelement edebilirsiniz. 
    Bu sayede kod tekrarından kurtulursunuz.
  
