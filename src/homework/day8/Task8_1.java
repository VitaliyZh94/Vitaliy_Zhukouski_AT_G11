package homework.day8;

import homework.day5.playground.essence.craft.air.Plane;

import java.io.*;

public class Task8_1 {

    public static void main(String[] args) {

        String planeToString = null;

        try (FileInputStream fis = new FileInputStream("src/homework/day8/files/task7_1.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Plane plane = (Plane) ois.readObject();
            planeToString = plane.toString();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task8_1.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(planeToString);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
