package by.traning.goytan.task1;


public class TaskRunner {
    public static void main(String[] args) {
        Controller controller = new Controller();
        ProgramSelection programSelection = new ProgramSelection(controller);
        programSelection.programSelection();
    }
}


