package homework.day5.playground.essence.material;

import homework.day5.playground.essence.Matter;

public class Diesel extends Matter implements Pourable, Powerable{

    public Diesel(int mass) {
        super(mass);
    }

    @Override
    public int mass() {
        return mass;
    }

    @Override
    public void sound() {
        System.out.println("wheeh..");
    }
}
