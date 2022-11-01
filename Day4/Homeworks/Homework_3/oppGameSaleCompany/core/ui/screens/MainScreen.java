package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

/**
 * Ana ekran
 * Ui sınıfından miras alır
 */
public class MainScreen extends Ui {
    private User user;

    public MainScreen() {
    }

    /**
     * Parametrelerle ana ekran nesnesi oluşturur
     * @param user -> kullanıcı (User sınıfı)
     */
    public MainScreen(User user) {
        this.user = user;
    }

    public void mainMenu() {
        if (user.getUserName().equals("admin")) {
            AdminScreen adminScreen = new AdminScreen(user);
            adminScreen.mainMenu();
        } else {
            GamerScreen gamerScreen = new GamerScreen(user);
            gamerScreen.mainMenu();
        }
    }
}
