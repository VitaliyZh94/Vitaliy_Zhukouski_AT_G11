package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList2 {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinledList = new LinkedList<>();

        int iterations = 100000;

        for (int i = 0; i < iterations; i++) {
            myArrayList.add("" + i);
            myLinledList.add("" + i);
        }

        long t0 = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            myArrayList.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            myLinledList.get(i);
        }

        System.out.println(System.currentTimeMillis() - t0);
    }
}
