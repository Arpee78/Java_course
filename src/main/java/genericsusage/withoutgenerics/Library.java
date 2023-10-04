package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List books = new ArrayList();

    public Book getFirstBook(List books) {

        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }

        Object obj = books.get(0);
        if (obj instanceof Book){
            return (Book) obj;
        }
        throw new ClassCastException("Not a book");
    }
}
