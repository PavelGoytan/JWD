package by.traning.goytan.task1;

public class VarValidator {
    public static boolean isCorrectDouble(String string) {
        String scalar = "-?[0-9]+(\\.[0-9]+)?";
        return string.matches(scalar);
    }

    public static boolean isCorrectInteger(String string) {
        String scalar = "-?[0-9]+";
        return !string.matches(scalar);
    }

    public static boolean isFourDigit(String string) {
        return (Integer.parseInt(string) > 9999) || (Integer.parseInt(string) < 1000);
    }

    public static boolean isCorrectVariable(double[] array) {
        return (array[0] != 0) && (array[0] * array[2] >= 0) && (array[1] != 0);
    }


}
