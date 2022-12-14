package Homeworks.Homework_1.h03_interfaces_polymorphism.business;

import Homeworks.Homework_1.h03_interfaces_polymorphism.dataAccess.ICustomerDal;

public class CustomerManager {
    public ICustomerDal customerDal;

    public CustomerManager() {
    }

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }
}
