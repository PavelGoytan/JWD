package by.traning.goytan.task1;

public class VarCreator {
    public static double[] getDoubles(MathView view, MathInput input) {
        String[] array = {"a", "b", "c"};
        String string;
        double[] arrayDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterNumber(array[i]);
            string = input.string();
            while (!MathUtil.isCorrectEnter(string)) {
                view.inputError();
                view.enterNumber(array[i]);
                string = input.string();
            }
            arrayDouble[i] = MathUtil.stringToDouble(string);
        }
        return arrayDouble;
    }
}
