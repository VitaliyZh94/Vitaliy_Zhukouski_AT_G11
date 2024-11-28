package homework.day8;

import homework.day5.playground.essence.craft.air.Copter;

import java.io.*;

public class Task8 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/homework/day8/files/task7.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Copter copter = (Copter)ois.readObject();
            ois.close();

            String string = copter.toString();

            FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task7.2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(string);
            oos.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
