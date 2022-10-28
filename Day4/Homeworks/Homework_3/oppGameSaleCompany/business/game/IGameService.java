package Homeworks.Homework_3.oppGameSaleCompany.business.game;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

public interface IGameService extends IToList {
    void add(Game game);

    void remove(Game game);

    void update(Game game);
}
