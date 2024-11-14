package homework.day5.stringTask;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void printDuplicates(String text) {
        String[] words = text.toLowerCase().replaceAll("[^a-zа-я0-9\\s]", "").split("\\s");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        printDuplicates("hello world world world hello yes no");
    }
}
