package Education.interfaces.core;

/**
 * Eposta loglama operasyonları
 */
public class EmailLogger implements ILogger {

    /* (non-Javadoc)
     * @see Education.interfaces.core.ILogger#log(java.lang.String)
     */
    @Override
    public void log(String message) {
        System.out.println("Eposta gönderildi -> %s".formatted(message));
    }

}
