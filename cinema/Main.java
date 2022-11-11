package cinema;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(1,2000, 11, "Драма", 7));
        cinema.addMovie(new Movie(2,2000, 12, "Драма", 8));
        cinema.addMovie(new Movie(3,2001, 11, "Боевик>", 6));
        cinema.addMovie(new Movie(1,2000, 11, "Драма", 7));

        cinema.print();
    }
}
