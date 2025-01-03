package homework.day5.playground.essence.craft.air;

public class Rocket extends AirCraft {

    public Rocket(int mass, String name) {
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
        return "Rocket{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
