package homework.day9;

import homework.day7.Sand;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Stream;

public class SandRunner {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        Stream<Sand> sandStream = sandbox.stream().filter(x -> (x.getWeight() > 9 && x.getName().contains("ч"))).sorted(Comparator.comparing(Sand::getWeight));

        sandStream.map(x -> {
            x.setWeight(x.getWeight() * 2);
            x.setName(x.getName().toUpperCase(Locale.ROOT));
            return x;
        });

        Map<Integer, String> sandMap = new HashMap<>();

        for (int i = 0; i < sandStream.count(); i++) {

        }
    }
}
