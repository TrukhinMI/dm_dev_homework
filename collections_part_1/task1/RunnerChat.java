package chat;

/**
 * Задание 1
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 *
 * Задача:
 *
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 *
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 *
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

import java.util.*;

public class RunnerChat {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Друзья" , 50));
        chats.add(new Chat("Юмор", 1800));
        chats.add(new Chat("Мальчишник", 999));
        chats.add(new Chat("Девичник", 1300));
        chats.add(new Chat("Авто", 1300));

        System.out.println("Удаление чатов, где меньше 1000 пользователей");
        deleteChat(chats);
        System.out.println(chats);

        System.out.println("Сортировка чатов");
        chats.sort(new ChatComparatorUsers().thenComparing(new ChatComparatorName()));
        System.out.println(chats);

        System.out.println("Сортировка чатов по умолчанию");
        Collections.sort(chats);
        System.out.println(chats);

    }

    public static ListIterator<Chat> deleteChat(List<Chat> chats){
        ListIterator<Chat> listIterator = chats.listIterator();
        while (listIterator.hasNext()){
            if (listIterator.next().getNumberOfUsers() < 1000){
                listIterator.remove();
            }
        }
        return listIterator;
    }

    public static class ChatComparatorName implements Comparator<Chat>{

        @Override
        public int compare(Chat o1, Chat o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ChatComparatorUsers implements Comparator<Chat>{

        @Override
        public int compare(Chat o1, Chat o2) {
            return o1.getNumberOfUsers() - o2.getNumberOfUsers();
        }
    }
}
