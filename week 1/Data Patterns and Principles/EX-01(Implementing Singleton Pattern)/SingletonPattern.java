public class SingletonPattern {
    static class Logger {
        private static Logger instance;

        private Logger() {
            System.out.println("Logger instance created.");
        }

        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Logging from first logger instance.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Logging from second logger instance.");

        if (logger1 == logger2) {
            System.out.println("Singleton confirmed: Both references point to the same instance.");
        } else {
            System.out.println("Singleton failed: Different instances exist.");
        }
    }
}
