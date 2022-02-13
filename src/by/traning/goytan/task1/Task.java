package by.traning.goytan.task1;


public class Task {
    public static void main(String[] args) {
        MathController controller = new MathController();
        ProgramSelection programSelection = new ProgramSelection(controller);
        programSelection.programSelection();
    }
}


