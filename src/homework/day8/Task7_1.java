package homework.day8;

import homework.day5.playground.essence.craft.air.Plane;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7_1 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7_1.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Plane(500, "Plane"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
