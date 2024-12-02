package homework.day9;

import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        Pattern vowelsPattern = Pattern.compile(".*[уеыаоэяиюУЕЫАОЭЯИЮ].*");

        countries.filter(x -> vowelsPattern.matcher(x).matches()).filter( x -> x.length() < 7).map(x -> x.toUpperCase(Locale.ROOT)).map(x -> ("\"" + x + "\"")).forEach(System.out::println);
    }
}
