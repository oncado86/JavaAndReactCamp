package Homeworks.Homework_2.h06_ClassesWithAttributes_GetterSetter_Constructor;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA & React Yazılım Geliştirici Kampı
 * 
 * @apiNote
 **          Ürünle ilgili işlemler
 */
public class ProductManager {
    public void Add(Product product) {
        System.out.printf("Product is added: %s, %s\n", product.getName(),product.getDescription());
    }
}
