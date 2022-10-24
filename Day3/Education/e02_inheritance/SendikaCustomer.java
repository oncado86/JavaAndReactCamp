package Education.e02_inheritance;

public class SendikaCustomer extends Customer {
    private String sendikaOzelligi;

    public SendikaCustomer(int id, String customerNumber, String sendikaOzelligi) {
        super(id, customerNumber);
        this.sendikaOzelligi = sendikaOzelligi;
    }

    public String getSendikaOzelligi() {
        return sendikaOzelligi;
    }

    public void setSendikaOzelligi(String sendikaOzelligi) {
        this.sendikaOzelligi = sendikaOzelligi;
    }

}
