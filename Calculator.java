package hw4;

/**
 * Даны 3 переменные:
 *
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Calculator {
    public static void main(String[] args) {
        double result = calculator(24.4, 10.1, '+');
        System.out.println(result);

    }

    public static double calculator(double operand1, double operand2, char operation){
        if (operation == '+') return operand1 + operand2;
        else if (operation == '-') return  operand1 - operand2;
        else if (operation == '*') return operand1 * operand2;
        else if (operation == '/' && operand2 != 0) return operand1 / operand2;
        else if (operation == '%') return operand1 % operand2;
        else return 404;
    }
}
