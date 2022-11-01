package Homeworks.Homework_1.h03_polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
