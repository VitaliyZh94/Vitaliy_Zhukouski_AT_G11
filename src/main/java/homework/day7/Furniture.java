package homework.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Furniture {

    public static void main(String[] args) {

        Chair[] chairs = new Chair[]{
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4),
        };

        List<Chair> furniture = Arrays.asList(chairs);

        for (Chair chair : chairs) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }

        System.out.println("\n");

        Map<Integer, Chair> chairMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }

        for (int i : chairMap.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }

        System.out.println();

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
