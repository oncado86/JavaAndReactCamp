package Homeworks.Homework_3.oppGameSaleCompany.business.user;

import Homeworks.Homework_3.oppGameSaleCompany.core.logger.ILogger;
import Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user.IUserDataAccess;
import Homeworks.Homework_3.oppGameSaleCompany.entities.Gamer;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

public class UserManager implements IUserService {

    private IUserDataAccess userDataAccess;
    private ILogger[] logger;

    public UserManager(IUserDataAccess userDataAccess, ILogger... logger) {
        this.userDataAccess = userDataAccess;
        this.logger = logger;
    }

    private boolean isOurUser(User user) {
        for (User u : fakeData.getGamers().values()) {
            if (u.getUserName().equals(user.getUserName()))
                return true;
        }
        return false;
    }

    private void createID(User user) {
        int uid = 0;
        for (Integer number : fakeData.getGamers().keySet()) {
            if (number == uid) {
                uid++;
            } else
                break;
        }
        user.setId(uid);
    }

    @Override
    public void add(User user) {
        if (!this.isOurUser(user)) {
            createID(user);
            userDataAccess.add(user);
            for (ILogger iLogger : logger) {
                iLogger.log("Added user: %s".formatted(user.getUserName()));
            }
        } else
            System.out.println("This username already exists: %s".formatted(user.getUserName()));
    }

    @Override
    public void remove(User user) {
        if (this.isOurUser(user)) {
            userDataAccess.remove(user);
            for (ILogger iLogger : logger) {
                iLogger.log("Removed user: %s".formatted(user.getUserName()));
            }
        } else {
            System.out.println("This user does not exist anymore! - %s".formatted(user.getUserName()));
        }
    }

    @Override
    public void update(User user) {
        if (this.isOurUser(user)) {
            userDataAccess.update(user);
            for (ILogger iLogger : logger) {
                iLogger.log("Updated user: %s".formatted(user.getUserName()));
            }
        } else {
            System.out.println("This user does not exist anymore! - %s".formatted(user.getUserName()));
        }
    }

    @Override
    public void toList() {
        for (User user : fakeData.getGamers().values()) {
            System.out.println("%d) Fist name: %s, Last name %s, User name: %s, Year of birth: %s: ".formatted(
                    user.getId() + 1, user.getFirstName(), user.getLastName(), user.getUserName(),
                    user.getYearOfBirth()));
        }
    }

    public User userValidationAndUserInformation(User user) {
        if (isOurUser(user)) {
            User gamer = new Gamer();
            for (User u : fakeData.getGamers().values()) {
                if (u.getUserName().equals(user.getUserName())) {
                    gamer = u;
                    if (gamer.getPassword().equals(user.getPassword()))
                        return gamer;
                }
            }

        }
        System.out.println("Incorrect password or username");
        return userValidationAndUserInformation(user);

    }

}
