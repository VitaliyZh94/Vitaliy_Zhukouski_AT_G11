package homework.day8;

import homework.day5.playground.essence.craft.air.Copter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Copter(400, "C"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
