package homework.day7.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    public static void main(String[] args) {

        Book[] myBooks = new Book[]{
                new Book("Война и мир", "Толстой"),
                new Book("Преступление и наказание", "Достоевский"),
                new Book("Мастер и Маргарита", "Булгаков"),
        };

        List<Book> books = Arrays.asList(myBooks);

        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }

        System.out.println("\n");

        Map<String, String> bookMap = new HashMap<>();

        for (int i = 0; i < books.size(); i++) {
            bookMap.put(books.get(i).getName(), books.get(i).getAutor());
        }

        for (String string : bookMap.keySet()) {
            System.out.println(string);
        }

        System.out.println();

        for (String string : bookMap.values()) {
            System.out.println(string);
        }

        System.out.println();

        for (Map.Entry<String, String> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
