package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate() {

        int min = 1;
        int max = 80;
        Random random = new Random();
        int randomInt = random.nextInt(max - min) + min;

        System.out.printf("CoordinatesGenerator: I have generated point with value: %d\n", randomInt);
        return randomInt;
    }
}
