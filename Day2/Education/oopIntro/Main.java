package Education.oopIntro;

import java.util.ArrayList;

/**
 ** @apiNote Nesne Yönelimli Programlama
 ** @apiNote Classlar; 1) Özellik tututcu, 2) İş Yapıcı
 */
public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(); // örnek oluşturma, referans oluşturma, instance oluşturma
        product1.setId(0);
        product1.setName("Lenovo");
        product1.setDetais("v14");
        product1.setUnitPrice(15000);

        Product product2 = new Product(2, "MacBook Pro", 20000, "MacBokk Pro");
        Product product3 = new Product(3, "Huawei", 15000, "MateBook 16");
        ArrayList<Product> products = new ArrayList<Product>() {
            {
                add(new Product(1, "Monster", 15000, "Abra v15"));
                add(product1);
                add(product2);
                add(product3);
            }
        };

        System.out.println("\nÜrünler:");
        for (Product product : products) {
            System.out.println(product.getName());
        }

        ArrayList<Category> categories = new ArrayList<Category>() {
            {
                add(new Category(0, "Bilgisayar"));
                add(new Category(1, "Ev/Bahçe"));
            }
        };
        System.out.println("\nKategoriler:");
        for (Category category : categories) {
            System.out.println(category.getName());
        }

        productManager.addToCard(product3);
    }
}
