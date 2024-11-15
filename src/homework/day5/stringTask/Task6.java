package homework.day5.stringTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task6 {

    public static void printNewDateFormat(String text) {

        DateTimeFormatter oldFormat = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);

        try {
            LocalDateTime dateTime = LocalDateTime.parse(text, oldFormat);
            String newTime = dateTime.format(newFormat);

            System.out.println(newTime);
        }
        catch (Exception e) {
            System.out.println("Uncorrect format");
        }
    }
}
