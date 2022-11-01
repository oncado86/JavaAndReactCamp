package Homeworks.Homework_2.oopDemo.concretes;

import Homeworks.Homework_2.oopDemo.abstracts.ICustomerCheckService;
import Homeworks.Homework_2.oopDemo.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean chackIfRealCustomer(Customer customer) {

        return true;
    }
    
}
