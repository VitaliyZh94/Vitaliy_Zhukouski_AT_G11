package homework.day5.playground.essence.craft.air;

public class Copter extends AirCraft {

    public Copter(int mass, String name) {
        super(mass,name);
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
        return "Copter{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
