package Homeworks.Homework_1.h02_abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veriler getirildi : SQL Server");
    }
    
}
