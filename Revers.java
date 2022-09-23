package hw5;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Revers {
    public static void main(String[] args) {
        System.out.println(revers(4508));
        System.out.println(revers(4700));
        System.out.println(revers(1234567));
    }

    public static int revers(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            result *= 10;
            currentValue /= 10;
        }
        result /= 10; //закрываем баг
        return result;
    }
}
