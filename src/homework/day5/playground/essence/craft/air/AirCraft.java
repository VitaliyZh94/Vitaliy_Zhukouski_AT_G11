package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class AirCraft extends Matter implements Flyable, Transportable {

    public AirCraft(int mass) {
        super(mass);
    }
}
