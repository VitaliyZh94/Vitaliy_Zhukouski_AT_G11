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
        this.water.isOpened();
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    public void setBubbles(double liters) {

        int arrayLength = 10000 * (int) liters;
        //генерирует массив из обьектов Bubble
        Bubble[] bubbles = new Bubble[arrayLength];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("gas");
        }
    }
}
