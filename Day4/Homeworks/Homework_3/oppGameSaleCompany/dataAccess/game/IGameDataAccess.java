package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.game;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;

public interface IGameDataAccess {
    void add(Game game);

    void remove(Game game);

    void update(Game game);
}
