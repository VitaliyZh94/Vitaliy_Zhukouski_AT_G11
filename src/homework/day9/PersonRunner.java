package homework.day9;

import homework.day7.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PersonRunner {

    public static void main(String[] args) {

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        List<Person> peoples = people.filter(x -> x.getAge() < 60).sorted(Comparator.comparing(x -> x.getName().charAt(0))).toList();

        double average = (peoples.stream().mapToDouble(x -> x.getAge() + 4).sum()) / peoples.stream().count();

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/homework/day9/files/person.txt"))) {
            out.write(String.valueOf(average));

        } catch (IOException e) {
            System.out.println(e.getMessage()); //problems with input/output
        }
    }
}
