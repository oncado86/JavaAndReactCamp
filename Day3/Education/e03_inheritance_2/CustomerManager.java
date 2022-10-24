package Education.e03_inheritance_2;

public class CustomerManager {

    private Logger logger;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public void add(Customer customer) {
        // * müşteir ekleme kodları
        System.out.println("%s %s eklendi".formatted(customer.getFirstName(), customer.getLastName()));
        this.logger.log();
    }
}
