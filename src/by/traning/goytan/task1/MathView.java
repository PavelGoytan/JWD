package by.traning.goytan.task1;

public class MathView {

    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */

    public void enterNumber() {
        System.out.println("Введите четырехзначное число:");
    }

    public void sumOfDigits(boolean isTrue) {
        System.out.println("Высказывание \"Сумма двух первых цифр," +
                " введенного четырехзначного числа," +
                " равна сумме двух его последних цифр.\", является: " + isTrue);

    }

    public void resultOfExpression(double result) {
        System.out.println("Результат выражения равен: " + result);
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


}

