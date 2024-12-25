package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class ThreadRunner2 {

    public static void main(String[] args) {

        List<Mouse> mouseList = new ArrayList<>();

        for (int i = 0; i < 18; i++) {
            mouseList.add(new Mouse(i));
        }

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                for (int j = 0; j < mouseList.size(); j++) {
                    if (j % 2 == 0) {
                        mouseList.get(j).peep();
                    }
                }
            }).start();
        }
    }
}
