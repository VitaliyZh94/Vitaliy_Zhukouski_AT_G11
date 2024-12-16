package project.runner;

import project.boxing.Bottle;
import project.content.SparklingWater;

public class Factory {

    public static void main(String[] args) {

        double firstVolume = 0.05;
        double secondVolume = 0.1;
        double thirdVolume = 0.2;

        Bottle bottle1 = new Bottle(firstVolume);
        Bottle bottle2 = new Bottle(secondVolume);
        Bottle bottle3 = new Bottle(thirdVolume);

        SparklingWater sparklingWater1 = new SparklingWater(null, null, null, 0);
        SparklingWater sparklingWater2 = new SparklingWater(null, null, null, 0);
        SparklingWater sparklingWater3 = new SparklingWater(null, null, null, 0);

        bottle1.setWater(sparklingWater1);
        bottle1.warm(12);
        bottle1.setBubbles(firstVolume);
        bottle1.open();

        bottle2.setWater(sparklingWater2);
        bottle2.warm(18);
        bottle2.setBubbles(secondVolume);
        bottle2.open();

        
        
        bottle3.setWater(sparklingWater3);
        bottle3.warm(25);
        bottle3.setBubbles(thirdVolume);
        bottle3.open();


    }
}
