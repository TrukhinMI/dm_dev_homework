package cinema;

import java.util.*;

public class Cinema {
    private Map<Integer, LinkedList<Movie>> map = new TreeMap<>();

    public Cinema() {
    }

    public Cinema(Map<Integer, LinkedList<Movie>> map) {
        this.map = map;
    }

    public void addMovie(Movie movie) {
        map.putIfAbsent(movie.getYear(), new LinkedList<>());
        map.get(movie.getYear()).add(movie);
    }


    public void getMovieYear(int year) {
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()) {
            if (entry.getKey() == year) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void getMovieYearMonth(int year, int month) {
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()) {
            if (entry.getKey() == year) {
                for (Movie movie : entry.getValue()) {
                    if (movie.getMonth() == month) {
                        System.out.println(movie);
                    }
                }
            }
        }
    }

    public void getMovieGenre(String genre) {
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()) {
            for (Movie movie : entry.getValue()) {
                if (movie.getGenre().equals(genre)) {
                    System.out.println(movie);
                }
            }
        }
    }

    public void topTenMovie() {
        List<Movie> movies = new ArrayList<>();
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()) {
            for (Movie movie : entry.getValue()) {
                movies.add(movie);
            }
        }
        movies.sort(new TopTenMovie());
        ;
        for (int i = 0; i < 10 && i != movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "map=" + map +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(map, cinema.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    public Map<Integer, LinkedList<Movie>> getMap() {
        return map;
    }

    public void setMap(Map<Integer, LinkedList<Movie>> map) {
        this.map = map;
    }

    public static class TopTenMovie implements Comparator<Movie> {

        @Override
        public int compare(Movie o1, Movie o2) {
            return Integer.compare(o2.getRating(), o1.getRating());
        }
    }

}


