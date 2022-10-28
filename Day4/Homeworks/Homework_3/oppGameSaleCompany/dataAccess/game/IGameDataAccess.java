package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.game;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

/**
 * Veri erişim katmanı için interface
 */
public interface IGameDataAccess {
    /**
     * Sisteme oyun eklemeyi sağlar.
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void add(Game game);

    /**
     * Sistemden oyun silmeyi sağlar.
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void remove(Game game);

    /**
     * Sistemdeki oyun bilgilerini güncellemeyi sağlar.
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void update(Game game);
}
