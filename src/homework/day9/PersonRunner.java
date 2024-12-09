package homework.day9;

import homework.day7.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class PersonRunner {

    public static void main(String[] args) {

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        double average = people.filter(x -> x.getAge() < 60)
                .sorted(Comparator.comparing(x -> x.getName().charAt(0)))
                .map(x -> x.getAge() * 4).mapToInt(Integer::intValue).average().orElse(0);

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/homework/day9/files/person.txt"))) {
            out.write(String.valueOf(average));

        } catch (IOException e) {
            System.out.println(e.getMessage()); //problems with input/output
        }
    }
}
