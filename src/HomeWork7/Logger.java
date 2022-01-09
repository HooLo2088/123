package HomeWork7;
public class Logger {
    private static String RESET = "\u001B[0m";
    private static String BLUE = "\u001B[34m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static String RED = "\u001B[31m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void info(String message) {
        printMessage(BLUE, Level.INFO, message);
    }

    public void debug(String message) {
        printMessage(GREEN, Level.DEBUG, message);
    }

    public void warn(String message) {
        printMessage(YELLOW, Level.WARN, message);
    }

    public void error(String message) {
        printMessage(RED, Level.ERROR, message);
    }


    private void printMessage(String color, Level level, String message) {
        System.out.println(color + level + ": " + message + RESET);
    }
}