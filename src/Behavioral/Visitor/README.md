# Visitor Design Pattern

- `Visitor` tasarım kalıbı algoritmaları ya da operasyonları nesnelerden ayırmamıza
olanak sağlayan davranışsal bir tasarım kalıbıdır. Visitor sayesinde sınıflar üzerinde
  değişiklik yapmadan, sınıflar üzerinde yeni operasyonlar yürütmemizi sağlar.

### Problem

-  Zamanla nesnelere yeni davranışlar kazandırmamız gerekebilir. Bazen istediğimiz
davranışlar bir biri ile alakalıdır ve bir interface içinde tanımlayacak bir grup
   davranışı belirli bir nesne grubuna uygulayabiliriz. Bazı durumlarda ise istediğimiz
   bu davranşlar nesneden nesneye değişebilir. Bir sınıfın alt tiplerinin yeni davranışlara
   sahip olması gibi. 
   
- Bu durumda davranışları nesneler üzerinde tanımlamak uygun değildir. Bu durum cohesion 'ın düşmesine
sebep olur. Parçalar çok farklı davranışlara sabip olurlar.   
  
- Bu şekilde oluşturulan bir nesne hiyerarşisinde sorumluluklar sınıflara ve alt sınıflara
dağılır. Bunun yerine her işi ayrı bir sınıf olarak ele alınması ve nesnelerin bu işlerden 
  bağımsız olarak modellenmesi daha rahat bir sistem ortaya koyabilir.
  
- Eğer aynı hiyerarşide bulunan sınıflara farklı yetkinlikler kazandırırsak, bu durumda
bunları çalıştırmak için sınıfların tiplerini instance of, is gibi if-else içinde
  bulmamız ve sınıfın tipinin özelinde yaratılan davranışı çağırmamız gerekir.
  
- Bu duruma double disptach denir. Önce tip kontrolu yapılır daha sonra nesnenin
davranışı çağırılır. 

### Çözüm

- Karşılaştığımız bu gibi durumlarda, yeni davranışları nesneler üzerinde oluşturmak
yerine, bu davranışı bir visitor sınıfı içerinde tanımlamak ve bu ziyaretçinin davranışlara
  ihtiyaç duyan nesneleri ziyaret ederek davranışları gerçekleştirmelerini sağlamak daha
  uygun bir çözümdür.
  
- Davranışlara özel olarak geliştirilmiş ve nesneleri ziyaret ederek davranışları onlar 
üzerinden gerçekleştiren nesneye visitor denir. 

### Uygulanabilirlik

- Karmaşık bir nesne yapısının (Nesne ağacı gibi) tüm öğelerine üzerinde bir işlem
yapmanız gerekirse visitor kullanın. 
  
- Visitor kalıbı ile bir dizi nesne grubu üzerinde aynı işlemin çeşitli türevlerini
uygulayabilirsiniz. 
  
- Nesne üzerindeki yardımcı methodları temizlemenize olanak sağlar bu sayede nesnenin
daha odaklı (cohesion'u yüksek) olur. 
  
- Bu kalıbı bir sınıf hiyerarşisindeki yalnızca bazı sınıfların bazı davranışları
gerçekleştirmesini sağlamak için de kullanabilirsiniz.
  
- Belirli bir davranışı Visitor sınıfına extact ederek, yalnızca ilgili sınıfların 
nesnelerini kabul eden bu visitor nesnelerinde uygulayabilirsiniz.
  
  
