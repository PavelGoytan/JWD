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
    public double resultOfExpression(double[] arrayDouble) {
        return (arrayDouble[1] + sqrt(pow(arrayDouble[1], 2) +
                4 * arrayDouble[0] * arrayDouble[2])) /
                (2 * arrayDouble[0]) - pow(arrayDouble[0], 3) *
                arrayDouble[2] + pow(arrayDouble[1], -2);
    }

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    public int sumMinMax(int[] arrayInt) {
        int min = arrayInt[0];
        int max = arrayInt[0];
        for (int i : arrayInt) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : arrayInt) {
            if (i > max) {
                max = i;
            }
        }
        return max + min;
    }

}
