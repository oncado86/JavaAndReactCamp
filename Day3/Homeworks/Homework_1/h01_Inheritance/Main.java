package Homeworks.Homework_1.h01_Inheritance;

/**
 * @version 1.0
 * @author <a href="https://github.com/oncado86">OnCaDo</a>
 * @category JAVA
 * @see * JAVA & React Yazılım Geliştirici Kampı
 * 
 * @apiNote
 **          Inheritance; miras, kalıtım..
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Deneme");
        customer.setLastName("Denememe");

        System.out.println(customer.getFirstName());

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.BestEmployee();
    }
}
