package Education.oopIntro;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private String detais;

    // Constructor - Yapıcı method
    public Product() {
    }

    public Product(int id, String name, double unitPrice, String detais) {
        this(); // parametresiz yapıcı blok çalışır.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detais = detais;
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
}
