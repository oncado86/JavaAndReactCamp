package Homeworks.Homework_1.h02_abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public CustomerManager() {
    }

    public void getCustomers() {
        databaseManager.getData();
    }
}
