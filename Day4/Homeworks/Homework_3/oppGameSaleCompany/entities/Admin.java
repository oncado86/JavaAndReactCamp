package Homeworks.Homework_3.oppGameSaleCompany.entities;

/**
 * Admin varlık bilgileri.
 * Adminle ilgili varlık bilgilerini tutar.
 * User sınıfından miras alır.
 */
public class Admin extends User {

    public Admin(String firstName, String lastName, String userName, String password, String yearOfBirth,
            String nationalIdentity) {
        super(firstName, lastName, userName, password, yearOfBirth, nationalIdentity);
    }

}
