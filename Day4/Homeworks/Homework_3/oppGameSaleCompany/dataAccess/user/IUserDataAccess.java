package Homeworks.Homework_3.oppGameSaleCompany.dataAccess.user;

import Homeworks.Homework_3.oppGameSaleCompany.entities.User;

/**
 * Veri erişim katmanı için interface
 */
public interface IUserDataAccess {
    /**
     * Sisteme kullanıcı eklemeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void add(User user);

    /**
     * Sistemdeki kullanıcı bilgilerini güncellemeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void update(User user);

    /**
     * Sistemden kullanıcı silmeyi sağlar
     * 
     * @param user -> kullanıcı (User sınıfı)
     */
    void remove(User user);
}
