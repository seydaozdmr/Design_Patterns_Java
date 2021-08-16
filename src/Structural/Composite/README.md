# Composite Design Pattern

- Parça-bütün ilişkisini göstermek için nesneleri ağaç yapılarında ifade et. Bileşik nesne,
istemcilerin tekil nesneleri ve bu nesnelerin bileşiklerini aynı şekilde işlemesine izin verir.
  
  
###Problem
- Sıklıkla parçaların bir araya gelerek, bir bileşik(composite) nesne oluşturduklarını
görürüz.
  
- Yazılımda da sıklıkla nesneler arasında parça-bütün ilişkisi bulunur.

- Bileşik nesne (composite object) parçalardan oluşur.

- Böyle durumlarda, tek olan parçalarla, bütün olan bileşik nesne arasındaki ilişkiyi
yönetmemiz gereklidir.
  
- Ayrıca istemcilerin tek olan parçalarla, bütün olan bileşik nesneleri aynı şekilde
kullanabilmelerin isteriz.
  
- Bu şekilde, bileşik nesneyi kullanmanın istemciye fazla yük getirmemesini sağlarız. 
  
### Çözüm

- `Composite` kalıbında, öncelikle parçalar ile bütünün ortak bir arayüze sahip olması sağlanır.

-  Bu durumda istemci bileşik nesneyi de parçaları da aynı şekilde kullanır.

- Sonrasında, bileşik nesne ile parçalar arasındaki ilişki düzenlenir. 

- Bu amaçla bileşik nesnein bir torba (collection) arayüzüne sahip olması sağlanır.

- Dolaysıyla istemci, bütün-parça ilişkisinin karmaşıklığından uzak tutulur ve parçalar ile 
uğraşmayıp, sadece bütün ile iletişimde bulunur. 

    
### Tasarım Kalıbının Yapısı

- Örneğin `Component` iterface'i karmaşık nesneler (composite) ve basit nesnelerin uygulayacağı
ortak methodlara sahip olmalı.
  
- Component'tan türetilen bir ürün basit nesne olarak bu interface'i uygulasın.

- Karmaşık compisite nesnesi `Container` içerisinde karmaşık container'ları ve basit
ürünleri bulundursun. Bu sınıf component interface'ini taşıyan bütün alt sınıflara ile 
  birlikte çalışabilir. 
  
- İstemci componenet interface'ine sahip bütün elementlerle birlikte çalışabilir.

### Uygulanabilirlik

- Parça-bütün ilişkisinin olduğu yerlerde composite yapısı kullanılabilir. Ağaç benzeri
bir nesne yapısı uygulamanız gerektiğinde Composite kalıbını kullanabilirsiniz.

- İstemcinin, parça-bütün arasındaki farkı gözetmeden bu sistemi kullanması sözkonusudur.

- Bileşik nesne de aynı zamanda parçadır.

- Bu şekilde içiçe geçmiş pek çok parça-bütün ilişkisi yönetilebilir.

- İçinde dizin olan dizinler gibi...

- Bütün ile parçalar arasındaki ilişki tamamen bütün nesne tarafından yönetilir.

- Bu ilişki, iş alanlarına bağlı olarak farklı şekillerde gerçekleşebilir.

- Bileşik nesnelerdeki methodların özyinelemeli (recursive) olması gerekebilir.

- Sisteme yeni parçalar eklemek kolaydır. 

### Uygulama Durumu

- `Decorator` kalıbını nesneye ekstra yetkinlikler kazandırmak (run time'da) istediğinizde 
kullabilirsini (kodu değiştirmeden).
  
- Eğer nesne genişletme durumu çok zorsa ve ya mümkün değilse bu kalıbı kullanın.

- Bazı programlama dilleri final keyword'ü ile nesne mirasını yasaklamıştır. Bu durumda olan
sınıflar için decorator kalıbını kullanabilirsiniz.
  
