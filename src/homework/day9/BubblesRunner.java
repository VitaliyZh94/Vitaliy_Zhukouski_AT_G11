package homework.day9;


import homework.day7.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BubblesRunner {

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        Stream<Bubble> bubbleStream = bubbles.stream().filter(x -> x.getVolume() > 3).sorted(Comparator.comparing(x -> x.getName().charAt(0)));

        System.out.println(bubbleStream.mapToInt(x -> x.getVolume() * 3).sum());
    }
}
