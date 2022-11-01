package Homeworks.Homework_1.h05_staticDemo;

public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product))
            System.out.println(String.format("Product: '%s' added successfully", product.getName()));
        else
            System.out.println(String.format("Product: '%s' adding failed, information is invalid.", product.getName()));
    }
}
