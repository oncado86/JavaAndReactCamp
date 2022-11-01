package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.offer;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;

/**
 * Veri erişim katmanı için interface
 */
public interface IOfferDataAccess {
    /**
     * Sisteme kampanya eklemeyi sağlar
     * 
     * @param offer -> kampanya (Offer sınıfı)
     */
    void add(Offer offer);

    /**
     * Sistemden kampanya silmeyi sağlar
     * 
     * @param offer -> kampanya (Offer sınıfı)
     */
    void remove(Offer offer);

    /**
     * Sistemdeki kampanyayı güncellemeyi sağlar
     * 
     * @param offer -> kampanya (Offer sınıfı)
     */
    void update(Offer offer);
}
