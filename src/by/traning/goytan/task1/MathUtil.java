package by.traning.goytan.task1;

public class MathUtil {
    public static boolean isCorrectDouble(String string) {
        String scalar = "-?[0-9]+(\\.[0-9]+)?";
        return string.matches(scalar);
    }

    public static boolean isCorrectInteger(String string) {
        String scalar = "-?[0-9]+";
        return !string.matches(scalar);
    }


    public static double stringToDouble(String string) {
        return Double.parseDouble(string);
    }

    public static int stringToInteger(String string) {
        return Integer.parseInt(string);
    }

    public static boolean isCorrectVariable(double a, double b, double c) {
        return (a != 0) && (a * c >= 0) && (b != 0);
    }


}
