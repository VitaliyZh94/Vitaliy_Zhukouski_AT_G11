package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String string : cars) {
            System.out.println("\"" + string + "\"");
        }

        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i--);
            }
        }

        for (String string : cars) {
            System.out.println(string);
        }

    }
}
