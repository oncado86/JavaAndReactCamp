package Homeworks.Homework_3.oppGameSaleCompany.business.game;

import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ILogger;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.game.IGameDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

public class GameManager implements IGameService {

    private IGameDataAccess gameDataAccess;
    private ILogger[] logger;

    public GameManager(IGameDataAccess gameDataAccess, ILogger... logger) {
        this.gameDataAccess = gameDataAccess;
        this.logger = logger;
    }

    private boolean isOurGame(Game game) {
        for (Game g : fakeData.getGames().values()) {
            if (g.getName().equals(game.getName()))
                return true;
        }
        return false;
    }

    private void createID(Game game) {
        int gid = 0;
        for (Integer number : fakeData.getGames().keySet()) {
            if (number == gid) {
                gid++;
            } else
                break;
        }
        game.setId(gid);
    }

    @Override
    public void add(Game game) {
        if (!this.isOurGame(game)) {
            createID(game);
            gameDataAccess.add(game);
            for (ILogger iLogger : logger) {
                iLogger.log("Added game: %s".formatted(game.getName()));
            }
        } else
            System.out.println("This game name already exists: %s".formatted(game.getName()));
    }

    @Override
    public void remove(Game game) {
        if (this.isOurGame(game)) {
            gameDataAccess.remove(game);
            for (ILogger iLogger : logger) {
                iLogger.log("Removed game: %s".formatted(game.getName()));
            }
        } else {
            System.out.println("This game does not exist anymore! - %s".formatted(game.getName()));
        }
    }

    @Override
    public void update(Game game) {
        if (this.isOurGame(game)) {
            gameDataAccess.update(game);
            for (ILogger iLogger : logger) {
                iLogger.log("Updated game: %s".formatted(game.getName()));
            }
        } else {
            System.out.println("This game does not exist anymore! - %s".formatted(game.getName()));
        }
    }

    @Override
    public void toList() {
        for (Game game : fakeData.getGames().values()) {
            System.out.println("%d) Game : %s , Description: %s , Price: %,.2f ₺".formatted(
                    game.getId() + 1, game.getName(), game.getDescription(), game.getPrice()));
        }
    }

}
