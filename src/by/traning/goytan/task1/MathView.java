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
    public void inputError() {
        System.out.println("Некорректный ввод!");
    }
    public void enterThreeNumber(){
        System.out.println("Ведите три числа, через пробел:");

        }
    }

