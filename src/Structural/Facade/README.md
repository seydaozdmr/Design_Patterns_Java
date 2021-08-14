# Facade Design Pattern

- Facede bir library'e, framework'e ya da karmaşık sınıf grubuna basitleştirilmiş
bir arayüz sağlayan yapısal bir tasarım modelidir. Facade alt sistemleri daha kolay
  kullanmak için daha yüksek seviyeli bir arayüz sağlar.
      
###Problem

- Bir library'e ya da bir framework'e bağlı çok fazla nesne grubu ile birlikte çalışmanız
gerektiğini hayal edin. Normalde, tüm bu nesneleri initialize etmeniz, bağımlılıkları
  takip etmeniz ve iş içeren methodları doğru bir sırada çalıştırmanız gerekir.
  
- Bu süreç uygulamanızın bu library'lere ve onların detaylarına sıkı bağlanmasına
sebep olur ve bu durum anlaşılması ve bakımlarının yapılmasının zorlaşmasına sebep olur.
  
### Çözüm

- `Facade` tasarım kabılı pek çok parça içeren alt sistemlerin işlemlerini basitleştiren
bir sınıftır. 
  
- Facade yapısı doğrudan alt sınıflarla çalışmaya kıyasla daha az detay sağlar. Fakat, yalnızca 
istemcinin önemsediği işlemleri kapsar.
  
- Facade kullanmak, pek çok özelliği olan bir library ile bu library'nin çok az bir kısmına ihtiyaç
duyduğunuz anlarda işe yarar.
  
- Örneğin yalnızca kedi videoları yüklemek istediğiniz bir uygulamanız var ve upload
etmek için profesyonel bir library kullanmak durumunda kaldınız. Oysaki sizin ihtiyacınız
  encode(fileName, format) yalnızca bu method. Böylece bu library ile iletişime geçecek
  bir sınıf yarattınız (yalnızca bu methodu çalıştıran), işte bu sınıf facade'dır.

### Tasarım Kalıbının Yapısı

- Facade'ı karmaşık yapıları basitleştirmek için kullanın. Alt sistemleri bir arada 
kullanmak karmaşıklığa sebep olabilir. Facade bu şekilde karmaşık sistemlere ait yapıları
  bir araya getirip yöneten bir yapıdır. Böylece yalnızca istemcinin hızlı bir şekilde
  sonuç almasına yardımcı olur.
  
- Facade'ı alt sistemler arasında katmanlı bir yapı elde etmek için kullanabilirsiniz.
Alt sınıflar arasında facade katmanları yaratabilirsiniz. Yalnızca facade noktalarını
  kullanarak alt sistemlere olan bağımlılığı azaltabilirsiniz.
  
