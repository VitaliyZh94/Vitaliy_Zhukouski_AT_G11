package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String string : cities) {
            System.out.println(string);
        }

        System.out.println();

        int sumChars = 0;

        for (String string : cities) {
            sumChars += string.length();
        }

        System.out.println(sumChars);
        System.out.println();

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
