package hw_oop;

public class Asteroid extends SpaceObject {

    public Asteroid(String name, int speed, long weight, long radius) {
        super(name, speed, weight, radius);
    }

    @Override
    public String toString() {
        return String.format("Название Астеройда: %s, движется со скоростью %s, вес - %s.", getName(), getSpeed(), getWeight());

    }

    @Override
    public String moving() {
        return String.format("Астеройд %s движущееся по орбите вокруг Солнца.", getName());
    }


}
