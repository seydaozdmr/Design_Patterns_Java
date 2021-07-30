# Abstract Factory Design Pattern

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
  

  