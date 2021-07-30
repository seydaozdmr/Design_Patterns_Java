# Factory Design Pattern

- Factory tasarım kalıbı bir yaratımsal kalıptır. Bu kalıp sayesinde
interface kullanarak obje yaratma sürecini gerçekleştiririz. Yaratmak 
  için dizayn ettiğimiz interface'den türettiğimiz subclass'lar ile
  hangi türden obje yaratacağımıza biz karar veririz.
  
- Örneğin bir lojistik şirketimiz olduğunu varsayalım. Şirket hiyararşisini
oluştururken taşıma işlemlerini karayolu ile ve kamyonlar aracılı ile 
  planlanmıştır.
  Bir süre sonra şirketin büyüdüğünü ve deniz taşımacılığı alanında
  yatırım yaptığını düşünün. Burada problem başlıyor. Bizim kurduğumuz
  yapı tamamen kamyonlar üzerine ve deniz taşımacılığına bunu uydurmamız
  gerekiyor.
  Kamyon taşımacılığı üzerine bina ettiğimiz uygulamamız içindeki yapılar da
  Kamyon sınıflarına bağımlı bir şekilde oluşturulmuştur. Deniz taşımacılığına
  uygun olarak yeni sınıflar yaratmak istersek bağımlılıklardan dolayı
  uygulamamızda kırılmalar meydana gelecektir. Aynı zamanda uygulamamız 
  switch ve if else cehennemine dönecektir.
  
- Dahası, kamyon taşımacılığı üzerine geliştirdiğimiz uygulamamızı deniz taşımacılığına
uygun hale getirmeye çalışsak bütün kodları değiştirsek bile ilerleyen
  zamanda hava taşımacılığı gibi başka alanlarda uygulamayı genişletmeye 
  çalışırsak daha bütük problemlerle karşılaşacağız. 
  
### Çözüm

  - Factory Method pattern ile obje yaratma süreçlerini direkt nesne
yaratmak yerine (new operatörü ile) factory sınıflarının içindeki özel 
    factory methodlar ile gerçekleştiririz.
    
  - Bu durumda nesneleri factory sınıfları içinde new keyword'ü ile yaratıyoruz
fakat dışa bu durum sınıf içinde gerçekleştiriyor. Ve bu nesne yaratma sürecini
    dış dünyadan soyutlamış oluyoruz. Bu sayede factory sınıflarının yarattığı 
    sınıfları ihtiyacımıza göre değiştirebiliyoruz ya da yenilerini
    ekleyebiliyoruz.
    
  - Bu süreç ilk başta anlamsız gelebilir, sonuçta her iki durumda da
new keyword'ü ile aynı nesneyi yaratıyoruz. Fakat yeni durumlarda factory
    methodu override ederek alt sınıflarda metodun yarattığı ürünü (sınıfı) 
    değiştirebiliriz. Bu sayade yeni durumlara açık hale gelir sistemimiz.
    
  - Bu duruma rağmen küçük bir sınırlama vardır, alt sınıflar farklı türden
nesne yaratabilir fakat yarattıkları nesneler ortak bir üst sınıftan
    türetilmiş ya da interface'i implemente etmeleri gerekir. Yani
    nesneler arasında bir ilişki olması gerekir. Kamyon nesnesi ile 
    Gemi nesnesini sonuç olarak taşıma aracı olarak sınıflandırılabilir.
    Ama Kamyon ile Arı nesnesinin mantıksal olarak birlikteliği yoktur.
    Sonuc olarak ortak factory sınıflarında yaratılamazlar.
    
### Örnek uygulama

- `Truck` ve `Ship` sınıflarının ikisi de `Transport` interface'ini implemente 
ediyorlar. Transport interface'inde deliver metodu var ve bu iki sınıf bu
  methodu override ediyorlar.
  
- `Factory` interface'inin implementasyonu olan `RoadLogistic` Truck nesnesi
yaratıyor, `SeaLogistic` ise Ship nesnesi yaratıyor. Her iki durumdada geriye
  `Transport` tipinde dönüş yapıyor. dolaysıyla istemci (Test.class) factory 
  den transport olarak alıyor.
  
- Burada test sınıfının kullandığı factory metodun ürettiği ve geriye döndürdüğü
nesneler arasında fark görmez sadece kullanır. Yani karşı factory sınıfından
  bir adet araç ister ve teslimatı gerçekleştirir.
  
- Gelen sınıfların hepsini soyut olarak `Transport` olarak değerlendirir.
- Test sınıfı yalnızca şunu bilir bütün `Transport` objeleri `deliver` methodunu
gerçekleştirecektir.
  
- Burada dikkat edilmesi gereken bir diğer önemli konu da, Factory method'un
yalnıca objeyi yaratmak dışında business görevler de yerine getirdiğidir.
  
### Uygulama
- Factory Method'u uygulamanızın ne kadar farklı tipte bağımlılığa sahip olacağını tam olarak
 bilmediğiniz zaman kullanabilirsiniz. Factory Metot uygulama ile uygulamanın kullandığı bağımlılığı
  ayırarak bağımlılığı interface üzerinden sağlar bu sayede uygulama genişletilmeye açık hale gelir.
  Uygulamanıza yeni bir sınıf eklemek istediğinizde yalnızca yeni bir creator alt sınıfı tanımlamanız
  ve factory metodunu override etmeniz yeterlidir.
  
- Factory Method' u kullanıcılarınıza tanımladığınız library ya da framework te bulunan bileşenleri
kendi isteklerine göre genişletmek istedikleri zaman bu olanağı tanımak için kullanabilirsiniz. 
  Inheritance (kalıtım, miras) framework ya da library'inizi genişletmek için uygulanabilecek en kolay 
  yoldur. Fakat burada sorun framework'un sizin tanımladığınız alt sınıfları, standart bileşen yerine 
  kullanabileceğini nasıl anlar. 
  Bunun çözümü bileşenleri oluşturan sınıfların Factory Method ile bir interface üzerinden yönetilmesi 
  ve bu bileşenlerin genişletmeye kapatılmasıdır.
  
- Örneğin HR isminde bir sınıfımız var ve bu sınıfımız Employee sınıfından elemanları tutuyor, yönetiyor.
Bu sınıfa biz Employee'nin alt tipinden Manager üretmesini ve tutmasını istiyoruz. Biz Employee sınıfını
  extend ettikten sonra HR'a gelip Employee'nin yanında Manager'da tutmasını sağlamamız gerekiyor.
  Bunun yerine Factory sınıf üzerinden createEmployee methodunu override ederek, Employee yanında Manager'da
  döndürecek şekide CreateEmployee ve CreateManager sınıfları oluşturup HR'ın tipe bakmadan Manager kullanmasını 
  sağlayabiliriz. Aradaki bağımlılığı soyut hale getirdikten sonra HR'ın istediğimiz şekilde Employee ile 
  ortak yönü olan sınıfları tutmasını ve yönetmesini kodu kırmadan yapabiliriz.
  
- Factory Method'u sistem kaynaklarını daha az tüketmek için her defasında yeni objeler yaratmak yerine
  hali hazırda oluşturulmuş objeleri kullanabilirsiniz.
  Database bağlantılarında, dosya sistemi işlemlerinde ya da network kaynaklarının kullanıldığı durumlarda 
  bu ihtiyaç ortaya çıkar. 
  Bunun için oluşturulan objelerin durumunu tutan bir kaynak bileşeni yaratmalıyız. Pool gibi, bir noktada
  elimizdeki nesnelere ihtiyaç duyulduğunda bu pool'da kullanılmayan obje var mı diye bakmalıyız, eğer varsa
  istemciye bu nesneyi dönmeliyiz. Yoksa yeni bir obje yaratıp bu pool'a atmalıyız.
  Bu senaryo çok fazla kod gerektiriyor ve tek bir noktadan yönetilmeli, code takrarından kaçınmak için.
  Açıkçası bu durum için en uygun alan tekrar kullanmak istediğimiz sınıfın constructorı olmalı. Fakat
  constructor tanımlanırken her zaman yeni bir obje yaratır. Hali hazırda yaratılmış instance ı döndürmez.
  İşte bu yüzden Factory Method ile nesneleri yaratan ve yaratılan nesnelerin tekrar kullanılabileceği bir yapıyı
  method üzerinden yönetebiliriz.
  
### Uygulanması
- Beraber üretilmesi planlanan bütün ürünlerin aynı interface'i implemente etmesi ve aynı metotları
uygulaması. Bu gelecekte eklenebilecek yeni ürünler için de aynı yolu açıyor.
  
- Creator sınıfının içine soyut bir factory method tanımlıyoruz. Bu methodun dönüş tipi yukarıda 
tanımladığımı interface olmalı. (sonuç olarak bu interface'in tipinde sınıflar yaratmalıyız.)
  
- Her bir ürün için creator interface'ini implemente eden creator sınıfları yaratmalıyız. Ve factory
methodu override ederek yaratılmasını beklediğimiz ürünün (sınıfın-nesnenin) constructor'ı ile oluşturduğumuz nesneyi
  geriye dönmeliyiz. Nesne yaratma süreçlerinde bu factory method çağrıları ile nesneyi yaratırız.
  
- Eğer pek çok sınıf türü ve bu sınıfları yaratan pek çok creation sınıfı olduğu durumlarda, factory creation base
sınıfındaki yaratıcı metodun kontrol parametresini bu alt sınıflara dağıtabilirsiniz. 
  