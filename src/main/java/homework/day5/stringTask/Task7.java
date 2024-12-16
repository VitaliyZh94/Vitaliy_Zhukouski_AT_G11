package homework.day5.stringTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    public static void printDate(String text) {

        int amountVowels = 0;
        LocalDateTime now = LocalDateTime.now();

        text.toLowerCase();

        String regex = "[aeiouy]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            amountVowels++;
        }

        LocalDateTime newTime = now.plusDays(amountVowels);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");
        String time = newTime.format(formatter);

        System.out.printf("Сгенерированная гласная дата: %s", time);
    }
}
