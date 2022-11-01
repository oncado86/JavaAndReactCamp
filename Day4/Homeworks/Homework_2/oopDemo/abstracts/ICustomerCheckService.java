package Homeworks.Homework_2.oopDemo.abstracts;

import Homeworks.Homework_2.oopDemo.entities.Customer;

public interface ICustomerCheckService {
    boolean chackIfRealCustomer(Customer customer);
}
