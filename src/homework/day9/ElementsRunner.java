package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {

    public static void main(String[] args) {

        Stream<String> elements = Stream.of(
                "Text field",
                "Radio",
                "Check-box",
                "Drop-down",
                "Picker",
                "Breadcrumb");

        elements.flatMap(x -> Arrays.stream(x.split("[ \\-]")))
                .map(x -> {
                    if (x.length() % 2 == 0) {
                        x = x.replace('e', 'o');
                    } else {
                        x = String.valueOf(x.length());
                    }
                    return x;
                })
                .distinct()
                .forEach(System.out::println);
    }
}
