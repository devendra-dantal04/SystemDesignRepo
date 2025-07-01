package CreationalPatterns.SingletonPattern;

public class LoggerDoubleCheck {
    private static LoggerDoubleCheck logger = null;

    private LoggerDoubleCheck() {}

    public static LoggerDoubleCheck getLogger() {
        if(logger == null) {
            synchronized (LoggerDoubleCheck.class) {  //Synchronized the class from here
                if(logger == null) {                   // Double check to see if any other thread have already created the instance
                    logger = new LoggerDoubleCheck();
                }
            }
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("The log should be : " + msg);
    }
}
