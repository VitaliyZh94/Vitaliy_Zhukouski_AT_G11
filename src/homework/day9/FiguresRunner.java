package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class FiguresRunner {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();

        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        figures.stream().filter(x -> x.length() > 4).map(x -> x.replaceAll(x, "" + x.length())).forEach(System.out::println);
    }
}
