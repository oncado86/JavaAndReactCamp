package Homeworks.Homework_1.h03_polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi.");
        this.logger.log("Logged message.");
    }
}
