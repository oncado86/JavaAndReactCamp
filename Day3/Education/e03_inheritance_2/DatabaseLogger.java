package Education.e03_inheritance_2;

public class DatabaseLogger extends Logger {

    @Override
    public void log() {
        System.out.println("Veri tabanına loglandı");
    }
    
}
