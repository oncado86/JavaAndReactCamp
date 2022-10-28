package Homeworks.Homework_3.oppGameSaleCompany.core.logger;

/**
 * Konsolda log mesajı gösterir.
 * ILogger uygular.
 */
public class ConsoleLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("---> Log: %s".formatted(message));
    }

}
