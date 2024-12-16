package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String string : countries) {
            System.out.print(string + ", ");
        }

        System.out.println("\n");

        int smallNameCountries = 0;

        for (String string : countries) {
            if (string.length() < 7) {
                smallNameCountries++;
            }
        }

        System.out.println("Small name countries: " + smallNameCountries);
        System.out.println();

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }


    }
}
