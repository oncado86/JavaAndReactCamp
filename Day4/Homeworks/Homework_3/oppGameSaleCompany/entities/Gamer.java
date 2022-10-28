package Homeworks.Homework_3.oppGameSaleCompany.entities;

import java.util.ArrayList;

/**
 * Oyuncu varlık bilgileri.
 * Oyuncularla ilgili bilgileri tutar.
 * User sınıfından miras alır.
 */
public class Gamer extends User {

    private ArrayList<Game> games;

    /**
     * Parametre kullanmadan oyuncu oluşurur.
     */
    public Gamer() {
    }

    /**
     * Parametrelerle oyuncu oluşturur
     * 
     * @param firstName        -> kullanıcının adı (String)
     * @param lastName         -> kullanıcının soyadı (String)
     * @param userName         -> kullanıcının takma adı (String)
     * @param password         -> kullanıcının parolası (String)
     * @param yearOfBirth      -> kullanıcının doğum yılı (String)
     * @param nationalIdentity -> kullanıcının kimlik numarası (String)
     */
    public Gamer(String firstName, String lastName, String userName, String password, String yearOfBirth,
            String nationalIdentity) {
        super(firstName, lastName, userName, password, yearOfBirth, nationalIdentity);
    }

    /**
     * Kullanıcının satın aldığı oyun listesini verir.
     * 
     * @return games -> kullanıcının sahip olduğu oyunlar (ArrayList)
     */
    public ArrayList<Game> getGames() {
        return games;
    }

    /**
     * Kullanıcının satın aldığı oyunları, listesinine ekler.
     * 
     * @param games -> kullanıcının sahip olduğu oyunlar (Game[])
     */
    public void setGames(Game... games) {
        ArrayList<Game> getGames = new ArrayList<>();
        for (Game g : games) {
            getGames.add(g);
        }
        this.games = getGames;
    }
}
