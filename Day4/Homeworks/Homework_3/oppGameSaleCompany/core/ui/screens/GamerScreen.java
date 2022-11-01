package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.business.game.GameManager;
import Homeworks.Homework_3.oppGameSaleCompany.business.offer.OfferManager;
import Homeworks.Homework_3.oppGameSaleCompany.business.user.UserManager;
import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ConsoleLogger;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.interfaces.ISingOut;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.interfaces.IVerification;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.game.GameDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.offer.OfferDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user.UserDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Game;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Gamer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

/**
 * Oyuncu ekranı.
 * Ui sınıfından miras alır.
 * ISingOut ve IVerification uygular.
 */
public class GamerScreen extends Ui implements ISingOut, IVerification {

    private String[] mainMenuWithMyGame = { "1) Games", "2) Offers", "3) My Games", "4) View Info", "5) Edit Info",
            "6) Sing Out" };
    private String[] mainMenu = { "1) Games", "2) Offers", "3) View Info", "4) Edit Info", "5) Sing Out" };
    private String[] selectGame = { "1) Select Game", "2) Main Menu" };

    private Gamer gamer;
    private Game game;

    public GamerScreen(User user) {
        gamer = new Gamer();
        gamer = (Gamer) user;
    }

    public String[] getMainMenuWithMyGame() {
        return mainMenuWithMyGame;
    }

    public String[] getMainMenu() {
        return mainMenu;
    }

    public boolean isGameEmpty() {
        if (gamer.getGames() == null || gamer.getGames().isEmpty() || gamer.getGames().size() < 1)
            return true;
        return false;
    }

    public void selectGame() {
        showMenus(selectGame);
        int answer = getMenuAnswer();
        if (answer == 1) {
            System.out.println();
            System.out.println("Select Game ID:");
            int gameID = getMenuAnswer();
            game = fakeData.getGames().get(gameID - 1);
            BuyScreen buyScreen = new BuyScreen(game, gamer);
            buyScreen.showMenus(buyScreen.getMainMenu());
            buyScreen.buyGame();
            mainMenu();

        } else {
            mainMenu();
        }
    }

    private void gamesAction() {
        GameManager gameManager = new GameManager(new GameDataAccess(), new ConsoleLogger());
        gameManager.toList();
        System.out.println();
        if (fakeData.getGames().size() > 0)
            selectGame();
        else {
            System.out.println("*** There are no games!");
            mainMenu();
        }
    }

    private void offerAction() {
        OfferManager offerManager = new OfferManager(new OfferDataAccess(), new ConsoleLogger());
        offerManager.toList();
        System.out.println();
        if (fakeData.getOffers().size() > 0)
            selectGame();
        else {
            System.out.println("*** There are no offers!");
            mainMenu();
        }
    }

    private void myGameAction() {
        if (!gamer.getGames().isEmpty() && gamer.getGames() != null && gamer.getGames().size() > 0) {
            System.out.println("My Games:");
            for (Game myGame : gamer.getGames()) {
                System.out.println("%d) %s, %s, %,.2f".formatted(
                        myGame.getId() + 1,
                        myGame.getName(),
                        myGame.getDescription(),
                        myGame.getPrice()));
            }
            System.out.println();
            mainMenu();
        } else {
            System.out.println("*** There are no games!");
            mainMenu();
        }
    }

    private void editInfoAction() {
        UserManager userManager = new UserManager(new UserDataAccess(), new ConsoleLogger());
        System.out.println("First Name:");
        gamer.setFirstName(getResult());

        System.out.println("Last Name:");
        gamer.setLastName(getResult());

        System.out.println("User Name:");
        gamer.setUserName(getResult());

        System.out.println("National Identity:");
        gamer.setNationalIdentity(nationalIdVerification());

        System.out.println("Password:");
        gamer.setPassword(getResult());

        System.out.println("Birth Year:");
        gamer.setYearOfBirth(yearVerification());

        userManager.update(gamer);
        mainMenu();
    }

    private void viewInfoAction() {
        System.out.println("First Name: %s".formatted(gamer.getFirstName()));
        System.out.println("Last Name: %s".formatted(gamer.getLastName()));
        System.out.println("User Name: %s".formatted(gamer.getUserName()));
        System.out.println("Password: %s".formatted(gamer.getPassword()));
        System.out.println("National Idendity: %s".formatted(gamer.getNationalIdentity()));
        System.out.println("Year of birth: %s".formatted(gamer.getYearOfBirth()));
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("Wellcome %s".formatted(gamer.getUserName()));
        int answer;
        if (!isGameEmpty()) {
            showMenus(getMainMenuWithMyGame());
            answer = getMenuAnswer();
            if (answer == 1) {
                gamesAction();
            } else if (answer == 2) {
                offerAction();
            } else if (answer == 3) {
                myGameAction();
            } else if (answer == 4) {
                viewInfoAction();
            } else if (answer == 5) {
                editInfoAction();
            } else {
                singOut();
            }

        } else {
            showMenus(getMainMenu());
            answer = getMenuAnswer();
            if (answer == 1) {
                gamesAction();
            } else if (answer == 2) {
                offerAction();
            } else if (answer == 3) {
                viewInfoAction();
            } else if (answer == 4) {
                editInfoAction();
            } else {
                singOut();
            }
        }

    }

    @Override
    public void singOut() {
        WellcomeScreen wellcome = new WellcomeScreen();
        wellcome.open();
    }

    @Override
    public String yearVerification() {
        while (true) {
            String yearValue;
            yearValue = getResult();
            if (yearValue.length() == 4)
                return yearValue;
            else
                System.out.println("ERROR: Year must be 4 characters!");
        }
    }

    @Override
    public String nationalIdVerification() {
        while (true) {
            String nationalId;
            nationalId = getResult();
            if (nationalId.length() == 11)
                return nationalId;
            else
                System.out.println("ERROR: ID information must be 11 characters!");
        }
    }

}
