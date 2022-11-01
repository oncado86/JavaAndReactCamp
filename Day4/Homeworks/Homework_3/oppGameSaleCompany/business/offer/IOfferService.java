package Homeworks.Homework_3.oppGameSaleCompany.business.offer;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

/**
 * İş katmanı için, kampanyalar için interface
 * IToList uygular
 */
public interface IOfferService extends IToList {
    /**
     * Sisteme kampanya ekler
     * 
     * @param game     -> kampanya yapılacak oyun (Game sınıfı)
     * @param discount -> indirim oranı (double)
     */
    void add(Game game, double discount);

    /**
     * Sismtemden kampanya siler
     * 
     * @param game -> kampanya yapılacak oyun (Game sınıfı)
     */
    void remove(Game game);

    /**
     * Sistemdeki kampanyayı güncellemeyi sağlar
     * 
     * @param game     -> kampanya yapılacak oyun (Game sınıfı)
     * @param discount -> indirim oranı (double)
     */
    void update(Game game, double discount);

}
