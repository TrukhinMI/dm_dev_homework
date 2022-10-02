package hw7;

public class House {
    private int number;
    Floor[] floors;
    Flat[] flats;
    Room[] rooms;

    public House() {
    }

    public House(int number, Floor[] floors, Flat[] flats, Room[] rooms) {
        this.number = number;
        this.floors = floors;
        this.flats = flats;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public int getFloors() {
        return floors.length;
    }

    public int getFlats() {
        return flats.length;
    }

    public int getRooms(){
        return rooms.length;
    }

    public void print(){
        System.out.println("Дом " +  number + ", количество этажей " + floors.length);
    }
}
