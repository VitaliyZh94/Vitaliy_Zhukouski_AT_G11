package homework.day9;

import homework.day7.Chair;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class ChairRunner {

    public static void main(String[] args) {

        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        );

        furniture.filter(x -> x.getHeight() >= 100 && x.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth, Comparator.reverseOrder()))
                .map(x -> x.getWidth() / 2 + x.getHeight() * new Random().nextInt (3,9));
        //TODO

    }
}
