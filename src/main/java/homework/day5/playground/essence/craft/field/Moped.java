package homework.day5.playground.essence.craft.field;

public class Moped extends Vehicle{

    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String toString() {
        return "Moped{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
