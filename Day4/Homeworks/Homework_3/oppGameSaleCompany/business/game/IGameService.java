package Homeworks.Homework_3.oppGameSaleCompany.business.game;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

/**
 * İş katmanı için, oyunlar için interface.
 * IToList uygular.
 */
public interface IGameService extends IToList {
    /**
     * Sisteme oyun eklemeyi sağlar
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void add(Game game);

    /**
     * Sistemden oyun silmeyi sağlar
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void remove(Game game);

    /**
     * Sistemdeki oyun bilgilerini güncellemeyi sağlar
     * 
     * @param game -> oyun (Game sınıfı)
     */
    void update(Game game);
}
