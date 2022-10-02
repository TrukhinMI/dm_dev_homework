package hw7;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class Task7_1_OOP {
    public static void main(String[] args) {
        Room[] rooms = new Room[3];
        for (int i = 0; i < rooms.length; i++){
            if (i == 1) {
                rooms[i] = new Room(true);
            } else {
                rooms[i] = new Room(false);
            }
        }

        Flat[] flats = new Flat[4];
        for (int i = 0, j = 1; i < flats.length; i++, j++){
            flats[i] = new Flat(j, rooms);
        }

        Floor[] floors = new Floor[6];
        for (int i = 0, j = 1; i < floors.length; i++, j++){
            floors[i] = new Floor(j, flats);
        }

        House house = new House(8, floors, flats, rooms);
        printAllInformation(house);
    }

    public static void printAllInformation(House house){
        System.out.println("Дом " + house.getNumber() + ", количество этажей " + house.getFloors() +
                ", количество квартир " + house.getFlats() + ", количество комнат " + house.getRooms());


    }

//Задачу вообще не понял, стыдно
}
