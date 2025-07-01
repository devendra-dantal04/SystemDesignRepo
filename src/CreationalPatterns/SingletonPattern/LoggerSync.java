package CreationalPatterns.SingletonPattern;

// Thread Safe Code using Synchronized block - but can cause the raise condition.
public class LoggerSync {
    private static LoggerSync logger = null;

    private LoggerSync() {}

    public static synchronized LoggerSync getLogger() {
        if(logger == null) {
            logger = new LoggerSync();
        }
        return logger;
    }
}
