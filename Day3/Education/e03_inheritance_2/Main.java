package Education.e03_inheritance_2;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add(new Customer("OnCaDo", "OnCaDo"));
    }
}
