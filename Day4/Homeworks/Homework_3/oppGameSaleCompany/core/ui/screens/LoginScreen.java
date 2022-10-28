package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.business.user.UserManager;
import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ConsoleLogger;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user.UserDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Gamer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

public class LoginScreen extends Ui {

    public User login() {
        User loginGamer = new Gamer();
        UserManager userManager = new UserManager(new UserDataAccess(), new ConsoleLogger());
        String username, password;

        System.out.println("Username: ");
        username = getResult();
        System.out.println("Password: ");
        password = getResult();
        loginGamer.setUserName(username);
        loginGamer.setPassword(password);

        loginGamer = userManager.userValidationAndUserInformation(loginGamer);

        return loginGamer;
    }
}
