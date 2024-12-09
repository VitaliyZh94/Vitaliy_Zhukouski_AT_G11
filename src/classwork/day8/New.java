package classwork.day8;

import java.util.Scanner;

public class New {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("Hello")) {
                return;
            }
            System.out.printf("Just got '%s' text !", incoming);
        }

    }
}
