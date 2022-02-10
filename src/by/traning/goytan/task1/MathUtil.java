package by.traning.goytan.task1;

public class MathUtil {
    public static boolean isCorrectEnter(String string) {
        boolean isCorrect = false;
        String scalar = "-?[0-9]+(\\.[0-9]+)?";
        String[] str = string.split(" ", 3);
        for (String s : str) {
            isCorrect = s.matches(scalar);
        }
        return isCorrect;
    }

    public static double[] threeNumber(String string) {
        String[] arrayString = string.split(" ", 3);
        double[] arrayDouble = new double[arrayString.length];
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = Double.parseDouble(arrayString[i]);
        }
        return arrayDouble;
    }

}
