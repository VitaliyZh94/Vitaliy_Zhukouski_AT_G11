package homework.day5.playground.essence.creatures;

public class Beetle extends Insect {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        int massDelta = (int) home.getMass() / mass;

        if (this.getMass() < home.getMass()) {
            System.out.printf("I am %s and i will nest there with %d my family members\n", name, massDelta);
        } else {
            System.out.printf("This carrot is too small for nesting\n");
        }

    }
}
