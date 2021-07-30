# Singleton Design Pattern
Singleton Tasarım Kalıbı iki probleme çözüm getirir fakat bu sırada Single Responsibility Principle'ı ihlal eder.
Çünkü srp ye göre bir sınıfın yalnızca bir sorumluluğu olmalı. Fakat Singleton aynı anda iki probleme yönelik
sorumluluk üstlenir.

- Bir sınıfın yalnızca bir instance'ı (örneği ya da heap'de bir nesnesi) olmasını garanti eder.
Peki bunu neden isteyelim. Sebebi genel olarak diğer sınıfların ortak olarak kullandığı kaynaklara erişimi kontrol
etmektir.

  Mantığı şudur, örneğin kullanmak için bir obje yarattınız ve bir süre sonra aynı objeden başka bir yerde bir daha
kullanma ihtiyacı doğdu, bu durumda yeni bir obje oluşturmak yerine hali hazırda head'de yaratılmış objeyi kullanabilirsiniz.

  Fakat bunu başarmak için sınıfın constructor'ını normal şekilde kullanamayız. Bu bizi objelerin yeniden yaratılmasına
götürür. Constructor ı private ile dışa kapamalıyız.


- Bir diğer çözüm bir nesneye global olarak ulaşma ihtiyacı.
Bazı durumlarda global olarak kullandığımız nesneler(değişkenler) olabilir. Global değişkenler gibi. Fakat bu sınıfları kullanmak
güvenli değildir. Bu sınıflara ait değişkenler değiştirilerek uygulamanın uzun vadede göçmesine sebep olabilir.
  Singleton da global değişkenler gibi programın her yerinden erişilebilirler. Fakat global değişkenlerin aksine
kendi içeriği değişime karşı korurlar. 
  Bu problemin bir diğer yönü ise birinci problemi çözen durumdaki kodların bütün programa dağılmasının önüne geçmek.
Eğer kodlarınız böyle bağımlılıklar içeriyorsa, kodların dağılması yerine bir yerden yönetilmesi daha iyi bir çözüm olabilir.

### Çözüm
- default constructor ı private yaparak new operatörü ile nesne yaratmanın engellenmesi.
- public static metot ile creation (yaratma işinin) gerçekleştirilmesi ve size bu metodun yeni bir obje dönmesi, tabi
  bu durumda metotdun objeden bir tane yaratılmış olmasını kontrol etmesi.

### Hangi Durumlarda Uygulamalıyız?
- Singleton kalıbını program içinde bir sınıfın diğer tüm sınıflara açık olarak kullanabileceği durumlarda , örneğin
  database bağlantısı gibi paylaşılan bir objenin yaratılması ve tüm sınıfların kullanımına açılması durumunda kullanabilirsiniz.

- Singleton sınıf yaratım sürecinin bütün noktalarını engellemek zorundadır, özel creation metodu dışında. Bu metod
  ya yeni bir obje yaratmalı ya da daha önce yaratılmış olan nesneyi döndürmelidir.

- Singleton'u global değişken oluşturmak ya da kullanak zorunda kalırsanız uygulayın.
- Global değişkenlerin aksine singleton istenen nesneden bir tane olmasını garanti eder, bu sayede önbelleğe alınmış
  bilginin singleton dışında erişimine ve yerini almasına izin veremez. Örneğin singleton ile yaratılmış bir db nesnesi heap'de
  bulunurken başka bir db nesnesi onun yerini alamaz. (Fakat bu durumu sağlamak için Thread safe olmasına dikkat etmemiz gerekir)
  Bunun yanında singleton ile istediğimiz sayıda nesne de ürebiliriz. Creation metodunu kontrol ederek bu ayarlamayı yapabiliriz.

### Artı Eksi Yönleri
+ Bir sınıftan bir tane yaratılmasını garanti eder.
+ Global olarak bir instance'a ulaşılmasını sağlar.
+ Bir obje yalnızca ilk kez istendiğine yaratılır. (lazy initialization)

- Single Responsibility Kuralını ihlal eder.
- Kötü tasarım'ı maskeler, programın sınıfları singleton hakkında çok fazla bilgiye sahip olabilir. Bağımlılığı arttırır.
- Multithreaded yapılar içinde lock'lamalar ile birden çok thread'in aynı anda creation metoduna ulaşarak
  birden çok nesne yaratabileceği durumların önüne geçilmelidir. (volatile keyword'u ile ulaşılan bilginin yalnızca
  bir thread tarafından yaratılması garanti altına alınır)
- Unit test yazmak durumunda olduğumuzda unit test freameworkleri abstract yapı üzerinden mock objelerini üretirler.
  Bu durumda singleton nesneleri yaratılamaz, singleton nesnenin mock olarak yaratmasının bir yolunu bulmalısınız ya da
  test yazmamalılısını ya da Singleton kullanmamalısınız.