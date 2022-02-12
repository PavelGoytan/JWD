package by.traning.goytan.task1;

public class VarCreator {
    public static double[] getDoubles(MathView view, MathInput input) {
        String[] array = {"a", "b", "c"};
        String string;
        double[] arrayDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterNumber(array[i]);
            string = input.string();
            while (!MathUtil.isCorrectDouble(string)) {
                view.inputError();
                view.enterNumber(array[i]);
                string = input.string();
            }
            arrayDouble[i] = MathUtil.stringToDouble(string);
        }
        return arrayDouble;
    }

    public static int[] getIntegers(MathView view, MathInput input) {
        String[] array = {"первое", "второе", "третье"};
        String string;
        int[] arrayInteger = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterInteger(array[i]);
            string = input.string();
            while (MathUtil.isCorrectInteger(string)) {
                view.inputError();
                view.enterInteger(array[i]);
                string = input.string();
            }
            arrayInteger[i] = MathUtil.stringToInteger(string);
        }
        return arrayInteger;
    }


}
