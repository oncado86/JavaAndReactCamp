package Education.e01_oopAbstraction;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(); // örnek oluşturma, referans oluşturma, instance oluşturma
        product1.setId(0);
        product1.setName("Lenovo");
        product1.setDetais("v14");
        product1.setUnitPrice(15000);

        Product product2 = new Product(2, "MacBook Pro", 20000, "MacBokk Pro", 10);
        Product product3 = new Product(3, "Huawei", 15000, "MateBook 16", 5);
        ArrayList<Product> products = new ArrayList<Product>() {
            {
                add(new Product(1, "Monster", 15000, "Abra v15", 7.5));
                add(product1);
                add(product2);
                add(product3);
            }
        };

        System.out.println("\nÜrünler:");
        for (Product product : products) {
            System.out.println("* %s".formatted(product.getName()));
        }

        ArrayList<Category> categories = new ArrayList<Category>() {
            {
                add(new Category(0, "Bilgisayar"));
                add(new Category(1, "Ev/Bahçe"));
            }
        };
        System.out.println("\nKategoriler:");
        for (Category category : categories) {
            System.out.println("* %s".formatted(category.getName()));
        }

        System.out.println("Product: %s, Unit Price: %,.2f ₺ and Unit Price After Discount: %,.2f ₺".formatted(
                product2.getName(),
                product2.getUnitPrice(),
                product2.getUnitPriceAfterDiscount()));

        productManager.addToCard(product3);

        Category category1 = new Category(3, "İçecek");
        Category category2 = new Category(4, "Yiyecek");
        System.out.println(category1.getName());
        System.out.println(category2.getName());
    }
}
