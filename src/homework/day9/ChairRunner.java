package homework.day9;

import homework.day7.Bubble;
import homework.day7.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
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

        Stream<Chair> furnitureStream = furniture.filter(x -> x.getHeight() >= 100 && x.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth, Comparator.reverseOrder()));

        Stream<Chair> chairStream = furnitureStream.map(x -> new Chair(x.getHeight() * new Random().nextInt(3, 9), x.getWidth() / 2));

        Optional<Integer> max = chairStream.map(x -> x.getHeight() * x.getWidth()).distinct().max(Integer::compareTo);

        String[] words = intsToWords(max.get());

        String result = String.join("-", words);

        Bubble bubble = new Bubble(max.get(), result);

        System.out.println(bubble);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/homework/day9/files/Chair.txt"))) {
            bufferedWriter.write(result);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static String[] stringNumbers = new String[]{"Zero", "One", "Two", "Three", "For", "Five", "Six", "Seven", "Eight", "Nine"};

    private static String[] intsToWords(int num) {

        String[] numbers = String.valueOf(num).split("");
        int[] intNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.valueOf(numbers[i]);
        }

        String[] strings = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strings[i] = stringNumbers[intNumbers[i]];
        }

        return strings;
    }
}
