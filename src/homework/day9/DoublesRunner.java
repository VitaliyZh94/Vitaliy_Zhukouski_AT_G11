package homework.day9;

import homework.day7.Bubble;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {

    public static void main(String[] args) {

        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        List<Bubble> bubbles = doubles.mapToInt(x -> Math.toIntExact(Math.round(x))).boxed()
                .flatMap(num -> new Random().ints(0, num + 1)
                        .limit(1)
                        .boxed()).flatMap(x -> IntStream.range(0, x)
                        .mapToObj(i -> new Bubble(x, "Bubble vol-" + x))).toList();

        bubbles.forEach(System.out::println);
        System.out.println(bubbles.size());
    }
}
