package engineers;

public abstract class Person {

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
            throw new IllegalArgumentException("Age must be from 18 to 65");
        }
    }
}
