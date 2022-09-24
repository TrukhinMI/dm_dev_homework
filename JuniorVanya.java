package hw5;

import java.math.BigDecimal;
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
    private static final int EXPENSES_FOOD = 300;
    private static final double REPLENISHMENT_INVESTMENTS = 0.1;
    private static final double PROFIT_ON_INVESTMENT = 0.02;
    private static final  double INCREASE_SALARY = 400;

    public static void main(String[] args) {
        live();
    }
    public static void live(){
        int salary = 600;//зарплата
        double investCheck = 0; //инвест счёт
        double check = 0; //общий счёт
        int year = 0;
        int month = 7;
        int months = year * 12 + month;


        for (int currentMonth = 0; currentMonth <= months; currentMonth++){
            if (currentMonth == 6){
                salary += INCREASE_SALARY;
                check += salary - EXPENSES_FOOD - (salary * REPLENISHMENT_INVESTMENTS);
                //investCheck.add(BigDecimal.valueOf(salary*REPLENISHMENT_INVESTMENTS));
                investCheck += salary * REPLENISHMENT_INVESTMENTS;

            }
            else if(currentMonth != 0 && currentMonth != 6){
                check += salary - EXPENSES_FOOD - (salary * REPLENISHMENT_INVESTMENTS);
                //investCheck.add(BigDecimal.valueOf(salary * REPLENISHMENT_INVESTMENTS));
                investCheck += salary * REPLENISHMENT_INVESTMENTS;
            }

            if (currentMonth !=0 && currentMonth !=1){
                //investCheck.add(BigDecimal.valueOf(PROFIT_ON_INVESTMENT));
                investCheck += (investCheck*PROFIT_ON_INVESTMENT);

            }

        }

        System.out.println("Общий счёт : " + check);
        System.out.println("Инвест счёт : " + investCheck);
    }

}
