package homework.day9;

import project.content.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {

        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет", "вкусный", 0),
                new Water("Прозрачная", "Нет", "не вкусный", 0),
                new Water("Мутная", "Аммиачный", "нет", 0),
                new Water("Синяя", "Мятный", "нет", 0)
        );

        Stream<Water> waterStream = water.filter(x -> !x.getColor().equals("Прозрачная")).sorted(Comparator.comparing(Water::getSmell).reversed());

        int result = waterStream.map(x -> {

            if (x.getSmell().contains("ы")) {
                String newSmell = x.getSmell().replace("ы", "ыы");
                x.setSmell(newSmell);
            }
            return x;
        }).map(Water::getSmell).collect(Collectors.joining(", ")).length();

        System.out.println(result);
    }
}
