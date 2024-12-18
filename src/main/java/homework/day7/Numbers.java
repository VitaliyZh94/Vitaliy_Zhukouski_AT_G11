package homework.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        Integer[] ints = new Integer[]{3342, 34, 79, 23426, 68, 1324, 55, 7699};

        List<Integer> numbers = Arrays.asList(ints);

        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println();

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        System.out.println();

        Collections.sort(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        Collections.reverse(numbers);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
