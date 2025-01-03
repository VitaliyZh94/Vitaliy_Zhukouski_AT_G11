package homework.day9;

import java.util.Locale;
import java.util.stream.Stream;

public class CarsRunner {

    public static void main(String[] args) {

        Stream<String> cars = Stream.of(
                "Мерс",
                "Ауди",
                "Жигуль",
                "Рено",
                "Жигуль",
                "Жигуль",
                "Ауди");

        cars.distinct()
                .filter(x -> x.contains("и"))
                .skip(1)
                .map(x -> x.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);
    }


}
