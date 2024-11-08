package bubbles;

public class SparklingWater extends Water {

    Bubble[] bubbles;

    final double bubblesInLiter = 100;
    double liters;
    double bubblesInBottle;
    boolean bottleIsOpen = false;

    public SparklingWater(double liters) {
        this.liters = liters;
        bubblesInBottle = liters * bubblesInLiter;
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {

        System.out.println("degas");
        double iterations = bubblesInBottle;

        for (Bubble bubble : bubbles) {
            for (int i = 0; i < iterations; i++) {
                bubble.burst();
                bubblesInBottle--;
            }
        }
    }

    public void isOpened() {

        boolean iterations = true;

        while (iterations) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//
//            if (bottleIsOpen == true) {
//
//                iterations = false;
//
//

                int zeroTemperature = 0;
                int bubblesInSec = 10;
                double coefficient = temperature - zeroTemperature;
                bubblesInSec += (coefficient * 5);

                while (bubblesInBottle <= 0) {
                    try {
                        Thread.sleep(1000 / bubblesInSec);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    degas();
                //}
            }

        }




    }
}

