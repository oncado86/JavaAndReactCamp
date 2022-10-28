package Homeworks.Homework_3.oppGameSaleCompany.fakeData;

import java.util.TreeMap;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Admin;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

/**
 * Sistemi test etmek için kullanılacak veri kaynağı
 */
public class fakeData {

    private static TreeMap<Integer, User> gamers = new TreeMap<>();
    private static TreeMap<Integer, Offer> offers = new TreeMap<>();
    private static TreeMap<Integer, Game> games = new TreeMap<>();
    private static Admin admin = new Admin("OnCaDo", "OnCaDo", "admin", "123", "2022", "321");

    public fakeData() {
        admin.setId(0);
        gamers.put(0, admin);
        Game starWars = new Game();
        starWars.setId(0);
        starWars.setName("Star Wars");
        starWars.setDescription("A long time ago, in a galaxy far, far away…");
        starWars.setPrice(500);
        games.put(starWars.getId(), starWars);
    }

    /**
     * Admin bilgilerini geri döndürülür
     * 
     * @return -> admin bilgileri
     */
    public static Admin getAdmin() {
        return admin;
    }

    /**
     * Oyuncuların bilgilerini geri döndürür.
     * Bu bilgiler; anahtar -> değer biçimindedir.
     * 
     * @return -> Oyuncuların bilgileri
     */
    public static TreeMap<Integer, User> getGamers() {
        return gamers;
    }

    /**
     * Kampanya bilgilerini geri döndürür.
     * Bu bilgiler; anahtar -> değer biçimindedir.
     * 
     * @return -> Kampanya bilgileri
     */
    public static TreeMap<Integer, Offer> getOffers() {
        return offers;
    }

    /**
     * Oyun bilgilerini geri döndürür.
     * Bu bilgiler; anahtar -> değer biçimindedir.
     * 
     * @return -> Oyuncuların bilgileri
     */
    public static TreeMap<Integer, Game> getGames() {
        return games;
    }

}
