package Education.interfaces.core;

/**
 * Dosyaya loglama operasyonlarÄ±
 */
public class FileLogger implements ILogger {

    /* (non-Javadoc)
     * @see Education.interfaces.core.ILogger#log(java.lang.String)
     */
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandÄ± -> %s".formatted(message));
    }

}
