package pretask;

public class MathOperatorsExample {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 2;

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);

        if(secondNum != 0) {
            System.out.println((double) firstNum / secondNum);
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }
}
