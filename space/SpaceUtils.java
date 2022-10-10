package hw_oop;

public final class SpaceUtils {
    public static final int MIRACLE_NUMBER = 1993;

    public static double defineGravity(SpaceObject spaceObjectOne, SpaceObject spaceObjectTwo) {
        return Math.sin(MIRACLE_NUMBER) * ((spaceObjectOne.getWeight() - spaceObjectOne.getRadius() + spaceObjectOne.getSpeed()) - (spaceObjectTwo.getWeight() - spaceObjectTwo.getRadius() + spaceObjectTwo.getSpeed()));
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Stars;
    }
}
