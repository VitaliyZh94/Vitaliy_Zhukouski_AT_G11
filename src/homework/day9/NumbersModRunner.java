package homework.day9;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;

public class NumbersModRunner {

    public static void main(String[] args) {

        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);

        Map<Integer, String> integerStringMap = Map.of(
                0, "Zero",
                1, "One",
                2, "Two",
                3, "Three",
                4, "For",
                5, "Five",
                6, "Six",
                7, "Seven",
                8, "Eight",
                9, "Nine");

        numbersMod.filter(x -> String.valueOf(x).contains("3"))
                .flatMap(x -> String.valueOf(x).chars().mapToObj(c -> c - '0'))
                .map(integerStringMap::get)
                .distinct().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}

