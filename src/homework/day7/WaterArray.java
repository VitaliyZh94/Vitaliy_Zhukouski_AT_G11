package homework.day7;

import java.util.Arrays;
import java.util.List;

public class WaterArray {

    public static void main(String[] args) {

        Water[] waterArray = new Water[] {
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        };

        List<Water> water = Arrays.asList(waterArray);

        for (Water w : water) {
            System.out.println(w.getColor() + "-вода");
        }
    }
}
