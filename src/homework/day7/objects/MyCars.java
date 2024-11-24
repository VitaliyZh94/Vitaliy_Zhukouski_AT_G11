package homework.day7.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCars {

    public static void main(String[] args) {

        Cars[] myCars = new Cars[]{
                new Cars("Toyota", "Corolla"),
                new Cars("Ford", "Mustang"),
                new Cars("BMW", "X5"),
        };

        List<Cars> cars = Arrays.asList(myCars);

        for (Cars car : cars) {
            System.out.println(car.getBrand() + ":" + car.getModel());
        }

        System.out.println();

        Map<String, Cars> carsMap = new HashMap<>();

        for (int i = 0; i < cars.size(); i++) {
            carsMap.put(cars.get(i).getBrand(), cars.get(i));
        }

        for (String string : carsMap.keySet()) {
            System.out.println(string);
        }

        System.out.println();

        for (Cars car : carsMap.values()) {
            System.out.println(car);
        }

        System.out.println();

        for (Map.Entry<String, Cars> entry : carsMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
