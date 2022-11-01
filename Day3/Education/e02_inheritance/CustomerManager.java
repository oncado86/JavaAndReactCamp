package Education.e02_inheritance;

public class CustomerManager {
    public void add(Customer customer) {
        System.out.println("%s numaralı müşteri kaydedildi.".formatted(customer.getCustomerNumber()));
    }

    // bulk insert (çoklu işlemler)
    public void addMultible(Customer... customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }
}
