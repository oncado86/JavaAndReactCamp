package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user;

import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

public interface IUserDataAccess {
    void add(User user);

    void update(User user);

    void remove(User user);
}
