package homework.day9;

import homework.day7.Sand;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        Map<Integer, String> sandMap = sandbox.stream().filter(x -> x.getName().contains("ч") && x.getWeight() > 9)
                .sorted((a, b) -> a.getWeight() - b.getWeight())
                .map(x ->
                {
                    x.setWeight(x.getWeight() * 2);
                    x.setName(x.getName().toUpperCase(Locale.ROOT));
                    return x;
                })
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : sandMap.entrySet()) {
            result.append(entry.getValue()).append(" ").append(entry.getKey()).append("\n");
        }

        try (BufferedWriter of = new BufferedWriter(new FileWriter("src/homework/day9/files/sand.txt"))) {
            of.write(String.valueOf(result));
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
