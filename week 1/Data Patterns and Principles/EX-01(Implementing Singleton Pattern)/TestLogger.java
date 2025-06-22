public class TestLogger {
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

