package homework.day7;

import java.util.*;

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


        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }

        for (int i : sandMap.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        for (Sand sand : sandMap.values()) {
            System.out.println(sand);
        }

        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
