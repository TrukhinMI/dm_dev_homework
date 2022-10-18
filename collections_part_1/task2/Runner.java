package chat2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 *
 * Задача:
 *
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 *
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

public class Runner {

    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>(Arrays.asList(
                new Chat("Boy" , new ArrayList<User>(Arrays.asList(new User(1, "Max", 27), new User(5, "Oleg", 28)))),
                new Chat("Girl" , new ArrayList<User>(Arrays.asList(new User(2, "Tanya", 26), new User(3, "Katya", 30), new User(4, "Vera", 13))))));

//      Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
        List<User> usersList = new ArrayList<>() ;
        User currentUser;
        int year;
        Iterator<Chat> chatIterator = chats.iterator();
        while (chatIterator.hasNext()){
            Chat chatNext = chatIterator.next();
            Iterator<User> userIterator = chatNext.getList().iterator();
            while (userIterator.hasNext()){
                currentUser = userIterator.next();
                if (currentUser.getYears() > 18) {
                    usersList.add(currentUser);
                }
            }
        }

        for (User user : usersList){
            System.out.println(user);
        }

//        С помощью итератора посчитать средний возраст всех оставшихся пользователей.

        int countUser = 0;
        int sumYear = 0;


        Iterator<User> sumYaerIterator = usersList.iterator();
        while (sumYaerIterator.hasNext()){
            sumYear+=sumYaerIterator.next().getYears();
            countUser++;
        }
        System.out.println("Средний возраст - " + sumYear / countUser);


    }
}
