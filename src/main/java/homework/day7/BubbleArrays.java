package homework.day7;

import java.util.Arrays;
import java.util.List;

public class BubbleArrays {

    public static void main(String[] args) {

        Bubble[] bubblesArray = new Bubble[] {
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")};

        List<Bubble> bubbles = Arrays.asList(bubblesArray);

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }

        System.out.println("\n");

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }

        System.out.println("\n");

        int volume = 0;

        for (Bubble bubble : bubbles) {
            volume += bubble.getVolume();
        }

        System.out.println("Volume = " + volume);
        System.out.println();

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
