package by.traning.goytan.task1;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathInput {

    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */

    public int number() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public String string(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * #2
     * Вычислить значение выражения по формуле (все переменные принимают
     * действительные значения):
     */

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    public static int sumMinMax(int a, int b, int c) {
        int[] array = {a, b, c};
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max + min;
    }
}
