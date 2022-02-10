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
        view.enterNumber();
        int number = input.number();
        while (number > 9999 || number < 1000) {
            view.inputError();
            view.enterNumber();
            number = input.number();
        }
        view.sumOfDigits(calc.sumOfDigits(number));
    }
    public void resultOfExpression(){
        double[] doubles;
        view.enterThreeNumber();
        String string = input.string();
        while (!MathUtil.isCorrectEnter(string)){
            view.inputError();
            view.enterThreeNumber();
            string = input.string();
        }
        doubles = MathUtil.threeNumber(string);



    }
}
