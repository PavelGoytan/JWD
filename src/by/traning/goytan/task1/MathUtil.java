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

    public static boolean isFourDigit(String string) {
        return (stringToInteger(string) > 9999) || (stringToInteger(string) < 1000);
    }


    public static double stringToDouble(String string) {
        return Double.parseDouble(string);
    }

    public static int stringToInteger(String string) {
        return Integer.parseInt(string);
    }

    public static boolean isCorrectVariable(double[] array) {
        return (array[0] != 0) && (array[0] * array[2] >= 0) && (array[1] != 0);
    }


}
