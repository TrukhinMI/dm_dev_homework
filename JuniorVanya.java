package hw5;

import java.util.Scanner;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class JuniorVanya {
    public static void main(String[] args) {
        live();
    }
    public static void live(){
        int salary = 600;//зарплата
        double investCheck = 0; //инвест счёт
        int check = 0; //общий счёт
        int year = 0;
        int month = 5;
        int months = year * 12 + month;

        for (int currentMonth = 0; currentMonth < months; currentMonth++){
            if (currentMonth % 6 == 0){
                salary += 400;
            }
            check += salary - food() - invest(salary);
            if (currentMonth == 0)
                investCheck += invest(salary);

            if (currentMonth != 0)
                investCheck = investCheck * 0.02 + (investCheck+invest(salary));

        }
        System.out.println("Общий счёт : " + check);
        System.out.println("Инвест счёт : " + investCheck);
    }

    public static int food(){
        return 300;
    }

    public static double invest(int salary){
        return (salary * 0.1);
    }

}
