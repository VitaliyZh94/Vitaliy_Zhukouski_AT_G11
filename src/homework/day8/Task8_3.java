package homework.day8;

import homework.day5.playground.essence.craft.field.Car;

import java.io.*;

public class Task8_3 {

    public static void main(String[] args) {

        String carToString = null;

        try (FileInputStream fis = new FileInputStream("src/homework/day8/files/task7_3.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Car car = (Car) ois.readObject();
            carToString = car.toString();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task8_3.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(carToString);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
