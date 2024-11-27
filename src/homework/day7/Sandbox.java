package homework.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {

        Sand[] sandArray = new Sand[]{
                new Sand(2, "Речной"),
                new Sand(4, "Речной"),
                new Sand(2, "Карьерный"),
                new Sand(7, "Речной")
        };

        List<Sand> sandbox = Arrays.asList(sandArray);

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }

        System.out.println("\n");

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }

        System.out.println("\n");

        Map<Integer, Sand> sandMap = new HashMap<>() {

        };

    }
}
