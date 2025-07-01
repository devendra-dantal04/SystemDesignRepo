package CreationalPatterns.SingletonPattern;

public class Logger {
    private static Logger logger = null;

    private Logger() {

    }

    public static Logger getLogger() {
        if(logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void log(String msg) {
        System.out.println("I am logging followin thing " + msg);
    }
}
