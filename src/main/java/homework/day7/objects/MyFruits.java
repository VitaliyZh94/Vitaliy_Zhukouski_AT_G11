package homework.day7.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFruits {

    public static void main(String[] args) {

        Fruits[] myFruits = new Fruits[]{
                new Fruits("Яблоко", 120),
                new Fruits("Банан", 80),
                new Fruits("Груша", 150),
                new Fruits("Апельсин", 200),
        };

        List<Fruits> fruits = Arrays.asList(myFruits);

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }

        System.out.println("\n");

        for (Fruits fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }

        System.out.println("\n");

        Map<Integer, Fruits> fruitsMap = new HashMap<>();

        for (int i = 0; i < fruits.size(); i++) {
            fruitsMap.put(i, fruits.get(i));
        }

        for (int i : fruitsMap.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        for (Fruits fruit : fruitsMap.values()) {
            System.out.println(fruit);
        }

        System.out.println();

        for (Map.Entry<Integer, Fruits> entry : fruitsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
