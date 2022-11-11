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
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()) {
            if (movie.getYear() != entry.getKey()) {
                map.put(movie.getYear(), entry.setValue(new LinkedList<>()));
            } else {
                LinkedList<Movie> linkedListMovie = entry.getValue();
                Iterator<Movie> iterator = linkedListMovie.iterator();
                while (iterator.hasNext()) {
                    Movie movieIterator = iterator.next();
                    if (movieIterator.equals(movie)){
                        System.out.println("Такой фильм уже есть в кино");
                    } else {
                        map.put(entry.getKey(), new LinkedList<>());
                    }
                }
            }
        }
    }

    public void print(){
        for (Map.Entry<Integer, LinkedList<Movie>> entry : map.entrySet()){
            System.out.println("Ключ " + entry.getKey());
            Iterator <Movie> iterator = entry.getValue().iterator();
            while (iterator.hasNext()){
                Movie movie = iterator.next();
                System.out.println(movie);
            }
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
}
