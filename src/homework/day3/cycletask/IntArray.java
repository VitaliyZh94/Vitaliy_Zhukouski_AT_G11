package homework.day3.cycletask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IntArray {
    int[] ints = new int[7];

    public void CreateArray() {
        Random random = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(5);
        }
    }

    public void PrintElements() {
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public void PrintElementsInReversOrder() {
        Integer[] newArray = Arrays.stream(ints).boxed().toArray(Integer[]::new);

        Arrays.sort(newArray, Collections.reverseOrder());

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public void PrintMultiplElements() {
        for (int i : ints) {
            System.out.print(i * 5 + " ");
        }
    }

    public void PrintSquareElements() {
        for (int i : ints) {
            System.out.print(i * i + " ");
        }
    }

    public void PrintMinValue() {
        int minValue = Arrays.stream(ints).min().orElseThrow();
        System.out.print(minValue + " ");
    }

    public void PrintArrayWithChangedFirstAndLastElements() {
        int firstElement = ints[0];
        int lastElement = ints[ints.length - 1];

        int[] newArray = ints;
        newArray[0] = lastElement;
        newArray[newArray.length - 1] = firstElement;

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public void PrintElementsFromMinToMax() {
        int[] newArray = ints;

        Arrays.sort(newArray);

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
