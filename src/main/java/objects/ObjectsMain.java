package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook = null;
        System.out.println(emptyBook);
        if (emptyBook==null){
            System.out.println("Emptybook is null");
        }
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book==anotherBook ? "Ugyanaz" : "Nem ugyanaz");
        anotherBook = book;
        System.out.println(book==anotherBook ? "Ugyanaz" : "Nem ugyanaz");

        Book[] books1 = {new Book(), new Book(), new Book()};
        List<Book> books2 = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> books3 = new ArrayList<>();
        books3.add(new Book());
        books3.add(new Book());
        books3.add(new Book());

        System.out.println(Arrays.toString(books1));
        System.out.println(books2);
        System.out.println(books3);



    }

}
