package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();

        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        for (String string : figures) {
            System.out.print(string + "-");
        }

        System.out.println("\n");

        int wordsWithoutO = 0;

        for (String string : figures) {
            if (!string.contains("и")) {
                wordsWithoutO++;
            }
        }

        System.out.println("Figures without \"и\" = " + wordsWithoutO);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();

        figures.add(3, "Треугольник");

        for (String string : figures) {
            System.out.print(string + " ");
        }
    }
}
