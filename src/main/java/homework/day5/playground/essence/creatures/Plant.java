package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Plant extends Matter {

    protected String name;

    public Plant(int mass) {
        super(mass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
