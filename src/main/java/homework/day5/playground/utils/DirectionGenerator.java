package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();
        int num = random.nextInt(40);

        if (num < 10) {
            return "NORTH";
        } else if (num >= 10 && num < 20) {
            return "SOUTH";
        } else if (num >= 20 && num < 30) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
