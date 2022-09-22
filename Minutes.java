package hw4;

/**
 * Задание 1
 *
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *
 * Протестировать функцию в main.
 */

public class Minutes {
    public static void main(String[] args) {
        minutes(45);
    }

    public static void minutes(int minutes){
        if (minutes >= 0 && minutes <= 14)
            System.out.println(minutes + " минут попадает в первую четверть часа");
        else if (minutes >= 15 && minutes <= 29)
            System.out.println(minutes + " минут попадает во вторую четверть часа");
        else if (minutes >= 30 && minutes <= 44)
            System.out.println(minutes + " минут попадает в третью четверть часа");
        else if (minutes >= 45 && minutes <= 59)
            System.out.println(minutes + " минут попадает в четвертую четверть часа");
        else
            System.out.println("Ввели не корректное значение");
    }
}
