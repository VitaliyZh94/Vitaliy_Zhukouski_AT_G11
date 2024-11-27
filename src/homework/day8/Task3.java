package homework.day8;

import java.io.*;

public class Task3 {

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        task3.rewriteFile();
    }

    private void rewriteFile() {

        StringBuilder text = new StringBuilder();
        String line = "";

        try {

            BufferedReader in = new BufferedReader(new FileReader("src/homework/day8/files/task2.txt"));

            while ((line = in.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String newText = text.toString().replaceAll("[eyuioaEYUIOA]", "");

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("src/homework/day8/files/task2.txt"));
            out.write(newText);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
