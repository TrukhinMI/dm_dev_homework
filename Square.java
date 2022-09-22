package hw4;

import java.util.Scanner;

/**
 * Задание 3
 * <p>
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 сторону первого треугольника");
        int a1 = scanner.nextInt();
        System.out.println("Введите 2 сторону первого треугольника");
        int b1 = scanner.nextInt();
        System.out.println("Введите 1 сторону второго треугольника");
        int a2 = scanner.nextInt();
        System.out.println("Введите 2 сторону второго треугольника");
        int b2 = scanner.nextInt();

        compare(square(a1, b1), square(a2, b2));
    }

    public static double square(int a, int b) {
        return a * b * 0.5;
    }

    public static void compare(double triangle1, double triangle2) {
        if (triangle1 > triangle2)
            System.out.println("Треугольник 1(" + triangle1 + ") больше, чем 2(" + triangle2 + ")");
        else if (triangle1 < triangle2)
            System.out.println("Треугольник 1(" + triangle1 + ") меньше, чем 2(" + triangle2 + ")");
        else
            System.out.println("Треугольники равны");
    }


}
