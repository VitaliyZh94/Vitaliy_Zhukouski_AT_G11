package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class AirCraft extends Matter implements Flyable, Transportable {

    protected String name;

    public AirCraft(int mass, String name) {
        super(mass);
        this.name = name;
    }


}
