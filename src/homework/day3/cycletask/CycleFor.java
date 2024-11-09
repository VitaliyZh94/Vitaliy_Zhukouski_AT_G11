package cycletask;

public class CycleFor {
    public void PrintOddNumbers() {
        for (int i = 3; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
