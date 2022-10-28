package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user;

import Homeworks.Homework_3.oppGameSaleCompany.entities.User;
import Homeworks.Homework_3.oppGameSaleCompany.fakeData.fakeData;

/**
 * Kullanıcılar için veri erişimi katmanı.
 * IUserDataAccess uygular.
 */
public class UserDataAccess implements IUserDataAccess {

    @Override
    public void add(User user) {
        fakeData.getGamers().put(user.getId(), user);
    }

    @Override
    public void remove(User user) {
        fakeData.getGamers().remove(user.getId());
    }

    @Override
    public void update(User user) {
        remove(user);
        add(user);
    }

}
