package homework.day7.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySities {

    public static void main(String[] args) {

        Cities[] mySities = new Cities[]{
            new Cities("Москва", 12000000),
            new Cities("Нью-Йорк", 8400000),
            new Cities("Париж", 2200000),
        };

        List<Cities> cities = Arrays.asList(mySities);

        for (Cities city : cities) {
            System.out.print(city.getName() + " ");
        }

        System.out.println("\n");

        for (Cities city : cities) {
            System.out.print(city.getPopulation() + " ");
        }

        System.out.println("\n");

        Map<String, Cities> citiesMap = new HashMap<>();

        for (int i = 0; i < cities.size(); i++) {
            citiesMap.put(cities.get(i).getName(),cities.get(i));
        }

        int population = 0;

        for (Cities city : citiesMap.values()) {
            population += city.getPopulation();
        }

        System.out.println("Population: " + population);
    }
}
