package homework.day5.stringTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void printNumbers(String text) {

        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        printNumbers("ASD dsad 2 asd as443 sadad2 2131");
    }
}
