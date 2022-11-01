package Education.interfaces.entities;

/**
 * @apiNote Müşteri bilgilerini tutan varlık sınıfı
 * @category Müşteri
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    /**
     * @apiNote Müşteri bilgilerini tutan varlık sınıfı
     * @category Müşteri
     */
    public Customer() {
    }

    /**
     * @apiNote Müşteri bilgilerini tutan varlık sınıfı
     * @category Müşteri
     * @param id        -> müşteri idsi
     * @param firstName -> müşteri adı
     * @param lastName  -> müşteri soyadı
     */
    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Müşteri idsini verir
     * 
     * @return müşteri idsi
     */
    public int getId() {
        return id;
    }

    /**
     * Müşteri idsini ayarlar
     * 
     * @param id -> müşteri idsi (int)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Müşteri adını verir
     * 
     * @return müşteri Adı
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * müşteri adını ayarlar
     * 
     * @param firstName -> müşteri Adı (String)
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * müşteri soyadını verir
     * 
     * @return müşteri soyadı
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * müşteri soyadı ayarlar
     * 
     * @param lastName -> müşteri soyadı (String)
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
