package Homeworks.Homework_1.h03_polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(String.format("Logged to console : %s", message));
    }
}
