package Education.interfaces.core;

/**
 * SMS loglama operasyonları
 */
public class SmsLogger implements ILogger {

    /* (non-Javadoc)
     * @see Education.interfaces.core.ILogger#log(java.lang.String)
     */
    @Override
    public void log(String message) {
        System.out.println("SMS gönderildi -> %s".formatted(message));
    }

}
