package Education.interfaces.core;

/**
 * Veri tabanına loglama işlemleri
 */
public class DatabaseLogger implements ILogger {

    /* (non-Javadoc)
     * @see Education.interfaces.core.ILogger#log(java.lang.String)
     */
    @Override
    public void log(String message) {
        System.out.println("Veri tabanına loglandı -> %s".formatted(message));
    }

}
