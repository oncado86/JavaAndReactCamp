package Education.oopIntro;

public class ProductManager {
    public void addToCard(Product product) {
        System.out.println(String.format("%s - %s sepete eklendi.", product.getName(), product.getDetais()));
    }
}
