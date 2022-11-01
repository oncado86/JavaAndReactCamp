package Education.interfaces.core;

/**
 * @apiNote Statik metotları her yerden çağırabiliriz! 'new' yapmaya gerek yoktur.
 * @apiNote İlk kullanımda arka planda otomatik olarak 'new' yapılır.
 */
public class Utils {
    /**
     * Verilen mesajı, veirlen loglama yöntemlerinde kullanır.
     * 
     * @param message -> logda kullanılacak mesaj
     * @param loggers -> loglama işleminde kullanılacak log yöntemleri
     */
    public static void runLoggers(String message, ILogger... loggers) {
        for (ILogger multiLog : loggers) {
            multiLog.log(message);
        }
    }
}
