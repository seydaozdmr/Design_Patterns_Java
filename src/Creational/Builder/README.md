# Builder Design Pattern

- Abstract Factory belirli obje ailelerine ait nesnelerin tip belirtmeden yaratılması
için kullanılır.
  
### Problem
- Elimizde mobilya mağazası simülasyonu olduğunu varsayalım. Her mobilya takımı
kendi içerisinde berjer, koltuk ve sehpa olmak üzere 3 adet nesneden meydana gelsin.
  Ve her bir takımın Modern, Avangart ve Klasik olmak üzere üç farklı kategorisi olsun.
  Bizim her bir farklı kategoriyi taşıyan nesneleri yaratabileceğimiz ortak 
  creational sınıflarımız olmalı. Burada dikkat etmemiz gereken kelime bu yaratma işlemini
  (3 farklı sınıfın elemanını) aynı sınıf içinde yapıyor oluşumuz. Bu durum Factory Method
  ile Abstract Factory arasındaki temel farktır. Factory Method'da bir nesneyi
  bir creational sınıf içinde yaratıp kullanıyorduk.
  
- Buna ek olarak yeni bir takım mobilya geldiğinde ya da yeni bir eleman mesela (zigon sehpa) 
takımlara katıldığında kodumuzu kırılmaya sebep olmadan değiştirme şansı yakalamamız.
  
### Çözüm
- Mobilya mağazasında bulunan nesneleri interface olarak belirlemek ve concrete(somut) 
sınıfları vu interfaceleri implemente edecek şekilde yaratmamız gerekiyor. `Chair` interface 'ini
  kullanarak `AvangartChair`, `ClasicChair` şeklinde nesnelerimizi belirtmeliyiz.
  
- Devamında Abstract Factory interface'imizi `FurnitureFactory` oluşturmalıyız. Bu nesne gruplarının
yaratıcı methodlarının bir arada bulunduğu bir interface olmalı. Yani soyut olarak
  `createChair` , `createTable` gibi methodlara sahip olmalı ve soyut olarak bu nesnelerin
  yaratımsal tasarımını içermeli. 
  
- Soyut factory interface'imizi de oluşturduğumuza göre şimdi sırada yukarıda bahsettiğimiz
kategorileri oluşturan sınıflarımızın somut factory'lerini oluşturmak. Bu somut sınıflar abstract
  factory interface'imizi implemente etmeli ve orada soyut olarak tanımladığımız mobilya takımı 
  elemanlarımızı kategorisine göre yaratmalıdır. (methodları implemente ederek). Örneğin 
  `ClassicFurnitureFactory` kendi içinde takımı oluşturan `ModernChiar` `ModernSofa` ve `ModernTable`
  sınıflarını yaratmalı. 
  
- Bu durumda client ya da istemci factoryler ve ürünlerle soyut interfaceleri üzerinden çalışır.
Bu sayede istemci kodunda bulunan factoryleri factory base tipini değiştirmeden değiştirebiliriz, böylece
  client kodunu bozmdan client'ın elde ettiği mobilya takımını değiştirebiliriz.
  
- İstemci yalnızca factory'den `Chair` üretmesini ister. İstemci factory sınıfının içeride ne yaptığını
bilmek zorunda değildir ya da ne tür bir saldaye üretildiği önemli değildir. Bütün sandalyeler içerisinde
  aynı interface'e bağlı olarak `sitOn` methoduna sahiptir ve istemci hangi tür sandalye gelirse gelsin
  bu methodu sağlamış olur. Beraberinde gelen koltuk ve masa'da sandalye ile aynı takımı sahip olarak gelir.
  
- Geriye açığa kavuşturmamız gereken tek bir konu kalıyor. istemci yalnızca abstract 
interfaceleri kullanacaksa, somut factory nesneleri nerede yaratılıyor ya da hangi factory
  nesnesi yaratılıyor. Uygulama böyle durumlarda hangi factory sınıfının yaratılacağını
  config dosyalarında ya da çevresel (environment) ayarlarda belirler. Ve uygulamanın
  ayağa kalkacağı noktada bunlar gerçekleştirilir.
  
### Uygulama Durumu
- Aynı ürün grubu içinde bulunan soyut ürünler tanımlanır, örneğin sandalye,koltuk,masa.
- Tanımlanan soyut interfacelerin somut implementasyonları gerçekleştirilir. Modern sandalye, avangart sandalye...
- Abstract Factory interface soyut ürünlerin (bir nesne grubu olarak) yaratılmasını içeren metotlarla
birlikte tasarlanır.
  
- Abstract Factory'den somut ürün grubunu yaratacak olan concrete factory sınıfları Abstract Factory i
implemente eder. 
  
- Ürünleri yaratan somut factory sınıfları, ürünlerin somut hallerini yaratsalar bile geriye soyut olarak
döndürürler. İstemci somut factory sınıfları ile, bu sınıflar kendi objeleri ile soyut interfaceler üzerinden
  iletişim kurduğu sürece birlikte çalışabilir.
  
### Uygulanabilirlik
- Abstract Factory kalıbını benzer durumda bulunan bir dizi sınıf nesnesini yaratmak zorunda
olduğumuz zaman kullabiliriz. Fakat bu durum yaratmak istediğiniz nesnelerin somut örnekleri ile 
  bağımlı olacak şekilde tasarlanmadığında geçerlidir. Yani bu nesnelerin yaratılma süreçleri
  interfaceler üzerinden gerçekleştirileceklerdir. 
  
- Abstract Factory kalıbını elinizde birbirleri ile bağlantılı birden çok Factory Method 
var ise kullanmayı düşünebilirsiniz.
  
### Artı Eksileri
+ Bir factory sınıfından elde ettiğimiz ürünleri bir birleri ile uyumlu olmasını garanti ederiz.
+ Somut ürün nesneleri ile istemciler arasında sıkı bağlar oluşmasının önüne geçeriz
+ Single Responsibility Principle -> Ürün yaratma sınıfının bir yerde olması, kodu daha desteklenebilir 
hale getirir.
  
+ Open -Closed Principle yeni türden ürün gruplarını genişletebiliriz ve hali hazırdaki kodlar üzerinden 
değişiklik yapmayız ve kodlarımız kırılmaz.
  
- Kodlarımız olması gerekenden daha karmaşık hale gelebilir, çok fazla interface ve sınıf tanımlanabilir.

  