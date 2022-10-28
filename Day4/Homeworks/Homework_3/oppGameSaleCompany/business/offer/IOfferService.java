package Homeworks.Homework_3.oppGameSaleCompany.business.offer;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

public interface IOfferService extends IToList {
    void add(Game game, double discount);

    void remove(Game game);

    void update(Game game, double discount);

}
