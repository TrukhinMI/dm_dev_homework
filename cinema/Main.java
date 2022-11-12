package cinema;


public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie(1, 2000, 11, "Драма", 7));
        cinema.addMovie(new Movie(1, 2000, 11, "Драма", 7));
        cinema.addMovie(new Movie(2, 2000, 12, "Гонки", 8));
        cinema.addMovie(new Movie(3, 2001, 11, "Боевик", 6));
        cinema.addMovie(new Movie(4, 2011, 7, "Мультики", 10));
        cinema.addMovie(new Movie(5, 2002, 7, "Драма", 4));
        cinema.addMovie(new Movie(6, 2004, 11, "Драма", 7));
        cinema.addMovie(new Movie(7, 2010, 12, "Мультики", 10));
        cinema.addMovie(new Movie(8, 2000, 9, "Драма", 3));
        cinema.addMovie(new Movie(9, 2001, 8, "Гонки", 5));
        cinema.addMovie(new Movie(10, 2003, 10, "Драма", 1));
        cinema.addMovie(new Movie(11, 2002, 1, "Боевик", 2));

//        cinema.getMovieYear(2000);
//        cinema.getMovieYearMonth(2000,12);
//        cinema.getMovieGenre("Драма");
        cinema.topTenMovie();


    }
}
