package Homeworks.Homework_3.oppGameSaleCompany.entities;

/**
 * Kullanıcı varlık bilgileri.
 * Kullanıcı ile ilgili bilileir tutar.
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
     * @param id -> kullanıcı idsi (int)
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Kullanıcı adını verir
     * 
     * @return firstName -> kullanıcı adı (String)
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Kullanıcı adını ayarlar
     * 
     * @param firstName -> kullanıcı adı (String)
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Kullanıcı soyadını verir
     * 
     * @return lastName -> kullanıcı soyadı (String)
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Kullanıcı soyadını ayarlar
     * 
     * @param lastName -> kullanıcı soyadı (String)
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Kullanıcı takma adını verir
     * 
     * @return userName -> kullanıcı takma adı (String)
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Kullanıcı takma adını ayarlar
     * 
     * @param userName -> kullanıcı takma adı (String)
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Kullanıcı parolasını verir
     * 
     * @return password -> kullanıcı parolası (String)
     */
    public String getPassword() {
        return password;
    }

    /**
     * Kullanıcı parolasını ayarlar
     * 
     * @param password -> kullanıcı parolası (String)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Kullanıcının doğum yılını verir
     * 
     * @return -> kullanıcı doğum yılı (String)
     */
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Kullanıcının doğum yılını ayarlar
     * 
     * @param yearOfBirth -> kullanıcı doğum yılı (String)
     */
    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Kullanıcı kimlik numarasını verir
     * 
     * @return -> kullanıcı kimlik numarası (String)
     */
    public String getNationalIdentity() {
        return nationalIdentity;
    }

    /**
     * Kullanıcı kimlik numarasını ayarlar
     * 
     * @param nationalIdentity -> kullanıcı kimlik numarası (String)
     */
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

}
