package Homeworks.Homework_3.oppGameSaleCompany.entities;

public class Offer {
    private int id;
    private Game game;
    private double price;
    private double discountedPrice;

    public Offer(Game game, double price, double discountedPrice) {
        this.game = game;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
