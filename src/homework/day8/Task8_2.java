package homework.day8;

import homework.day5.playground.essence.craft.air.Rocket;

import java.io.*;

public class Task8_2 {

    public static void main(String[] args) {

        String rocketTOString = null;

        try (FileInputStream fis = new FileInputStream("src/homework/day8/files/task7_2.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Rocket rocket = (Rocket) ois.readObject();
            rocketTOString = rocket.toString();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task8_2.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(rocketTOString);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
