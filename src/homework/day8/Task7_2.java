package homework.day8;

import homework.day5.playground.essence.craft.air.Rocket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7_2 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7_2.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new Rocket(800, "Rocket"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
