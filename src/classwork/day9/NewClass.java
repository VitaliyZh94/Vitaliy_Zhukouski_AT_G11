package classwork.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewClass {

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        String a = list.stream().findFirst().orElse("Мама");

        String b = list.stream().filter("мама"::equals).findFirst().get();

        String c = list.stream().skip(4).findFirst().get();

        List<String> strings = list.stream().skip(2).limit(2).toList();

        List<String> strings2 = list.stream().distinct().filter(x -> x.contains("м")).toList();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(strings);
        System.out.println(strings2);
    }
}
