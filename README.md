# LocalDBsetUp
Product ve Category tablolarının oluşturulmuştur. İki tablo arasındaki ilişkilendirme ve local veri tabanından veri çekme, ekleme,
silme ve güncelleme işlemleri yapılmıştır.

# Sistemdeki Modeller (Entity)
- Product
- Category
Olmak üzere 2 tane modelimiz var. Product ve Category modelleri arasında ManyToOne birilişki bulunmaktadır.
Çünkü birden fazla ürünün category bilgisi aynı olabilir.

# Nasıl kullanabilirim?
JPA/Hibernate ile geliştirilmiş Spring Boot projemizde herhangi bir tablo oluşturmanıza gerek yok. 
Yalnızca bir schema oluşturup veritabanınızın ismini belirledikten sonra "application.properties" dosyasında 
DataSource kısmının altındaki url adresini belirlemiş olduğunuz schema ismine göre düzenlenmeli 
ve username password alanlarını kendi veritabanı bilgilerinize göre girmelisiniz.

Projeyi isterseniz herhangi bir IDE yardımıyla çalıştırabilirsiniz istersenizde consol üzerinden çalıştırabilirsinz.
Konsol üzerinden kolayca çalıştırmak için;
Ana klasörde aşağıdaki komutu çalıştırın. Maven yüklü değilse bilgisayarınızda yükleyin.

mvn clean install
# Kullanılan Teknolojiler
- Spring Boot
- PostgreSQL

# Katmanlar
- Entities
- Controllers
- Services
- Repositories


