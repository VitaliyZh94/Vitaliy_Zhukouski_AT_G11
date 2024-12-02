package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(birds.stream().map(x -> x.replace("о", "а")).collect(Collectors.joining()).toLowerCase(Locale.ROOT).replace("ь", "").split("б")).map(x -> "--" + x + "--\n").forEach(System.out::println);
    }
}
