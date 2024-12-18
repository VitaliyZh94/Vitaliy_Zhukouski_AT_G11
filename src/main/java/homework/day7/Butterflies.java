package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String string : butterflies) {
            System.out.println("\"" + string + "\"");
        }

        System.out.println();

        int oWords = 0;
        for (String string : butterflies) {
            if (string.contains("o")) {
                oWords++;
            }
        }

        System.out.println("Butterflies with \"o\" = " + oWords);
        System.out.println();

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        System.out.println("\n");

        for (String string : butterflies) {
            System.out.print(string + "\n");
        }
    }
}
