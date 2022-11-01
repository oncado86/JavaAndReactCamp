package Education.interfaces.busines;

import Education.interfaces.core.ILogger;
import Education.interfaces.core.Utils;
import Education.interfaces.entities.Customer;


/**
 * @apiNote Müşteri işlemleri için operasyonları içerir
 * @category Müşteri Operasyonları
 */
public class CustomerManager {

    private String musteriEklendi = "\nMüşteri Eklendi: %s %s";
    private String musteriSilindi = "\nMüşteri Silindi: %s %s";
    private ILogger[] loggers; // ! defansive injection

    /**
     *  @category Müşteri Operasyonları 
     * @param loggers -> loglama işlemlerinde kullanılacak yöntemler
     */
    public CustomerManager(ILogger... loggers) { // ! defansive injection
        this.loggers = loggers;
    }

    /**
     * Sisteme müşteri eklemeyi sağlar
     * 
     * @param customer -> müşteri bilgileri (Customer)
     */
    public void add(Customer customer) {
        System.out.println(musteriEklendi.formatted(customer.getFirstName(), customer.getLastName()));
        Utils.runLoggers(musteriEklendi.formatted(customer.getFirstName(), customer.getLastName()), loggers);
    }

    /**
     * Sistemden müşteri silmeyi sağlar
     * 
     * @param customer -> müşteri bilgileri (Customer)
     */
    public void delete(Customer customer) {
        System.out.println(musteriSilindi.formatted(customer.getFirstName(), customer.getLastName()));
        Utils.runLoggers(musteriSilindi.formatted(customer.getFirstName(), customer.getLastName()), loggers);
    }
}
