package Education.e01_oopAbstraction;

public class Product {
    // ! Encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String detais;
    private double discount;

    // Constructor - Yapıcı method
    public Product() {
    }

    public Product(int id, String name, double unitPrice, String detais, double discount) {
        this(); // parametresiz yapıcı blok çalışır.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detais = detais;
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetais() {
        return detais;
    }

    public void setDetais(String detais) {
        this.detais = detais;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPrice * (1 - (discount / 100));
    }
}
