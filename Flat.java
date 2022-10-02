package hw7;

public class Flat {
    private int number;
    Room[] rooms;

    public Flat() {
    }

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print(){
        System.out.println("Квартира " +  number+ ", количество комнат " + rooms.length);
    }
}
