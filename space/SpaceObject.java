package hw_oop;

public abstract class SpaceObject implements Movinable {
    private String name;

    private int speed;
    private long weight;

    private long radius;


    public SpaceObject(String name, int speed, long weight, long radius) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.radius = radius;
    }

    @Override
    public abstract String toString();

    public long diameter() {
        return getRadius() * 2;
    }

    public void compareMass(SpaceObject objectTwo) {
        if (this.getWeight() > objectTwo.getWeight())
            System.out.println("Масса " + this.getName() + " больше чем " + objectTwo.getName() + " на " + (this.getWeight() - objectTwo.getWeight()));
        else
            System.out.println("Масса " + objectTwo.getName() + " больше чем " + this.getName() + " на " + (objectTwo.getWeight() - getWeight()));

    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}
