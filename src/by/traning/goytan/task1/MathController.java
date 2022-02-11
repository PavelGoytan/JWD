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

    public void sumOfDigits() {

        for (; ; ) {
            view.enterNumber();
            String stringInt = input.string();
            if (!stringInt.equals("END")) {
                while (!MathUtil.isCorrectInteger(stringInt)) {
                    view.inputError();
                    view.enterNumber();
                    stringInt = input.string();
                }
                int number = MathUtil.stringToInteger(stringInt);
//        int number = input.number();
                while (number > 9999 || number < 1000) {
                    view.inputError();
                    view.enterNumber();
                    number = input.number();
                }
                view.sumOfDigits(calc.sumOfDigits(number));
            } else {
                break;
            }
        }
    }

    public void resultOfExpression() {
//        double[] arrayDouble = VarCreator.getDoubles(view,input);

        double a;// = arrayDouble[0];
        double b;// = arrayDouble[1];
        double c;// = arrayDouble[2];
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


}
