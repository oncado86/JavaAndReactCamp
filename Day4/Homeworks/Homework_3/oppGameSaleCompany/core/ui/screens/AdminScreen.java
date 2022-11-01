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
import Homeworks.Homework_3.oppGameSaleCompany.entities.Offer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

public class AdminScreen extends Ui implements ISingOut, IVerification {
    private String[] mainMenus = {
            "1) View Games",
            "2) Edit Games",
            "3) Add Game",
            "4) Delete Game",
            "5) View Offers",
            "6) Edit Offers",
            "7) Add Offer",
            "8) Delete Offer",
            "9) View Users",
            "10) Edit Users",
            "11) Add User",
            "12) Delete User",
            "13) Sing Out"
    };

    private User admin;
    private GameManager gameManager = new GameManager(new GameDataAccess(), new ConsoleLogger());
    private Game game;
    private User user;
    private OfferManager offerManager = new OfferManager(new OfferDataAccess(), new ConsoleLogger());
    private UserManager userManager = new UserManager(new UserDataAccess(), new ConsoleLogger());

    public AdminScreen(User user) {
        this.admin = user;
    }

    private void printGameList() {
        System.out.println("\nGame List:");
        gameManager.toList();
        System.out.println();
        System.out.println("Select Game ID: ");
    }

    private void printOfferList() {
        System.out.println("\nOffer List:");
        offerManager.toList();
        System.out.println();
        System.out.println("Select Offer ID: ");
    }

    private void printUserList() {
        System.out.println("\nUser List:");
        userManager.toList();
        System.out.println();
        System.out.println("Select Offer ID: ");
    }

    private Game selectGame() {
        printGameList();
        int gameID = getMenuAnswer() - 1;
        return fakeData.getGames().get(gameID);
    }

    private Offer selectOffer() {
        printOfferList();
        int offerID = getMenuAnswer() - 1;
        return fakeData.getOffers().get(offerID);
    }

    private User selectUser() {
        printUserList();
        int userID = getMenuAnswer() - 1;
        return fakeData.getGamers().get(userID);
    }

    private void viewGameAction() {
        if (fakeData.getGames().size() > 0 || !fakeData.getGames().isEmpty()) {
            printGameList();
            mainMenu();
        } else {
            System.out.println("\n***There ara no games!");
            mainMenu();
        }

    }

    private void addGameAction() {
        String name;
        String description;
        double price;
        System.out.println("Game Name:");
        name = getResult();
        System.out.println("Game Description:");
        description = getResult();
        System.out.println("Game Price:");
        price = Double.parseDouble(getResult());
        gameManager.add(new Game(name, description, price));
        System.out.println("\n***Current Game List:");
        gameManager.toList();
        System.out.println();
        mainMenu();
    }

    private void editGameAction() {
        if (fakeData.getGames().size() > 0 || !fakeData.getGames().isEmpty()) {
            game = selectGame();
            System.out.println("Game Name:");
            game.setName(getResult());
            System.out.println("Game Description:");
            game.setDescription(getResult());
            System.out.println("Game Price:");
            game.setPrice(Double.parseDouble(getResult()));
            gameManager.update(game);
            mainMenu();
        } else {
            System.out.println("\n***There are no games!");
            mainMenu();
        }

    }

    private void deleteGameAction() {
        game = selectGame();
        gameManager.remove(game);
        printGameList();
        mainMenu();
    }

    private void viewOfferAction() {
        if (fakeData.getOffers().size() > 0 || !fakeData.getOffers().isEmpty()) {
            printOfferList();
            mainMenu();
        } else {
            System.out.println("\n***There are no campaigns!");
            mainMenu();
        }
    }

    private void addOfferAction() {
        game = selectGame();
        System.out.println("Discount rate:");
        double discount = Double.parseDouble(getResult());
        offerManager.add(game, discount);
        printOfferList();
        mainMenu();
    }

    private void editOfferAction() {
        if (fakeData.getOffers().size() > 0 || !fakeData.getOffers().isEmpty()) {
            game = selectOffer().getGame();
            System.out.println("Discount rate:");
            double discount = Double.parseDouble(getResult());
            offerManager.update(game, discount);
            printOfferList();
            mainMenu();
        } else {
            System.out.println("\n****There are no campaigns!");
            mainMenu();
        }
    }

    private void deleteOfferAction() {
        game = selectOffer().getGame();
        offerManager.remove(game);
        printOfferList();
        mainMenu();
    }

    private void viewUserAction() {
        if (fakeData.getGamers().size() > 0 || !fakeData.getGamers().isEmpty()) {
            System.out.println("\nUser List:");
            userManager.toList();
            System.out.println();
            mainMenu();
        } else {
            System.out.println("\n***There are no users!");
            mainMenu();
        }
    }

    private void addUserAction() {
        Gamer gamer = new Gamer();
        System.out.println("First Name:");
        gamer.setFirstName(getResult());
        System.out.println("Last Name:");
        gamer.setLastName(getResult());
        System.out.println("User Name:");
        gamer.setUserName(getResult());
        System.out.println("Password:");
        gamer.setPassword(getResult());
        System.out.println("Year of birth:");
        gamer.setYearOfBirth(yearVerification());
        System.out.println("National Identity:");
        gamer.setNationalIdentity(nationalIdVerification());

        userManager.add(gamer);
        System.out.println("\n***Current User List:");
        userManager.toList();
        System.out.println();
        mainMenu();

    }

    private void editUserAction() {
        if (fakeData.getGamers().size() > 0 || !fakeData.getGamers().isEmpty()) {
            user = selectUser();
            System.out.println("First Name:");
            user.setFirstName(getResult());
            System.out.println("Last Name:");
            user.setLastName(getResult());
            System.out.println("User Name:");
            user.setUserName(getResult());
            System.out.println("Password:");
            user.setPassword(getResult());
            System.out.println("Year of birth:");
            user.setYearOfBirth(yearVerification());
            System.out.println("National Identity:");
            user.setNationalIdentity(nationalIdVerification());

            userManager.update(user);
            System.out.println("\n***Current User List:");
            userManager.toList();
            System.out.println();
            mainMenu();
        }
    }

    private void deleteUserAction() {
        user = selectUser();
        userManager.remove(user);
        printUserList();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("Wellcome %s".formatted(admin.getUserName()));
        showMenus(mainMenus);
        int answer = getMenuAnswer();

        if (answer == 1) { // View Games
            viewGameAction();
        } else if (answer == 2) { // Edit Games
            editGameAction();
        } else if (answer == 3) { // Add Game
            addGameAction();
        } else if (answer == 4) { // Delete Game
            deleteGameAction();
        } else if (answer == 5) { // View Offers
            viewOfferAction();
        } else if (answer == 6) { // Edit Offer
            editOfferAction();
        } else if (answer == 7) { // Add Offer
            addOfferAction();
        } else if (answer == 8) { // Delete Offer
            deleteOfferAction();
        } else if (answer == 9) { // View User
            viewUserAction();
        } else if (answer == 10) { // Edit User
            editUserAction();
        } else if (answer == 11) { // Add User
            addUserAction();
        } else if (answer == 12) { // Delete User
            deleteUserAction();
        } else { // Sing Out
            singOut();
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
