package homework.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();

        birds.add("Чайка");
        birds.add("Дрозд");
        birds.add("Бусел");
        birds.add("Голубь");
        birds.add("Воробей");
        birds.add("Цапля");

        for (String string : birds) {
            System.out.println("--" + string + "--");
        }

        System.out.println();

        int birdCount = 0;
        String regex = "[аоеуэыяиюАОЕУЭЫЯИЮ]";

        for (String string : birds) {
            long vowelAmount = Pattern.compile(regex).matcher(string).results().count();
            if (vowelAmount > 1) {
                birdCount++;
            }
        }

        System.out.println("Birds with more than one vowel: " + birdCount);
        System.out.println();

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println("\n");

        birds.set(3, "Синица");

        for (String string : birds) {
            System.out.print(string + " ");
        }
    }
}
