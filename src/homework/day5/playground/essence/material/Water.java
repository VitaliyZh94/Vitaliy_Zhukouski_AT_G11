package homework.day5.playground.essence.material;

import homework.day5.playground.essence.Matter;

public class Water extends Matter implements Pourable {

    public Water(int mass) {
        super(mass);
    }

    @Override
    public int mass() {
        return mass;
    }

    @Override
    public void sound() {
        System.out.println("whobl-whobl..");
    }
}
