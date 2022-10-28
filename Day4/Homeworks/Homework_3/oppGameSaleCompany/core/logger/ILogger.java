package Homeworks.Homework_3.oppGameSaleCompany.core.logger;

/**
 * Sistemin geneli için, loglama için kullanılacak interface
 */
public interface ILogger {
    /**
     * Log mesajı göstermeyi sağlar.
     * @param message -> logda gösterilecek mesaj (String)
     */
    void log(String message);
}
