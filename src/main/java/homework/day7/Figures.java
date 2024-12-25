package homework.day7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

        try (FileOutputStream fos = new FileOutputStream("./src/homework/day7/files/t.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeBytes(SerializeText(figures));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

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

    private static String SerializeText(List<String> figures) {

        String newString = "";

        for (String string : figures) {
            newString += string + "-";
        }

        return newString;
    }
}
