package Homeworks.Homework_1.h03_interfaces_polymorphism.dataAccess;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("My SQL'e eklendi.");
    }
    
}
