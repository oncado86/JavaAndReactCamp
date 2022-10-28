package Homeworks.Homework_3.oppGameSaleCompany.entities;

/**
 * Kullanıcı varlık bilgileri
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String yearOfBirth;
    private String nationalIdentity;

    /**
     * Parametre kullanmadan kullanıcı oluşturur
     */
    public User() {
    }

    /**
     * Parametrelerle kullanıcı oluşturur
     * 
     * @param firstName        -> kullanıcı adı
     * @param lastName         -> kullanıcı soyadı
     * @param userName         -> kullanıcı takma adı
     * @param password         -> kullanıcı şifresi
     * @param yearOfBirth      -> kullanıcı doğum yılı
     * @param nationalIdentity -> kullanıcı TC
     */
    public User(String firstName, String lastName, String userName, String password, String yearOfBirth,
            String nationalIdentity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
        this.nationalIdentity = nationalIdentity;
    }

    /**
     * Kullanıcı idsini getirir
     * 
     * @return kullanıcı idsi (int)
     */
    public int getId() {
        return id;
    }

    /**
     * Kullanıcı idsini ayarlar
     * 
     * @param id -> kullanıcı idsi
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

}
