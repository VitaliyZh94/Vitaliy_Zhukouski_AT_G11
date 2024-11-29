package homework.day8;

import homework.day5.playground.essence.craft.field.Car;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7_3 {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7_3.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new Car(2000, "Reno"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
