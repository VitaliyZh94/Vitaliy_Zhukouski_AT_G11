package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.material.Pourable;

public interface Storable {

    void sound();

    default void store(Pourable pourable, int amount) {
        pourable.spread("Store");
        System.out.printf("I am %s, my name is %s and I received %d %s\n",
                this.getClass().getSimpleName(),
                this.getClass().getSimpleName(),
                amount,
                pourable.getClass().getSimpleName());

        if (pourable.mass() > amount) {
            pourable.sound();
        }
    }
}
