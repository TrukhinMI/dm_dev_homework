package hw7;

public class Floor {
    private int number;
    Flat[] flats;

    public Floor() {
    }

    public Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public int getNumber() {
        return number;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print(){
        System.out.println("Этаж " +  number+ ", количество квартир " + flats.length);
    }
}
