package homework.day5.playground.utils;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {
        int distance = new Random().nextInt(1,100);
        System.out.println("DistanceGenerator: I have generated distance with value: " + distance);
        return distance;
    }
}
