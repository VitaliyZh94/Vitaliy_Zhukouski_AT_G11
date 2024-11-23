package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] strings = "мама мыла раму мыла".split(" ");

        for (String string : strings) {
            myList.add(string);
        }

        for (String string : strings) {
            System.out.println(string);
        }

        for (int i = 0; i < strings.length; i++) {
            myList.get(i);
            System.out.println(myList.get(i));
        }
    }
}
