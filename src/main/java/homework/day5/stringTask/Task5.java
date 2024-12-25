package homework.day5.stringTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task5 {

    public static void printNow() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("d MMMM, yyyy, H 'часов' m 'минут'", new Locale("ru"));
        String formatedData = now.format(formater);

        System.out.println(formatedData);
    }
}
