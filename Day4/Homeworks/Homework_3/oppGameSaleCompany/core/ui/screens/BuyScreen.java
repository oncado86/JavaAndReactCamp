package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.business.user.UserManager;
import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ConsoleLogger;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user.UserDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Gamer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

/**
 * Satın alma ekranı.
 * Ui sınıfından miras alır.
 */
public class BuyScreen extends Ui {

    private Game game;
    private Gamer user;

    private String[] mainMenu = {
            "1) Buy Game",
            "2) Main Screen"
    };

    /**
     * Paramtrelerle satın alma nesnesini oluşturur.
     * @param game
     * @param user
     */
    public BuyScreen(Game game, User user) {
        this.game = game;
        this.user = (Gamer) user;
    }

    /**
     * Ekran için ayarlanmış menü listesi verir.
     * 
     * @return -> menü listesi (String[])
     */
    public String[] getMainMenu() {
        return mainMenu;
    }

    /**
     * Kullanıcının oyun satın almasını sağlar
     */
    public void buyGame() {
        int answer;
        answer = getMenuAnswer();
        if (answer == 1) {
            user.setGames(game);
            UserManager manager = new UserManager(new UserDataAccess(), new ConsoleLogger());
            manager.update(user);
            System.out.println();
            myGames();
        } else {
            GamerScreen gamerScreen = new GamerScreen(user);
            gamerScreen.mainMenu();
        }

    }

    /**
     * Satın alınmış oyunları liste halinde gösterir
     */
    public void myGames() {
        System.out.println("Purchased games:");
        for (Game myGame : user.getGames()) {
            System.out.println("* %s".formatted(myGame.getName()));
        }
        System.out.println();
    }

}
