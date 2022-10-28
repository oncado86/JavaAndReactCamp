package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.offer;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

/**
 * Kampanyalar için veri erişimi katmanı.
 * IOfferDataAccess uygular.
 */
public class OfferDataAccess implements IOfferDataAccess {

    @Override
    public void add(Offer offer) {
        fakeData.getOffers().put(offer.getId(), offer);
    }

    @Override
    public void remove(Offer offer) {
        fakeData.getOffers().remove(offer.getId());
    }

    @Override
    public void update(Offer offer) {
        remove(offer);
        add(offer);
    }

}
