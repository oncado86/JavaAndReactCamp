package Homeworks.Homework_3.oppGameSaleCompany.entities;

/**
 * Oyun varlık bilgileri.
 * Oyun ile ilgili bilgileri tutar.
 */
public class Game {
    private int id;
    private String name;
    private String description;
    private double price;

    /**
     * Parametre kullanmadan oyun oluşturur
     */
    public Game() {
    }

    /**
     * Parametre kullanarak oyun oluşturur.
     * 
     * @param name        -> oyun adı (String)
     * @param description -> oyun açıklaması (String)
     * @param price       -> oyun fiyatı (double)
     */
    public Game(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Oyun id bilgisini verir
     * 
     * @return id -> oyun idsi (integer)
     */
    public int getId() {
        return id;
    }

    /**
     * Oyun id bilgisini ayarlar
     * 
     * @param id -> oyun idsi (integer)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Oyun adını verir
     * 
     * @return name -> oyun adı (String)
     */
    public String getName() {
        return name;
    }

    /**
     * Oyun adını ayarlar
     * 
     * @param name -> oyun adı (String)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Oyun açıklamasını verir
     * 
     * @return description -> oyun açıklaması (String)
     */
    public String getDescription() {
        return description;
    }

    /**
     * Oyun açıklamasını ayarlar
     * 
     * @param description -> oyun açıklaması (String)
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Oyun fiyatını verir
     * 
     * @return price -> oyun fiyatı (double)
     */
    public double getPrice() {
        return price;
    }

    /**
     * Oyun fiyatını ayarlar
     * 
     * @param price -> oyun fiyatı (double)
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
