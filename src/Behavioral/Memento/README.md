# Memento Design Pattern

- `Memento` tasarım kalıbı, bir nesnenin belirli zamanlardaki durumlarını (states)
saklayan ve gerektiği zamanda önceki bir duruma geri dönebilmemize olanak tanıyan
  davranışsal tasarım kalıbıdır.
  
###Problem
- Örneğin bir text editor uygulamanız var, yazılar yazıyorsunuz veya resim kopyalıyorsunuz,
Belirli zamanda yaptığınız değişiklikleri geri almak istiyorsunuz. Bu özellik yalnızca
  text editöründe değil, günümüzde pek çok uygulamada kullanılan ve gerekli bir özelliktir.
  Bu durumu gerçekleştirmek için yaptığınız her bir değişiklik bir collection üzerinde
  tutulur. Eğer istemci herhangi bir ana geri dönmek isterse bu collection üzerinden
  bilgiler alınır ve nesnenin durumuna atanır.


### Çözüm

- Problemin çözümünde encapsulation'ı ihlal etmemek için duruma ait bilgileri nesne
içerisinde yaratacağımız inner class içinde tutabiliriz. 

