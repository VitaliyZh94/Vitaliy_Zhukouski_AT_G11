package homework.day4;

public class ArrayAndConsole {

    public void countSum(int[] ints, int num) {

        int sum = 0;

        for (int i : ints) {
            if (i % num == 0) {
                sum += i;
            }
        }

//        System.out.println(sum);
    }

    public int[] newArrow(int[] ints, int num) {

        int newArrowLength = 0;

        for (int i : ints) {
            if (i > num) {
                newArrowLength++;
            }
        }

        int[] newArrow = new int[newArrowLength];
        int iterator = newArrowLength - 1;

        for (int i : ints) {
            if (i > num) {
                newArrow[iterator--] = i;
            }
        }

//        for (int i : newArrow) {
//            System.out.println(i);
//        }

        return newArrow;

    }

    public int sum(int[] ints) {

        int sum = 0;
        int intsLenght = ints.length;
        int firstLengthsNum = 0;

        while (intsLenght >= 10) {
            intsLenght /= 10;
        }

        firstLengthsNum = intsLenght;

        for (int i : ints) {
            if (i % firstLengthsNum == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        return sum;
    }

    public void printPicture() {
        System.out.println("^__^");
        System.out.println("        (oo)\\\\_______");
        System.out.println("        (__)\\ ) \\/\\  \\");
        System.out.println("  ||----w |\\");
        System.out.println("  ||     ||");
    }

    //public static void main(String[] args) {
        //ArrayAndConsole arrayAndConsole = new ArrayAndConsole();
        //arrayAndConsole.countSum(new int[] {1,2,3,4,5,6}, 2);
        //arrayAndConsole.newArrow(new int[] {1,2,3,4,5,6}, 2);
        //arrayAndConsole.sum(new int[] {1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4});
        //arrayAndConsole.printPicture();
    //}
}
