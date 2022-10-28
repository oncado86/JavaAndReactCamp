package Homeworks.Homework_3.oppGameSaleCompany.business.user;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

public interface IUserService extends IToList {
    void add(User user);

    void remove(User user);

    void update(User user);
}
