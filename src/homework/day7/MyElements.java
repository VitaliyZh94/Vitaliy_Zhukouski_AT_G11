package homework.day7;

import java.util.HashMap;
import java.util.Map;

public class MyElements {

    public static void main(String[] args) {

        Map<Integer, String> elements = new HashMap<>();

        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        for (String string : elements.values()) {
            System.out.print(string + " ");
        }

        System.out.println("\n");

        int uContainElements = 0;

        for (String string : elements.values()) {
            if (string.contains("u")) {
                uContainElements ++;
            }
        }

        System.out.println();

        System.out.println("Amoumt = " + uContainElements);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        elements.put(4, "Selenium");
        elements.remove(2);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
