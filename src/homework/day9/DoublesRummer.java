package homework.day9;

import homework.day7.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRummer {

    public static void main(String[] args) {

        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        Random random = new Random();

        Stream<Integer> integerStream = doubles.map(x -> random.nextInt(0, x.intValue())).distinct();

        Stream<Bubble> bubbleStream = integerStream.flatMap(x -> IntStream.of(x).mapToObj(y -> new Bubble(x, "Bubble vol-" + x)));

        bubbleStream.forEach(System.out::println);
        System.out.println(bubbleStream.mapToInt(x -> x.getVolume()).sum());

        //TODO
    }
}
