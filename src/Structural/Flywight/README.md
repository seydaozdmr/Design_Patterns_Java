# Flyweight Design Pattern

- Çok sayıda küçük nesneyi etkin bir şekilde sağlamak için paylaşmayı kullan. Flyweight yapısal
bir asarım kalıbıdır. Bir nesnenin ortak kısımlarını (field'larını) farklı nesnelerde tekrar tekrar 
  kullanmak yerine ortak kullarak daha az RAM kullanmamızı sağlar. 
  
###Problem
- Fine grained (ince elenmiş) yani küçük nesneleri çok fazla kullanamız gerektiğinde, bu nesnelerin
ortak alanlarını tekrar tekrar kullanmak uygulamamız içinde çok fazla yer kaplanmasına sebep olur.
  
- Örneğin bir kitabın modellenmesinde kullanılabilecek sayfa, paragraf, satır, kelime ve hark nesnelerini
düşünelim. Sayfaları tekrar tekrar yaratmak yerine bir sayfa üzerindeki elemanları değiştirerek tekrar
  tekrar kullanabilirim. 
  
- Bir oyun yazılımında bir insan nesnesini binlerce oluşturmak yerine, 100 lerce insan yaratarak 1000 lerce
insan olduğu algısı yaratabiliriz. 
  
### Çözüm

  - `Flyweight` tasarım kalıbı ile bir nesne farklı anlarda farklı bağlamlarda ortak olarak kullanılabilir
nesnedir. 
    
  - Bu kalıp kullanılarak oluşturulan nesne farklı bağlamlar tarafından ortaklaşa kullanılır ama nesne
her bağlamda bağımsız olarak davranır.
    
  - Yani nesne içinde bulunduğu duruma göre gerektiren bilgiyi edinir ve davranışını değiştirir. 
    
  - Bir oyundaki asker nesnesi bir bölümde havacı gözükebilir, başka bir durumda karacı gözükür her durum
için yeni nesne yaratmak yerine hali hazırdaki nesnenin durumu değiştirirsek aynı nesneyi iki durumda da
    kullanabiliriz.
    
- Flyweight nesnenin iki durumu vardır: 

    - Intrinsic state -> içsel durum 
    - Extrinsic state -> Dışsal ya da ikinci/arizi durum.
    
- İçsel durum nesnenin aslında ne olduğu ile ilgili durumdur. Örneğin bir harfin hangi harf olduğu.
- Dışsal durum ise bu nesnenin hangi satırda ya da hangi kelimede durduğu. 
- Başka bir örnek bir askerin fiziksel olarak durumu içsel durumu, askerin kıyafeti, rengi, konumu
dışsal durum. dışsal durum duruma göre değişen kısmı. 
  
- Uygulamalarda içsel durumu aynı fakat dışsal durumu farklı çok sayıde nesneye ihtiyaç duyulur.

- Örneğin bir harf nesnesi `a` içsel durumu `a` dışsal durumu hangi satırda olduğu, altı çizili olup 
olmadığı, büyük ya da küçük harf olmasıdır.
  
- Burada flyweight nesnelerden aynı anda kaç tane kullanılacağı nesne sayısını belirleyen faktördür.

- Ne kadar az nesne yaratılırsa o kadar az bellek kullanılır. 
  

    
### Tasarım Kalıbının Yapısı

- Bu kalıbı uygulamak için faktory method ile nesnler oluşturulur.

- Oluşturulan nesneler bir nesne havuzuna konabilir. 

- Oluşturulan sınırlı sayıda nesnenin içsel durumu belirlenir. 

- Sonrasında oluşturulan nesneler farklı bağlamlarda tekrar tekrar kullanılabilir.

- Bunu sağlamak için nesnenin dışsal durumu kullanılacak yere göre güncellenir. 

  
### Uygulanabilirlik

- Prototype tasarım kalıbı ihtiyacınız olan nesnelerin yaratılması sürecinde sınıfa ve constructor
a bağımlılığını ortadan kaldırır.
  
- Bu durum başka bir uygulamadan interface aracılığı ile size geçilen nesnelerde oldukça fazla kullanılır.
Bu somut nesneleri siz bilmezsiniz, aradaki bağımlılığınız ortadan kalkar.
  
- Prototype tasarım kalıbı klonlanması istenen her nesne için genel bir interface sağlar (`Clonable`).
Bu arabirim istemci kodunu klonladığı somut nesne sınıflarından bağımsız hale getirir.
  
- Prototype tasarım kalıbını ilgili nesnelerin farklı constructor çağrılarının oluşturduğu durumlarda
alt sınıf yaratmayı engellemek için kullabilirsiniz. Bu durumlara ait nesnelere oluşturulup kopyalarak
  kullanılabilir.
  
- Prototype kalıbı yapılandırılmış nesneler oluşturulmasını sağlar.

### Uygulanması

- `clone` methoduna sahip bir prototype interface'i yaratın veya hali hazırda bulunan `Clonable` 
interface'ini kullanın.
  
- Prototype sınıfımızda aynı sınıftan bir argüman alan constructor tanımlanmalı. Bu constructor parametre
olarak gelen bütün bilgileri sınıfın içindeki alanlara vermelidir. Eğer kullanacağınız dil buna izin vermezse
  bu kopyalama işlemini özel bir method yardımıyla gerçekleştirebilirsiniz. 
  
- Klonlama işlemi yalnızca bu constructor'ın new lenmesi ile gerçekleştirilebilir. Not: `Clonable` interface'ini
implemente eden sınıflar ve bundan türetilen alt sınıflar `clone` methodunu override etmek zorundadır. Aksi
  halde `clone` methodu üst sınıfın kopyasını geri döndürür.
  
- Bunun dışında, sık kullanılacak prototype nesnelerinin kaydını merkezi bir sınıfta tutabilirsiniz ve gerektiğinde
kopya oluşturarak kullanabilirsiniz. Bunu yeni bir sınıfta yapabileceğiniz gibi prototype'ı olasını istediğiniz
  sınıf içerisinde static method olarak tanımlayabilirsiniz ve dışardan elde edebilirsiniz. 
  

  


  
### Artı Eksiler

+ Nesneleri somut sınıfa bağımlı olmadan kopyalayabilirsiniz.
+ Önceden klonlanmış nesneleri kullanarak yeni klonlar elde edebilirsiniz. Tekrardan initialize etmenize gerek
yoktur.
  
+ Karmaşık nesneleri daha düzgün bir şekilde üretebilirsiniz.
+ Nesnelerin durumlarına göre alt sınıf yaratmak yerine klonlamayı kullanarak farklı durumlara göre
farklı klon nesnelerini prototype olarak çağırabiliriz.
  
- Dairesel referansa sahip nesneleri klonlamak karmaşık olabilir.

### Diğer Tasarım Kalıpları İle İlişkisi

- Prototype tasarım kalıbını Abstract Factory, Factory Method ile beraber kullanılabilir.


