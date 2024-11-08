import java.util.Random;

public class SecondLesson {
    static int sum;

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i : array) {
            System.out.println("value is : " + i);
            sum += i;
        }

        int averageNum = sum / array.length;

        System.out.println("Average value is : " + averageNum);
    }
}
