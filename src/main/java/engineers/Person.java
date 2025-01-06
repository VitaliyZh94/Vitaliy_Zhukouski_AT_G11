package engineers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person {

    private static final Logger LOGGER = LogManager.getLogger(Person.class);

    private int age;

    public Person(int age) {
        this.age = age;
        ageAdmission();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        ageAdmission();
    }

    private void ageAdmission() {
        if (age < 18 || age > 65) {
            LOGGER.error("Age must be from 18 to 65");
        }
    }
}
