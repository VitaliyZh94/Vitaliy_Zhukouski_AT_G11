package homework.day5.playground.essence.material;

import homework.day5.playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable{

    public Petrol(int mass) {
        super(mass);
    }

    @Override
    public int mass() {
        return mass;
    }

    @Override
    public void sound() {
        System.out.println("whooh..");
    }
}
