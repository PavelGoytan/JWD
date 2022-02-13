package by.traning.goytan.task1;

public class ProgramSelection {
    public static final String EXIT = "Q";
    private MathController controller;
    private MathInput input;
    private MathView view;

    public ProgramSelection(MathController controller) {
        this.controller = controller;
        this.input = controller.getInput();
        this.view = controller.getView();
    }

    public void programSelection() {
        view.programSelection();
        String string = input.string();
        while (!string.equals(EXIT)) {
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
}
