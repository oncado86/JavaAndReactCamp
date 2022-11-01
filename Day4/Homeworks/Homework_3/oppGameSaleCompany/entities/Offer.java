package Homeworks.Homework_3.oppGameSaleCompany.entities;

/**
 * Kampanya varlık bilgileri.
 * Kampanya ile ilgili bilgileri tutar.
 */
public class Offer {
    private int id;
    private Game game;
    private double price;
    private double discountedPrice;

    /**
     * Parametrelerle kampanya oluşturur.
     * 
     * @param game            -> kampanya oluşturulacak oyun bilgileri (Game)
     * @param price           -> oyunun normal fiyatı (double)
     * @param discountedPrice -> oyuna uygulanacak indirim oranı (double)
     */
    public Offer(Game game, double price, double discountedPrice) {
        this.game = game;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }

    /**
     * Kampanya id bilgisini verir
     * 
     * @return -> id -> kampanyanın idsi (integer)
     */
    public int getId() {
        return id;
    }

    /**
     * Kampanya id bilgisini ayarlar.
     * 
     * @param id -> kampanyanın idsi (integer)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Oyun bilgilerini verir
     * 
     * @return -> oyun bilgileri (Game sınıfı)
     */
    public Game getGame() {
        return game;
    }

    /**
     * Oyun bilgilerini ayarlar
     * 
     * @param game -> oyun bilgileri (Game sınıfı)
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Oyunun normal fiyatını verir
     * 
     * @return -> oyunun normal fiyatı (double)
     */
    public double getPrice() {
        return price;
    }

    /**
     * Oyunun normal fiyatını ayarlar
     * 
     * @param price -> oyun normal fiyatı (double)
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Kampanyada oyuna uygulanacak indirim oranını verir
     * 
     * @return discountedPrice -> oyuna uygulanacak indirim oranı (double)
     */
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    /**
     * Kampanyada uygulanacak indirim oranını ayarlar
     * 
     * @param discountedPrice -> oyuna uygulanacak indirim oranı (double)
     */
    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
