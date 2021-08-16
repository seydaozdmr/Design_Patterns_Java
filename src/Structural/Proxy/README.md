# Proxy Design Pattern

- `Proxy` tasarım kalıbı ile bir nesnenin yerin tutan ya da vekalet eden başka bir
nesne yaratılmasını sağlar. Proxy orjinal nesneye erişimi kontrol ederek, orjinal
  nesneye gönderilen istekleri denetleyen, ulaşmadan önce ve sonra bazı işlemler 
  gerçekleştirmenize olanak sağlar.
  
###Problem
- Bir nesneye erişimi neden kontrol etmek istersiniz? Elinizde çok büyük bir nesne olduğunu ve çok fazla 
sistem kaynağını tükettiğini düşünün. Bu nesneye zaman ihtiyacınız olabilir, her zaman değil. 
  Bu durumda lazy initialization kullanabilirsiniz. Nesneye yalnızca ihtiyacınız olan durumda yaratabilirsiniz.
  Bu durumu oluşturabilmek için tüm istemcilerin ertelenmiş başlatma kodlarına sahip olması gerekir. Bu da çok
  fazla kod tekrarına sebep olur.
  
- İdeal bir dünyada bu kodu nesnenin sınıfına koymak isteriz ama her zaman mümkün olmayabilir. Sınıfımız 3. party
library olabilir.
  
- Aynı zamanda nesneye direkt ulaşım güvenli olmayabilir.

- Teknik kısıtlar olabilir, nesnenin yaptığı iş uzun sürebilir ve thread-safe değildir. proxy istemciden aldığı
istekleri bir kuyruğa alarak (synchronous) istekleri (asynchronous) olarak çalıştırabilir. 
  
### Çözüm

- `Proxy` design patter bizlere nesne ile aynı interface'i implemente eden vekil `proxy` sınıf yaratmamızı 
önerir. Daha sonra uygulamımızda asıl sınıfı isteyen istemcilere oluşturduğumuz bu vekil sınıfı geçiyoruz.
 Proxy nesnesi istemciden bir istek aldığında, gerçek nesneden üretir ve bazı işlemler yaptıktan sonra işi
  ona devreder-iletir.
  
- Peki bunun faydası nedir? Proxy isteğin nesneye gitmeden önce (kısıtlamalar, ayıklamalar, loglamalar) ve gittikten
sonra bazı işlemlerin yapılabilmesien olanak sağlar. Proxy ile asıl nesnenin interface'leri aynı olduğu için, istemcinin
  asıl nesneden beklediği service'i proxy nesnesi ile sağlayabiliriz. 
  
### Örnek

- Elimizde youtube download sınıfı var ve istemci bir videoyu indirmek isterse bu sınıfa istek gönderiyor.

- Eğer aynı videoyu birden çok defa isterse sürekli indirip göndermek zorunda. Bunun yerine proxy sınıfını kullanarak
istemcinin istediği videoları tutabilir ve aynı istekleri sürekli gönderdiğinde sürekli yeniden indermeden cache 
  bilgisini istemciye geri döndürür.

    
### Uygulanabilirlik

- Eğer Lazy initialization (virtual proxy) kullanmanız gerekirse, Ağır bir service nesneniz olduğunu düşünün ve
sistem kaynaklarını çok fazla tüketiyor. Bu durumda yalnızca ona ihtiyacınız olduğunda yaratmak isterseniz vekil
  kullabilirsiniz.
  - Nesne yaratılmasını uygulama ayağa kalkarken gerçekleştirmek yerine, ona ihtiyacınız olan ana kadar erteleyebilirisiniz.
  
- Erişimi kontrol etmek istediğinizde (protection proxy). Bu durum service nesnenize yalnızca izin verilen istemcilerin
erişmesini istediğinizde kullanılabilir. 
  - Proxy yalnızca belirli kriterlere uyan istemcilerin kimlik doğrulamasını gerçekleştirir ve nesneye erişime izin verir.
  
- Uzakta bulunan bir service kendi local uygulamamızdan erişmek istediğimizde. (remote proxy)

  - Bu durumda proxy istemcinin isteğini alır ve ağ üzerinden gerçekleştirmesi gereken detaylı işlemleri gerçekleştirerek isteği asıl nesneye iletir.
  
- İstekleri loglamak (logging proxy). Service nesnesine giden istekleri loglamak ihtiyacı doğduğunda. 

  - Proxy service'e giden bütün istekleri loglar.
  
- İstek sonuçlarını cache'lemek. (caching proxy). Bu durum istemci isteklerinin cache'lenmesi ve bu bilgilere
ulaşılması gerektiğinde, service gitmeden proxy üzerinden döndürülmesini sağlar. 
  
  - Proxy tekrarlanan isteklerin sonuçlarını üzerinde tutar. 
  
- Akıllı referans olarak kullanılabilir. Ağır bir service nesnesini hiç bir istemcinin kullanmadığı durumlar olabilir.

  - Proxy nesneye istek gönderen istemcileri tutar, zamanla hiç bir istemci kalmayabilir. Bu durumda nesneye olan referansı
  kaldırarak, sistem kaynaklarının daha düzgün kullanılabilmesini sağlar.
    
