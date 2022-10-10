package hw_oop;

public class Stars extends SpaceObject {
    public Stars(String name, int speed, long weight, long radius) {
        super(name, speed, weight, radius);
    }

    @Override
    public String moving() {
        return String.format("Звезда %s движется вокруг черной дыры по эллиптическим орбитам со скоростями, достигающими %s тысяч километров в секунду.", getName(), getSpeed());
    }

    @Override
    public String toString() {
        return String.format("Название звезды: %s, движется со скоростью %s, вес - %s.", getName(), getSpeed(), getWeight());
    }


}
