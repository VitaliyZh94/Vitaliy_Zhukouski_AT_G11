package homework.day9;


import homework.day7.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner {

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        System.out.println(bubbles.stream()
                .filter(x -> x.getVolume() > 3)
                .sorted(Comparator.comparing(x -> x.getName().charAt(0)))
                .mapToInt(x -> x.getVolume() * 3)
                .sum());
    }
}
