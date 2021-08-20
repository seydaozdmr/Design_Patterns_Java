# Iterator Design Pattern

- `Iterator` bir torba nesnesinin elemanlarına, arka planda yatan yapıyı ortaya çıkarmadan sıralı olarak erişmeye
yardımcı olan yapıdır.

### Problem

- Genellikle birden fazla nesneyi bünyesinde barındıran torba ya da kolleksiyonlar ile uğraşmamız gerekir.

- Torbaların yapısından bağımsız olarak torbadaki nesnelere sıralı olarak ulaşmak isteriz.

- Her torba için farklı bir erişim sistemi yerine hepsine tek bir şekilde ulaşmak istemci açısından tercih edilir.

- Bu durumlarda Iterator tasarım kalıbını kullanırız. 

### Çözüm

- Iterator kalıbında, öncelikle torba nesnelerinin olması gereklidir.

- Sonrasında, torba nesnenin elemanlarına ulaşan Iterator nesneleri oluşturulur.

- Her Iterator nesnesi erişimle ilgili farklı bir davranışa sahip olabilir.

- Çünkü farklı torbalarda erişim yöntemleri olabilir. 


  
