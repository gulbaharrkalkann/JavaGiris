package DesignPattern.Observer.Pratik8;
/*
Senaryo
Subject: Bir ürünün stok durumu (Product).
Observers:
Customer: Stok güncellemelerini alır ve ürün stokta olduğunda haberdar edilir.
Supplier: Stok azaldığında yeniden stoklama işlemi için bilgilendirilir.
Açıklamalar
Product (Subject): Ürün stok bilgisini tutar ve gözlemcilere bildirir.
Customer (Observer): Stok bilgilerini alır ve müşteriyi bilgilendirir.
Supplier (Observer): Stok değişikliğini alır ve tedarikçi bilgilendirilir.
Kullanım: Stok değişiklikleri üzerinden müşteri ve tedarikçilerin haberdar edilmesi sağlanır.
 */
public class Main {
    public static void main(String[] args) {

        //Ürün oluştur
        Product product=new Product("Laptop",0);

        //Gözlemcileri oluştur
        Customer customer1=new Customer("Alice");
        Customer customer2=new Customer("Bob");
        Supplier supplier=new Supplier("Tech Supplier");

        //Gözlemcileri kaydet
        product.addObserver(customer1);
        product.addObserver(customer2);
        product.addObserver(supplier);
        //stok durumu değişikliklerini simüle et
        product.setStock(0);
        // Çıktı:
        // Product stock updated: 0
        product.setStock(5);
        // Çıktı:
        // Product stock updated: 5
        // Customer Alice received notification: Product: Laptop is now in stock. Current stock: 5
        // Customer Bob received notification: Product: Laptop is now in stock. Current stock: 5
        // Supplier Tech Supplier received notification: Product: Laptop is now in stock. Current stock: 5
        product.setStock(10);
        // Çıktı:
        // Product stock updated: 10
        // Customer Alice received notification: Product: Laptop is now in stock. Current stock: 10
        // Customer Bob received notification: Product: Laptop is now in stock. Current stock: 10
        // Supplier Tech Supplier received notification: Product: Laptop is now in stock. Current stock: 10
    }
    }

