package Homeworks.Homework_2.oopDemo.adapters;

import Homeworks.Homework_2.oopDemo.abstracts.ICustomerCheckService;
import Homeworks.Homework_2.oopDemo.entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean chackIfRealCustomer(Customer customer) {
        // KPSPublicSoapClient client = new KPSPublicSoapClient();
        // return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), 
        //         customer.getFirsName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
        return true;
    }
    
}
