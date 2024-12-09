package homework.day8;

import homework.day5.playground.essence.craft.field.Moped;

import java.io.*;

public class Task8_4 {

    public static void main(String[] args) {

        String mopedToString = null;

        try (FileInputStream fis = new FileInputStream("src/homework/day8/files/task7_4.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Moped moped = (Moped) ois.readObject();
            mopedToString = moped.toString();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream fos = new FileOutputStream("src/homework/day8/files/task8_4.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(mopedToString);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
