package hw_oop;

/**
 * 3. Использовать полиморфизм и продемонстрировать переопределение методов в иерархии
 */


public class SpaceRunner {
    public static void main(String[] args) {
        SpaceObject starsSirius = new Stars("Сириус", 5, (2 * 10 ^ 27), 5000);
        SpaceObject starsVega = new Stars("Вега", 4, (2 * 10 ^ 30), 3000);
        SpaceObject naturalSatelliteMoon = new NaturalSatellites("Луна", 3500, 7 * 10 ^ 22, 4500);
        SpaceObject planetEarth = new Planet("Земля", 1674, 5 * 10 ^ 19, 2900);

        moving(starsSirius, starsVega, naturalSatelliteMoon, planetEarth);

        starsSirius.compareMass(starsVega);

        System.out.println("Гравитация между " + planetEarth.getName() + " и " + starsSirius.getName() + " равна " + SpaceUtils.defineGravity(planetEarth, starsSirius));
        System.out.println(SpaceUtils.isStar(starsSirius));
    }

    public static void moving(SpaceObject... spaceObjects) {
        for (SpaceObject spaceObject : spaceObjects) {
            System.out.println(spaceObject.moving());
        }
    }
}
