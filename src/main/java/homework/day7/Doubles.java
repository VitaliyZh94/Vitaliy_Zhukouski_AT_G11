package homework.day7;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        Double[] numbers = new Double[]{33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};

        List<Double> doubles = Arrays.asList(numbers);

        for (double d : doubles) {
            System.out.print(d + " ");
        }

        System.out.println("\n");

        double multipl = 1;

        for (double d : doubles) {
            multipl *= d;
        }

        System.out.println("Result = " + multipl);
        System.out.println();


        double sum = 0;

        for (double d : doubles) {
            sum += d - (int) d;
        }

        System.out.println("Sum = " + sum);
        System.out.println();

        for (double d : doubles) {
            System.out.print((int) d + " ");
        }
    }
}
