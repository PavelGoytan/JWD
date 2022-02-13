package by.traning.goytan.task1;


public class MathController {
    public static final String END = "END";
    private MathCalc calc;
    private MathInput input;
    private MathView view;

    public MathController() {
        this.calc = new MathCalc();
        this.input = new MathInput();
        this.view = new MathView();
    }


    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */
    public void sumOfDigits() {
        view.titleFourDigit();
        for (; ; ) {
            view.enterNumber();
            String stringInt = input.string();
            if (!stringInt.equals(END)) {
                while (MathUtil.isCorrectInteger(stringInt) ||
                        MathUtil.isFourDigit(stringInt)) {
                    view.inputError();
                    view.enterNumber();
                    stringInt = input.string();
                }
                int number = MathUtil.stringToInteger(stringInt);
                view.sumOfDigits(calc.sumOfDigits(number));
            } else {
                break;
            }
        }
    }

    /**
     * #2
     * Вычислить значение выражения по формуле (все переменные принимают
     * действительные значения):
     */
    public void resultOfExpression() {
        view.titleValueOfExpression();
        double result;
        String string = "";
        while (!string.equals(END)) {
            double[] arrayDouble = VarCreator.getDoubles(view, input);
            if (MathUtil.isCorrectVariable(arrayDouble)) {
                result = calc.resultOfExpression(arrayDouble);
                view.resultOfExpression(result);
            } else {
                view.noSolution();
            }
            view.stopOrContinue();
            string = input.string();

        }
    }

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    public void sumMinMax() {
        view.titleSum();
        String string = "";
        while (!string.equals(END)) {
            int[] integers = VarCreator.getIntegers(view, input);
            view.sumMinMax(calc.sumMinMax(integers));
            view.stopOrContinue();
            string = input.string();

        }
    }


    public MathInput getInput() {
        return input;
    }

    public MathView getView() {
        return view;
    }
}
