package hw_oop;

public abstract class Satellite extends SpaceObject {

    public Satellite(String name, int speed, long weight, long radius) {
        super(name, speed, weight, radius);
    }

    @Override
    public String toString() {
        return String.format("Название спутника: %s, движется со скоростью %s, вес - %s.", getName(), getSpeed(), getWeight());
    }

    @Override
    public String moving() {
        return String.format("Спутник %s выходит на круговую орбиту, его скорость %s", getName(), getSpeed());
    }
}
