package by.traning.goytan.task1;

public class VarCreator {
    public static double[] getDoubles(Output view, Input input) {
        String[] array = {"a", "b", "c"};
        double[] arrayDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterNumber(array[i]);
            String string = input.string();
            while (!VarValidator.isCorrectDouble(string)) {
                view.inputError();
                view.enterNumber(array[i]);
                string = input.string();
            }
            arrayDouble[i] = Double.parseDouble(string);
        }
        return arrayDouble;
    }

    public static int[] getIntegers(Output view, Input input) {
        String[] array = {"первое", "второе", "третье"};
        int[] arrayInteger = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            view.enterInteger(array[i]);
            String string = input.string();
            while (VarValidator.isCorrectInteger(string)) {
                view.inputError();
                view.enterInteger(array[i]);
                string = input.string();
            }
            arrayInteger[i] = Integer.parseInt(string);
        }
        return arrayInteger;
    }


}
