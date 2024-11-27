package homework.day8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

            Task1 task1 = new Task1();
            task1.printPhrase();
    }

    private void printPhrase() {

        String incoming = "";

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            incoming = scanner.nextLine();
            break;
        }
        System.out.printf("Hello, I just got %s form you!", incoming);
    }
}
