package homework.day3.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {
        IntArray intArray = new IntArray();
        CycleWhile cycleWhile = new CycleWhile();
        CycleFor cycleFor = new CycleFor();

        intArray.createArray();
        intArray.printElements();
        intArray.printElementsInReversOrder();
        intArray.printMultiplElements();
        intArray.printSquareElements();
        intArray.printMinValue();
        intArray.printArrayWithChangedFirstAndLastElements();
        intArray.printElementsFromMinToMax();
        cycleWhile.printNumbers();
        cycleFor.printOddNumbers();
    }
}
