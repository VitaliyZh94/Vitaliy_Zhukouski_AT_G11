package homework.day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task6 {

    public static void main(String[] args) {

        Task6 task6 = new Task6();
        task6.writeToNewFile();
    }

    private void writeToNewFile() {

        try {

            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            BufferedReader in = new BufferedReader(new FileReader("src/homework/day8/files/task2.txt"));

            while ((line = in.readLine()) != null) {
                stringBuilder.append(line);
            }

            int charsAmount = stringBuilder.toString().length();

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M");
            String formatedData = formatter.format(now);

            DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("H.m");
            String formatedTime = formatterTime.format(now);

            String fileName = String.format("src/homework/day8/files/%s_%s_%d.txt", formatedData, formatedTime, charsAmount);
            File file = new File(fileName);
            file.createNewFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
