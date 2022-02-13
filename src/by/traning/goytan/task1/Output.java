package by.traning.goytan.task1;

public class Output {
    public void programSelection() {
        System.out.println("Введите 1, 2 или 3, для выбора программы или \"Q\", для выхода");
    }

    public void titleFourDigit() {
        System.out.println("""
                Программа, печатающая значение true, если указанное высказывание является истинным,
                и false — в противном случае:
                "Сумма двух первых цифр заданного четырехзначного числа
                равна сумме двух его последних цифр.\"""");
        System.out.println();
    }

    public void enterNumber() {
        System.out.println("Введите четырехзначное число или \"END\" для выхода:");
    }

    public void sumOfDigits(boolean isTrue) {
        System.out.println("Высказывание \"Сумма двух первых цифр," +
                " введенного четырехзначного числа," +
                " равна сумме двух его последних цифр.\", является: " + isTrue);
        System.out.println();

    }

    public void titleValueOfExpression() {
        System.out.println();
        System.out.println("Программа, Вычисляет значение выражения по формуле (все переменные принимают\n" +
                "действительные значения):" +
                " (b + sqrt(pow(b, 2) + 4 * c * a)) / (2 * a) - pow(a, 3) * c + pow(b, -2)");
        System.out.println();
    }

    public void resultOfExpression(double result) {
        System.out.println("Результат выражения равен: " + result);
    }

    public void titleSum() {
        System.out.println();
        System.out.println("Программа нахождения суммы большего и меньшего из трех чисел.");
        System.out.println();
    }

    public void sumMinMax(int result) {
        System.out.println("Сумма минимального и максимального из трех чисел равна: " + result);
    }

    public void noSolution() {
        System.out.println("При введенных переменных, выражение не имеет решения");
    }

    public void inputError() {
        System.out.println("Некорректный ввод!");
    }


    public void enterNumber(String variable) {
        System.out.println("Введите действительно число, переменная " + variable + " : ");
    }

    public void enterInteger(String variable) {
        System.out.println("Введите " + variable + " число: ");
    }

    public void stopOrContinue() {
        System.out.println("Для продолжения нажмите Enter, для завершения введите \"END\"");
    }


}

