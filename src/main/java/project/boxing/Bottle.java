package project.boxing;

import project.content.Bubble;
import project.content.Water;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {

        return volume;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void open() {
        System.out.println("Bottle is opened");

        water.isOpened();
        water.setOpened();

        System.out.println("\n");
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
        System.out.printf("Set %d temperature to water\n", temperature);
    }

    public void setBubbles(double liters) {

        double arrayLength = 10000 * liters;

        Bubble[] bubbles = new Bubble[(int)arrayLength];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("gas");
        }

        System.out.printf("Set %f bubbles to the bottle\n", arrayLength);

        water.pump(bubbles);

    }
}
