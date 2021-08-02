# Prototype Design Pattern

- Prototype bir yaratımsal tasarım kalıbıdır. Çalışma mantığı var olan objeleri kopyalarayak
kullanılmasını sağlar.
  
###Problem
- Diyelim ki bir objeniz var ve siz bu objenin aynısında kopya yaratmak istiyorsunuz, bunu 
nasıl yaparsınız. Klasik çözümü nesnenin sınıfından new ile yani bir nesne yaratırsınız ve bu
  yeni yarattığınız objenin değerlerine kopyalamak istediğiniz nesnenin değerlerini geçersiniz,
  bu sayede istediğini nesne kopyasını oluşturursunuz.
  
- Fakat burada bir sorun var bazı nesnelerin alanları gizlidir siz isteseniz bile değer veremezsiniz,
nesnenin dışından her alanına erişemeyebilirsiniz sonuç olarak aynı kopyayı elde edemeyebilirsiniz.
  
- Bunun yanında bir diğer problem de yeni bir nesne üretme işlemini sınıf üzerinden yaparsak, o sınıfa
bağlımlılığımız artacaktır. Herhangi bir değişiklikte kodlarımız kırılabilir. 
  
- Bazen de bağımlılığımız interface üzerinden gerçekleştirilir, mesela bir methoda geçtiğimiz interface 
ile bağımlılığı sağlarız.
  
### Çözüm

  - Prototype tasarım kalıbı klonlama işlemini klonlanan gerçek nesnelere devreder. 
    
  - Klonlanmasını istediğimiz bütün nesnelerin implemente etmesi gereken `Clonable` interface'ini
alırlar. Bu interface `clone` methoduna sahiptir ve implemente eden sınıflar bu methodu override 
    ederek kendi kopyalarını oluştururlar. 
    
  - Bu işlem bütün sınıflarda benzerdir. Uygulayan sınıfın bir instance'ını yaratır ve kopyalanan
instanceın değerlerini bu nesneye geçerek yaratılan nesneyi döndürür. Bu sayede private alanları 
    bu method içinden erişerek yeni nesneye set edebiliriz.
    
  - Bu şekilde kendinden kopyalanmayı sağlayan nesnelere `prototype` deriz. Eğer sınıfınız pek çok alanı 
ve bu alanların farklı şekillerde uygulanması durumu varsa, sınıfınızdan alt sınıflar oluşturmak
    yerine clonlamayı tercih edebilirsiniz.
    
- Bu durumun çalışma mantığı, eğer elinizde bir sınıf ve bu sınıfın alanlarına göre oluşabilecek
pek çok durum var. Mesela bir hesap sınıfınız var ve alanları içinde aktif hesap, pasif hesap, 
  dondurulmuş hesap gibi boolean değerler ile belirtilen durumlar var. Bu sınıfı alt sınıflara 
  bölmek yerine, clonlama ile aynı sınıfın bu durumlara göre yaratılmış kopyalarını geriye 
  döndürebilirsiniz.
    
### Tasarım Kalıbının Yapısı

- Bu kalıbı uygulamak için öncelikle sınıfımız `Clonable` interface'ini implemente etmeli ve
bu interface'in clone methodunu override etmeli. Bu metot kendi türünden bir örnek yaratıp geri 
  dönmeli. 
  
- Bu süreç içerisinde nesnenin sahip olduğu durumlara göre bazı bağımlılıklar yeniden düzenlenebilir.
Nesnenin durumu farklı şekillerde değiştirilebilir. 
  
- İstemci oluşturduğu bir prototype'dan daha sonra çeşitli durumlara göre yeni clone lar yaratabilir
ve kullanır.
  
- Bu tasarım kalıbını belli prototipleri bir pool içinde oluşturup ihtiyacımız olduğunda oradan
clonlayabiliriz.
  
### Uygulanabilirlik

- Prototype tasarım kalıbı ihtiyacınız olan nesnelerin yaratılması sürecinde sınıfa ve constructor
a bağımlılığını ortadan kaldırır.
  
- Bu durum başka bir uygulamadan interface aracılığı ile size geçilen nesnelerde oldukça fazla kullanılır.
Bu somut nesneleri siz bilmezsiniz, aradaki bağımlılığınız ortadan kalkar.
  
- Prototype tasarım kalıbı klonlanması istenen her nesne için genel bir interface sağlar (`Clonable`).
Bu arabirim istemci kodunu klonladığı somut nesne sınıflarından bağımsız hale getirir.
  
- Prototype tasarım kalıbını ilgili nesnelerin farklı constructor çağrılarının oluşturduğu durumlarda
alt sınıf yaratmayı engellemek için kullabilirsiniz. Bu durumlara ait nesnelere oluşturulup kopyalarak
  kullanılabilir.
  
- Prototype kalıbı yapılandırılmış nesneler oluşturulmasını sağlar.

### Uygulanması

- `clone` methoduna sahip bir prototype interface'i yaratın veya hali hazırda bulunan `Clonable` 
interface'ini kullanın.
  
- 

  
### Artı Eksiler
