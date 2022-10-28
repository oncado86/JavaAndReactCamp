package Homeworks.Homework_3.oppGameSaleCompany.core.ui.screens;

import Homeworks.Homework_3.oppGameSaleCompany.business.user.UserManager;
import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ConsoleLogger;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.Ui;
import Homeworks.Homework_3.oppGameSaleCompany.core.ui.interfaces.IVerification;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user.UserDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Gamer;

public class RegisterScreen extends Ui implements IVerification {

    public void creatGamer() {

        Gamer gamer = new Gamer();
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

        userManager.add(gamer);

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
