package Homeworks.Homework_2.oopDemo.concretes;

import Homeworks.Homework_2.oopDemo.abstracts.BaseCustomerManager;
import Homeworks.Homework_2.oopDemo.abstracts.ICustomerCheckService;
import Homeworks.Homework_2.oopDemo.entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService iCustomerCheckService;

    public SturbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (this.iCustomerCheckService.chackIfRealCustomer(customer))
            super.save(customer);
        else
            System.out.println("Geçersiz bilgi");

    }
}
