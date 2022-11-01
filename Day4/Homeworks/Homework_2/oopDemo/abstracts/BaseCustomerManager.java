package Homeworks.Homework_2.oopDemo.abstracts;

import Homeworks.Homework_2.oopDemo.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println("Saved to db: %s %s".formatted(
                customer.getFirsName(), customer.getLastName()));
    }
}
