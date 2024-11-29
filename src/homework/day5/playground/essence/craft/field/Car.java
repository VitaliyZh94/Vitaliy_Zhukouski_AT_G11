package homework.day5.playground.essence.craft.field;

public class Car extends Vehicle{

    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
