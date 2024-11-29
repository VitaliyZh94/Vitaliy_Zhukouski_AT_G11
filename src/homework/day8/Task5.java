package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        task5.printSymbolsAmount();
    }

    private void printSymbolsAmount() {

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("src/homework/day8/files/task2.txt"))) {
            String line = null;

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String newString = stringBuilder.toString();
        System.out.println(newString.length());
    }
}
