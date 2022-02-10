package by.traning.goytan.task1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathCalc {
    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */
    public boolean sumOfDigits(int number) {
        int[] array = new int[4];
        for (int i = 3; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return (array[0] + array[1]) == (array[2] + array[3]);
    }

    /**
     * #2
     * Вычислить значение выражения по формуле (все переменные принимают
     * действительные значения):
     */
    public double resultOfExpression(double a, double b, double c) {
        return (b + sqrt(pow(b, 2) + 4 * c * a)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
    }

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
