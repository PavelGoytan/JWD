package by.traning.goytan.task1;


public class MathController {
    private MathCalc calc;
    private MathInput input;
    private MathView view;

    public MathController() {
        this.calc = new MathCalc();
        this.input = new MathInput();
        this.view = new MathView();
    }

    public void programSelection(MathController controller) {
        view.programSelection();
        String string = input.string();
        while (!string.equals("Q")) {
            while (MathUtil.isCorrectInteger(string)
                    || MathUtil.stringToInteger(string) < 1
                    || MathUtil.stringToInteger(string) > 3) {
                view.inputError();
                string = input.string();
            }
            int select = MathUtil.stringToInteger(string);
            if (select == 1) {
                controller.sumOfDigits();
            } else if (select == 2) {
                controller.resultOfExpression();
            } else {
                controller.sumMinMax();
            }
            view.programSelection();
            string = input.string();
        }
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
            if (!stringInt.equals("END")) {
                while (MathUtil.isCorrectInteger(stringInt)
                        || MathUtil.stringToInteger(stringInt) > 9999
                        || MathUtil.stringToInteger(stringInt) < 1000) {
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
        double a;
        double b;
        double c;
        double result;
        String end = "";
        while (!end.equals("END")) {
            double[] arrayDouble = VarCreator.getDoubles(view, input);
            a = arrayDouble[0];
            b = arrayDouble[1];
            c = arrayDouble[2];
            if (MathUtil.isCorrectVariable(a, b, c)) {
                result = calc.resultOfExpression(a, b, c);
                view.resultOfExpression(result);
            } else {
                view.noSolution();
            }
            System.out.println("Для продолжения нажмите Enter, для завершения введите \"END\"");
            end = input.string();

        }
    }

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    public void sumMinMax() {
        view.titleSum();
        String end = "";
        while (!end.equals("END")) {
            int[] integers = VarCreator.getIntegers(view, input);
            view.sumMinMax(calc.sumMinMax(integers));
            System.out.println("Для продолжения нажмите Enter, для завершения введите \"END\"");
            end = input.string();

        }
    }
}
