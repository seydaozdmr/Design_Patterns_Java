# Builder Design Pattern

- Builder karmaşık nesnelerin adım adım yaratılmasını sağlayan yaratımsal bir tasarım kalıbıdır.
Bu kalıp aynı objesinin constructor'larını kullanarak farklı tipte ya da sunumda nesne yaratmanıza 
  izin verir. 
  
### Problem
- Yaratmak istediğimiz nesnenin pek çok alanı ya da iç sınıfı olduğunu hayal edin. Bu sınıfın
initialize kodu çok fazla parametre alan constructor'ında bulunur. Ya da daha kötüsü istemci 
  kodlarının içine karışmış olabilir. (Not: nesnenin olası her durumu için alt sınıf oluşturmak
  çözümden çok karmaşıklığa sebep olur.)
  
- Örneğin bir `House` nesnesi yaratmak istediğimizi düşünelim. Basit bir ev yaratmak için; dört duvar, taban,
bir kaç tane pencere, kapı ve bir çatı olması yeterli. Fakat biz geniş bir bahçesi olan daha büyük bir 
  ev yaratmak istersek ve içerisinde gelişmiş sistemler bulunan. 
  
- Bu durumda yapılabilecek en basit hareket `House` sınıfını extend etmek ve tüm bu yeni kombinasyonlara
uygun alt sınıflar yaratmaktır. Fakat günün sonunda elimizde kayda değer miktarda alt sınıf olacaktır.
  Her bir yeni parametre, veranda tipi gibi, bu hiyerarşinin büyümesine sebep olacaktır.
  
- Bu yaklaşımın yani sıra bir diğer yaklaşımda olabilicek bütün ihtimalleri içeren tek bir sınıf oluşturup,
bütün bu ihtimalleri taşıyan devasa constructor ile house sınıfını kontrol etmektir. Bu yaklaşımla
  birlikte alt sınıf yaratmamıza gerek kalmaz falan başka bir probleme neden oluruz. 
  
- İhtiyacımız olmayan alanları taşıyan nesneler, içerisinde bolca null bulunan constructorlar.Sadece yüzme 
havuzu olan ev 10 parametresi olan sınıfın 9 paratmeresinin boşa çıkmasına sebep olabilir.
  
### Çözüm
- Builder kalıbı nesnenin oluşturulma kodlarını (construction) kendi sınıfından çıkartıp 
aynı bir nesne üzerine taşımınızı önerir.
  
- Builder kalıbı karmaşık nesnelerin yaratılma sürecinin adım adım oluşturmanıza olanak sağlar.
Bu sırada başka nesnelerden oluşturulan nesneye erişilmesine izin vermez.
  
- Builder kalıbı obje inşa sürecini bir dizi adıma bölerek organize eder. Objeyi yaratmak için, builder
objesinde bir dizi adımı gerçekleştirmeniz gerekir. Buradaki önemli nokta her adımı tek tek
  gerçekleştirmenize gerek yok. Sadece istediğiniz belirli özelliklere sahip nesnenin oluşturulması
  için gerekli adımları gerçekleştirmeniz yeterli.
  
- Ürünün farklı sunum şekillerinden birini elde etmek istediğinizde, ilgili adımların gerektirdiği 
farklı implementasyonlar olabilir. Örneğin kulibe yapmak için duvarlarının ağac olması gerekir,
  fakat kale yapmak isterseniz duvarlar taş olmak zorundadır.
  
- Böyle durumlarda çeşitli builder sınıfları yaratarak benzer building adımlarını bu sınıflar yardımıyla 
gerçekleştirebilirsiniz. Bu builder sınıflarını kullanarak farklı çeşitte nesneler üretebilirsiniz. 
  Farklı builder'lar farklı adımlarla aynı nesneyi(farklı türde) oluştururlar.
  

### Director

-  Daha da ileri gidebilir ve bir ürünü oluşturmak için director isminde bir sınıf içirisine builder adımlarını
ayırabilirsiniz. Director sınıfı inşa süreçlernin hangi adımlarla gerçekleştireceğini belirler, bu süreçleri builder
   sağlar.
   
- Director istenen ürünü hangi building adımları ile gerçekleştireceğini bilir.

- Director sınıfını kullanmanız çok da gerekli değildir. İstemci olarak istediğiniz sırada building adımlarını çağırabilirsiniz.
Eğer çok çeşitli inşa rutinleriniz varsa bunları director ile bir yerde toplayıp daha sonra tekrar kullanmanız yararlı olabilir.
  
- Director inşa sürecini istemciden tamamen soyutlar. İstemci sadece ilgili builder'ı directorle birlikte kullanır ve 
istenen nesneyi elde eder.
  

### Örnek Durum

- Örnek durumda oluşturulan Builder tasarım kalıbı ile aynı obje yaratma kodunu tekrar kullanarak
farklı türdeki ürünleri, bir araba ve arabanın kullanım kılavuzunu yaratmayı göreceğiz.
  
- Araba karmaşık bir nesnedir ve inşa etmenin yüzlerce farklı yolu olabilir. `Car` sınıfında 
devasa constructor kullanmak yerine, arabayı oluşturan parçaların kodunu ayrı bir `CarBuilder` sınıfına
  extract ediyoruz. Bu sınıf aracın çeşitli parçalarını oluşturan bir dizi methoda sahiptir.
  
- Eğer istemci özel bir araç modeli oluşturmak istiyorsa, kendi özel isteklerine göre, direkt olarak
builder ile çalışabilir. Fakat belirli bir aracı (spor araç, sedan araç, ...) hazır olarak almak istiyorsa;
  director sınıfı içerine builder sınıfının özelliklerini kullanan kodları yerleştirerek, director üzerinden alabilir.
  
- Her aracın bir kullanım kılavuzu vardır. Bu kılavuz araç yaratma süreçlerinin benzeri şekilde 
oluşturulabilir. Bu sebeple aracın construction sürecini kullanma kılavuzunda tekrar kullabiliriz. Kullanma kılavuzu ile
  araç tabi olarak aynı değildir, bu yüzden kullanma kılavuzunu build eden ayrı bir concrete builder sınıfı yaratmak zorundayız.
  
- Bu building sınıfı aracı oluşturan building sınıfı ile ortak methodları kullanabilir. Tek farkı birinde parçalar üretilirken
diğerinde tanımlanır. Director sınıfına builder'ı geçerek `Car` ya da `CarManuel` nesnesi yaratabiliriz.
  
- Sonuç olarak elde ettiğimiz ürünlerden biri metal bir nesne diğeri kağıttan oluşan bir nesne fakat ikiside bir biri ile ilişkili.
Elde etmek istediğimiz ürünün concrete builder sınıfını director'a geçmeden ürün elde edemeyiz. 
  

  
### Uygulama Durumu

- Builder kalıbı ile teleskobik (çok fazla parametre alan) constructor dan kurtuluruz.

- Elimizde 10 parametre olan bir constructor olduğunu düşünelim. Böyle bir constructor'u çağırmak 
uygun değildir bu yüzden overload ederek daha kısa sürümlerini elde ederiz. Yine de bu constructorlar
  default değerleri uzun constructor a geçerler. 
  
- Builder kalabı nesneyi adım adım inşa etmeni sağlar, yalnızca istediğin durumları geçmen yeterlidir.
Bu kalıbı uyguladıktan sonra bir sürü constructor a ihtiyacınız yoktur.
  
- Builder kalıbını aynı ürünün farklı gösterimlerine ihtiyaç duyduğunda kullanabilirsin. Örneğin
ev nesnesine ihtiyacın var, aynı kodu kullanarak taş ev ya da odun ev elde edebilirsin.
  
- Builder kalıbı ile ürünün çeşitli gösterimlerinin oluşturulması yalnızca implementasyonları farklı
fakat aynı adımların uygulanması ile mümkündür.
  
- Builder interface'i build aşamalarının hepsine sahiptir. Somut builder sınıfı ise bu adımları belirli 
şekilde kendilerine göre özelleştirmişlerdir. Bu sırada director sınıfı ise inşa sürecinin adımlarına 
  rehberlik eder.
  
- Builder kalıbını kullanarak karmaşık compozit (Composite tree) ya da karmaşık nesneler yaratabilirsiniz.

- Builder kalubu ile ürünün inşasını adım adım gerçekleştirebiliriz. Bu süreç gerçekleşirken adımları
sonuç ürününü alana kadar erteleyebiliriz. Bunun yanında adımları recursive şekilde çağırabilirsiniz.
  
- Builder inşa süreci devam eden bir nesneyi geri döndürmez.
  

  
### Nasıl Uygulanır

- Elde etmek istediğiniz ürünün bütün gösterimleri için ortak bir inşa aşaması belirleyin. Aksi durumda
kalıbı uygulamaya devam edemezsiniz.
  
- Bu adımları ana Builder interface'i içinde toplayın.

- Builder interface'ini implemente eden somut builder sınıfını yaratın. Sonuçta elde etmek istediğiniz 
ürüne ait build() methodunu uygulamayı unutmayın. Bu methodun interface içinde olmamasının nedeni, çeşitli
  builder sınıflarının ortak bir interface'e sahip olmayan ürünler oluşturabilmesidir. 
  
- Belirli nesneleri builder ile inşa etmek için director sınıfını yaratabilirsini. Bu inşa sürecini
encapsulate eder.
  
- İstemci builder ve director sınıflarını yaratır. İnşa süreci başlamadan istemci director a builder ı
geçer, director builder'ı kendi içinde ayarlar. 
  
- İstemci sonuç ürünün eğer bütün inşa süreçleri uygulanmışsa director'dan alabilir. Aksi durumda
builder'ı kullanarak sonuç ürününü elde eder.
  
### Artı Eksileri
+ Nesneleri adım adım inşa edersiniz, inşa süreçlerini erteleyebilirsiniz ya da recursive olarak inşa edebilirsiniz.
+ Aynı consturuction kodunu tekrar tekrar kullanarak çeşitli gösterime sahip ürünler edebilirsiniz.
+ Single Responsibility Principle -> Karmaşık construction kodunu iş mantığından ayırırız.


- Desen birden fazla sınıf yaratılma ihtiyacı arttıkça karmaşıklık artar.