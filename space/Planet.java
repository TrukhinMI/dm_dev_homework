package hw_oop;

public class Planet extends SpaceObject {


    public Planet(String name, int speed, long weight, long radius) {
        super(name, speed, weight, radius);
    }

    @Override
    public String toString() {
        return String.format("Название планеты: %s, движется со скоростью %s, вес - %s.", getName(), getSpeed(), getWeight());
    }

    @Override
    public String moving() {
        return String.format("Планета %s движется вокруг Солнца, ее скорость %s", getName(), getSpeed());
    }
}
