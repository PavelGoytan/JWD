package by.traning.goytan.task1;

public class ProgramSelection {
    public static final String EXIT = "Q";
    private final Controller controller;
    private final Input input;
    private final Output view;

    public ProgramSelection(Controller controller) {
        this.controller = controller;
        this.input = controller.getInput();
        this.view = controller.getView();
    }

    public void programSelection() {
        view.programSelection();
        String string = input.string();
        while (!string.equals(EXIT)) {
            while (VarValidator.isCorrectInteger(string)
                    || Integer.parseInt(string) < 1
                    || Integer.parseInt(string) > 3) {
                view.inputError();
                string = input.string();
            }
            int select = Integer.parseInt(string);
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
