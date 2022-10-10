package hw_oop;

/**
 * 2. Обязательно использовать наследование (достаточно 1-2 уровней)
 */

public class ArtificialSatellites extends Satellite {
    private String country;

    public ArtificialSatellites(String name, int speed, long weight, String country, long radius) {
        super(name, speed, weight, radius);
        this.country = country;
    }

    public String launch() {
        return String.format("%s запустила спутника %s", getCountry(), getName());
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
