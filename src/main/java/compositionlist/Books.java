package compositionlist;

import attributes.book.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

    private List<String> titles = new ArrayList<>();

    public List<String> getTitles() {
        return titles;
    }

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int index = titles.indexOf(title);
        if (index >= 0) {
            titles.set(index, author + ": " + title);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány könyvcímet szeretnél eltárolni? ");
        int titleCount = scanner.nextInt();
        scanner.nextLine();

        Books books = new Books();
        for (int i = 0; i < titleCount; i++) {
            System.out.print(i + 1 + ". könyv címe? ");
            String title = scanner.nextLine();
            books.addBook(title);
        }

        System.out.println(books.getTitles());
        books.findBookAndSetAuthor("Robinson Crusoe", "Daniel Defoe");
        System.out.println(books.getTitles());
    }

}
