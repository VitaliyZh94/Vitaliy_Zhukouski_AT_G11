package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Task2 implements Serializable {

    public static void main(String[] args) {

        Task2 task2 = new Task2();
        task2.writePhrase();
    }

    private void writePhrase() {

        String incoming = "";

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            incoming = scanner.nextLine();
            break;
        }

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/homework/day8/files/task2.txt"))) {

            out.write("Hello I just got '" + incoming + "' from you!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
