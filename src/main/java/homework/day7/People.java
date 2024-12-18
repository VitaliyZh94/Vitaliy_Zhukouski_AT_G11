package homework.day7;

import java.util.Arrays;
import java.util.List;

public class People {

    public static void main(String[] args) {

        Person[] peopleArray = new Person[] {
                new Person(23, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        };

        List<Person> people = Arrays.asList(peopleArray);

        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }

        System.out.println("\n");

        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }

        System.out.println("\n");

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
