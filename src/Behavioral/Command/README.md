# Command Design Pattern

- `Command` davranışsal bir tasarım kalıbıdır. Command bir isteği, istekli ilgili tüm bilgileri içeren
bağımsız nesneye dönüştürür. Bu dönüşüm istekleri method değişikeni olarak iletmenize yardımcı olur,
  bir istediğin yürütülmesini geciktirmenize, sıraya koymanıza be ya geri almanıza olanak tanır.
  
- İstemciler mesajı hangi nesnenin aldığını bilmemekle kalmazlar aynı zamanda hangi metodun da mesajı
yerine getirdiğinden habersiz olurlar.
  
- Yan (yardımcı) methodlarla karmaşıklaşan nesne daha odaklı hale gelir.

### Problem

- Örneğin yeni bir text-editor uygulaması yazdığımızı hayal edelim. Sıradaki görevimiz içerisinde
editörü etkileyen çeşitli işlemlet olan bir sürü button'dan oluşan bir toolbar yaratmak olsun. Toolbar
  ya da iletişim kutularında kullanılmak üzere genel bir `Button` sınıfı yarattığınızı düşünün.
  
- Bu sırada tüm buttonlar aynı görünmesine rağmen, her biri ayrı bir iş yapmak zorundadır. 
Bu düğmelerin yaptıkları işe dair kodu nereye koyarsınız. En basit çözüm her bir her bir button
  için sub class yaratmaktır. Bu sınıfların her biri button'a tıklandığında ne yapması gerektiğine
  dair koda sahip olacaktır.
  
- Çok fazla düşünmeden bu yaklaşımın kusurlu bir yöntem olduğunu görebiliriz. Birincisi çok fazla
sayıda sub class'ınız olur. Eğer base Button sınıfı üzerinde değişiklik yapmaya kalkarsanız bütün 
  alt sınıflarda kırılmalar meydana gelir. Basitçe söylemek gerekirse GUI kodunuz iş mantığının 
  geçici koduna bağımlı hale gelir.
  
- Buna ek olarak bazı işlemlerin (metin kopyamala, yapıştırma) başka yerlerden başlatılması gerekir.

- Bazı durumlarda kullanıcı Copy button ile kopyalama işlemini yerine getirebildiği gibi, bazı durumlarda
Ctrl+C ile bu işlemi yerine getirmek isteyebilir.
  
- Bu durum da kod tekrarlarına sebep olur.

### Çözüm

- İyi bir yazılım tasarımı her zaman principle of separation of concerns ilkesi ile kurulmalıdır.

- Bu da uygulamanın katmanlara ayrılması ile mümkün olabilir. En genel uygulama olarak gui katmanı 
ve bussiness logic katmanı düşünülebilir. Gui katmanı ekrandaki görünümden, kullanıcı girişlerinden
  ve kullanıcının yarattığı sonuçları ekrana yansıtmaktan sorumludur. Fakat, yapılacak önemli işler, 
  çeşitli hesaplamalar yapmak ya da raporlar hazırlamak gibi, gui katmanı bu işleri bussiness katmanına
  aktarır. 
  
- Kodda gui nesnesi bussiness nesnesini çağırır, bazı argümanları geçer. Bu süreç genellikle bir 
nesnenin diğerine istek göndermesi olarak tanımlanır.
  
- `Command` tasarım kalıbı gui nesnesinin bu isteği doğrudan göndermesinin önüne geçer. Bunun yerine 
bütün bu istek dataylarını çıkarıp, tek bir sınıf üzerine tanımlanır ve tek bir metotlar tetiklenir.
  
- Command nesnesi gui ile bussiness logic arasında bağlantı olarak çalışır. Bu andan itibaren gui nesneleri
bussiness nesnelerinden hangisinin isteği aldığını ve hangi methodun çalıştığını bilmez. Gui nesnesi
  bütün iş mantığını yürüten methodları tetikler.
  
- Sıradaki diğer adım command nesnelerinin hepsinin aynı interface'i implemente etmesidir. Bu genellikle
parametre almayan tek bir method içeren interfacedir. Bu interface komutlara sahip somut nesneler ile bağımlılığı
  ortadan kaldırır. Buna ek olarak command nesneleri run time da değişterebiliriz bu sayede isteği gönderen
  nesnenin davranışı da değişir.
  
- Bu durumda istekleri işleyen methodun parametre almadığını fark etmiş olmalısınız. Gui nesnesi bussiness katmanına
bazı parametreler sağlamış olabilir. Command nesnesinin herhangi bir parametre almadığı durumda bu parametreleri nasıl alacağız.
  Bu durumda `Command` nesnesinin önceden yapılandırılmış verilere sahip olması ya da kendi başına
  bu verileri alması gerekmektedir. 
  
- Text editor uygulamamıza geri döndüğümüzde, `Command` tasarım kalıbını uyguladıktan sonra çeşitli tıklama
davranışlarını uygulamak için her bir işlemin alt sınıfını yaratmamıza gerek yok. `Button` sınıfı üzerinde command nesnelerine
  bir referans yaratmamız ve buttona tıklandığında bu işlemin command sayesinde execute edilmesini sağlamalıyız.
  
- Olabilecek tüm işlemler için command nesnesi yaratmalıyız ve ilgilini buttonlar ile bağlamalıyız. 

- Diğer Gui nesneleri de menüler, kısa yollar, diyaloglar aynı şekilde implemente edebilirler.
Kullanıcı gui ile etkileşime girdiğinde ilişkili commandı execute edebilirler. Bu operasyonlar
  ilgili benzer işlemler command nesnesine bağlanarak aynı işlemleri gerçekleştirirler ve kod
  tekrarının önüne geçilmiş olur.
  
- Sonuç olarak `Command` gui katmanı ile bussiness katmanı arasında bir katman olur ve bu iki katmanın
bağımlılığını azaltır. Kısacası command ile method seviyesindeki isteklerimizi sınıf seviyesinde soyutluyoruz.
  Sınıf içersinde ayrı ayrı ifade etmek yerine her birini ayrı sınıf yapıyoruz ve genel bir method ile execute gibi, 
  çalıştırıyoruz.
  
