package hw5;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scanner.nextInt();
        System.out.println("Чётных чисел: " + even(value));
        System.out.println("Нечётных чисел: " + odd(value));
    }

    public static int even(int value) {
        int result = 0;
        int numbers = value;
        while (numbers != 0) {
            if ((numbers % 10) % 2 == 0)
                result++;
            numbers /= 10;
        }

        return result;

    }

    public static int odd(int value) {
        int result = 0;
        int numbers = value;
        while (numbers != 0) {
            if ((numbers % 10) % 2 != 0)
                result++;
            numbers /= 10;
        }

        return result;
    }
}
