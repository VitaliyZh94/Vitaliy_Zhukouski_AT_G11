package project.runner;

import project.boxing.Bottle;
import project.content.SparklingWater;

public class Factory {

    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(0.05);
        Bottle bottle2 = new Bottle(0.1);
        Bottle bottle3 = new Bottle(0.2);

        SparklingWater sparklingWater1 = new SparklingWater(null, null,null, 12);
        SparklingWater sparklingWater2 = new SparklingWater(null, null,null, 18);
        SparklingWater sparklingWater3 = new SparklingWater(null, null,null, 25);

    }
}
