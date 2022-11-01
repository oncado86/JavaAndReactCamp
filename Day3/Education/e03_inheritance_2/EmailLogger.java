package Education.e03_inheritance_2;

public class EmailLogger extends Logger {
    @Override
    public void log() {
        System.out.println("Eposta gönderildi.");
    }
}
