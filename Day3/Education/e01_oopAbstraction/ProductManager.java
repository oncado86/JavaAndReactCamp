package Education.e01_oopAbstraction;

public class ProductManager {
    public void addToCard(Product product) {
        System.out.println("%s - %s sepete eklendi".formatted(product.getName(), product.getDetais()));
    }
}
