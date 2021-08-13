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

- Pek çok durumda dışsal durumu içeren nesneler ayrılarak context sınıfının içerisinde
saklanabilir. 
  
- Flyweight nesnelerinin içsel durumları immutable olmak zorundadır. Bir kere initialize edilmeli.

### Uygulanabilirlik

- Flyweight nesnelere daha uygun bir şekile erişmek için factory method kullanabilirsiniz.
Bu sayede pool içerisinden istediğiniz flyweight nesnesini çağırabilirsiniz. 
  
- Factory method istemciden içsel durumu ister, eğer pool içerisinde istenen flyweight 
nesnesi varsa geri döndürür yoksa pool a yeni bir tane ekler ve bunu geri döner.
  
- Flyweight kalıbını yalnızca uygulamanızın çok fazla nesne yaratması gereken ve RAM'in
zorlandığı durumlarda kullanın.
  
- Eğer uygulamanızdaki nesneler içerisinde paylaşılan durumlar varsa (tekrar eden)
bu durumları farklı nesnelere ayırabilirsiniz.

### Uygulanması

- Nesnenizi içsel (tekrar eden) ve dışsal (benzersiz) olmak üzere iki parçaya ayırın.

- Sınıfta içsel durumları immutable olacak şekide bırakın. Yalnızca nesne yaratılırken
ilk değerleri verilecek şekilde.
  
- Dışsal durumları kullanan methodlar yaratın. 

- İsteğe bağlı olarak factory methodları yaratın. Pool kurarak flyweight nesneleri pool
üzerinde toplayın ve dağıtın. 
  
### Artı Eksiler

+ Eğer benzer nesnelerden çok fazla yaratmak zorundaysanız, RAM'den kazanırsınız.

- Eğer bağlam verileri sürekli güncelleniyorsa, CPU ve RAM arasında çok fazla bilgi
akışı gerçekleşebilir.
  
- Kod yapınızda karmaşıklık meydana gelebilir. 