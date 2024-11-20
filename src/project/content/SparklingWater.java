package project.content;

public class SparklingWater extends Water {

    private Bubble[] bubbles;


    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        
        isOpened();
    }

    public void pump (Bubble[] bubbles) {
        //set bubbles in water?
    }

    public void setOpened() {
        isOpened = true;
        degas();
    }

    private void degas() {
        //каждую секунду выпускает по партии пузырьков из рассчета
        // 10 + 5 * температура_воды (для засыпания
        // на секунду используем Thread.sleep(1000)
    }


}

