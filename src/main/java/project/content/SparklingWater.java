package project.content;

import java.time.LocalTime;

public class SparklingWater extends Water {

    private boolean isOpened = false;
    private Bubble[] bubbles;



    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;

    }



    private void degas() {

        int sleepIterator = 0;

        for (int i = 0; i < bubbles.length; i++) {

            if (i == sleepIterator) {
                sleepIterator = i + 10 + 5 * getTemperature();

                System.out.println("\n");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван");
                }
            }

            bubbles[i].cramp();

        }

        System.out.printf("Released %d bubbles per second\n", 10 + 5 * getTemperature());
    }

    public void setOpened() {
        isOpened = true;

        System.out.println("Let out bubbles");
        degas();

    }

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);

        isOpened();
    }



}

