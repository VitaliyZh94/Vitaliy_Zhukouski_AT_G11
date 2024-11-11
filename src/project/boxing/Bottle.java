package project.boxing;

import project.content.Bubble;
import project.content.SparklingWater;

public class Bottle {
    SparklingWater sparklingWater;

    double volume;

    public Bottle(double volume, double waterTemperature) {
        this.volume = volume;
//        sparklingWater = new SparklingWater(volume);
//        sparklingWater.temperature = waterTemperature;
//        sparklingWater.pump(new Bubble[] {new Bubble(200)});
    }

    public void open() {
        //sparklingWater.bottleIsOpen = true;
        sparklingWater.isOpened();
    }
}
