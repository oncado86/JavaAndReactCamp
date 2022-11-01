package Education.interfaces;

import Education.interfaces.busines.CustomerManager;
import Education.interfaces.core.DatabaseLogger;
import Education.interfaces.core.EmailLogger;
import Education.interfaces.core.FileLogger;
import Education.interfaces.core.SmsLogger;
import Education.interfaces.entities.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "OnCaDo", "OnCaDo");
        CustomerManager customerManager = new CustomerManager(
                new EmailLogger(),
                new DatabaseLogger(),
                new FileLogger(),
                new SmsLogger());

        customerManager.add(customer);
        customerManager.delete(customer);
    }
}
