package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

public class WellcomeScreen extends Ui {
    private String[] menus = { "1) Login", "2) Register", "3) Exit" };

    public WellcomeScreen() {
        fakeData fd = new fakeData();
    }

    public String[] getMenus() {
        return menus;
    }

    public void open() {
        showMenus(menus);
        int answer = getMenuAnswer();

        if (answer == 1) {
            LoginScreen loginScreen = new LoginScreen();
            MainScreen mainScreen = new MainScreen(loginScreen.login());
            mainScreen.mainMenu();
        } else if (answer == 2) {
            RegisterScreen registerScreen = new RegisterScreen();
            registerScreen.creatGamer();
            open();
        } else {
            System.exit(0);
        }
    }

}
