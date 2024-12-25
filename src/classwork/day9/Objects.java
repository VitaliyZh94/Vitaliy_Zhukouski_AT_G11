package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class Objects {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int women = 0;
        int men = 0;

        for (Person person : people) {
            if (person.age > 18 && person.age < 55 && person.sex == Person.Sex.WOMEN) {
                women++;
            }

            if (person.age > 18 && person.age < 60 && person.sex == Person.Sex.MAN) {
                men++;
            }
        }

        System.out.println(women + men);


        long a = people.stream().filter(person -> (person.age > 18 && person.age < 55 && person.sex == Person.Sex.WOMEN) ||
                (person.age > 18 && person.age < 60 && person.sex == Person.Sex.MAN)).count();

        System.out.println(a);
    }


}
