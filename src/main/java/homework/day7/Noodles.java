package homework.day7;

import java.util.Arrays;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        String[] strings = new String[]{"Hakka", "Ramen", "Hibachi", "Schezwan"};

        List<String> noodles = Arrays.asList(strings);

        for (String string : noodles) {
            System.out.print(string + "-");
        }

        System.out.println("\n");


        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replaceAll("a", "o"));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }


}
