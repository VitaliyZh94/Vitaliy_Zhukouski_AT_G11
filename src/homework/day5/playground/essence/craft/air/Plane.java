package homework.day5.playground.essence.craft.air;

public class Plane extends AirCraft{

    public Plane(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void fly(String direction) {
        super.fly(direction);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
