package homework.day8;

import homework.day5.playground.essence.craft.field.Moped;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7_4 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7_4.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Moped(200, "Moped"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
