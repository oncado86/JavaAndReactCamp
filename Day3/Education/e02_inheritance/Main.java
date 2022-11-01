package Education.e02_inheritance;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        IndividualCustomer bireyselMusteri = new IndividualCustomer(0, "123", "OnCaDo", "OnCaDo", "123456789");
        CorporateCustomer tuzelMusteri = new CorporateCustomer(0, "456", "OnCaDo Inc", "123321");
        SendikaCustomer sendikaCustomer = new SendikaCustomer(0, "789", "Sendika");
        
        // customerManager.add(bireyselMusteri);
        // customerManager.add(tuzelMusteri);
        // customerManager.add(sendikaCustomer);

        customerManager.addMultible(bireyselMusteri, tuzelMusteri, sendikaCustomer);
    }
}
