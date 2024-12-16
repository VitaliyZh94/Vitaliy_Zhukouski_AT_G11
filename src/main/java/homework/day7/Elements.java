package homework.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String string : elements) {
            System.out.print(string + " ");
        }

        System.out.println("\n");

        int moreThenOneWord = 0;
        String regex = "[\\-\\s]";

        for (String string : elements) {
            boolean isMoreThanOneWord = Pattern.compile(regex).matcher(string).find();

            if (isMoreThanOneWord) {
                moreThenOneWord++;
            }
        }

        System.out.println("More than one word: " + moreThenOneWord);
        System.out.println();

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println("\n");

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String string : elements) {
            System.out.print(string + " ");
        }
    }
}
