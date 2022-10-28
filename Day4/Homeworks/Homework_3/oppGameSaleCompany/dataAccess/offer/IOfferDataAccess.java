package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.offer;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;

public interface IOfferDataAccess {
    void add(Offer offer);

    void remove(Offer offer);

    void update(Offer offer);
}
