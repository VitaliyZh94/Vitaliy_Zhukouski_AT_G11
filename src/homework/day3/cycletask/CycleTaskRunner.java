package homework.day3.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        IntArray intArray = new IntArray();
        CycleWhile cycleWhile = new CycleWhile();
        CycleFor cycleFor = new CycleFor();

        intArray.CreateArray();
        intArray.PrintElements();
        System.out.println();
        intArray.PrintElementsInReversOrder();
        System.out.println();
        intArray.PrintMultiplElements();
        System.out.println();
        intArray.PrintSquareElements();
        System.out.println();
        intArray.PrintMinValue();
        System.out.println();
        intArray.PrintArrayWithChangedFirstAndLastElements();
        System.out.println();
        intArray.PrintElementsFromMinToMax();
        System.out.println("\n");

        cycleWhile.PrintNumbers();
        System.out.println("\n");

        cycleFor.PrintOddNumbers();
    }
}
