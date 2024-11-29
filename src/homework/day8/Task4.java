package homework.day8;

import java.io.*;

public class Task4 {

    public static void main(String[] args) {

        Task4 task4 = new Task4();
        task4.rewriteFile();
    }

    private void rewriteFile() {

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new FileReader("src/homework/day8/files/task2.txt"))) {
            String line = "";

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String newText = stringBuilder.toString().replaceAll("[^eyuioaEYUIOA ]", "");

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/homework/day8/files/task2.txt", true))) {
            out.write(" " + newText);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
