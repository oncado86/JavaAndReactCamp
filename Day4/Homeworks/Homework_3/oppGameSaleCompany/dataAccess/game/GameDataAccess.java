package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.game;

import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

public class GameDataAccess implements IGameDataAccess {

    @Override
    public void add(Game game) {
        fakeData.getGames().put(game.getId(), game);
    }

    @Override
    public void remove(Game game) {
        fakeData.getGamers().remove(game.getId());
    }

    @Override
    public void update(Game game) {
        remove(game);
        add(game);
    }

}
