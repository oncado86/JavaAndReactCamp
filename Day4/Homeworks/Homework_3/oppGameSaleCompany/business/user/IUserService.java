package Homeworks.Homework_3.oppGameSaleCompany.business.user;

import Homeworks.Homework_3.oppGameSaleCompany.business.IToList;
import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

/**
 * İş katmanı için, kullanıcılar için interface
 * IToList uygular.
 */
public interface IUserService extends IToList {
    /**
     * Sisteme kullanıcı eklemeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void add(User user);

    /**
     * Sistemden kullanıcı silmeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void remove(User user);

    /**
     * Sistemdeki kullanıcı bilgilerini güncellemeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void update(User user);
}
