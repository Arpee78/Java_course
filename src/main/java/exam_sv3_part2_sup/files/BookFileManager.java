package exam_sv3_part2_sup.files;

import exam_sv3_part2.abstractions.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BookFileManager {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void readFromFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(" ");
            books.add(new Book(parts[0], parts[1], parts[2]));
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)){
                return b;
            }
        }
        throw new IllegalArgumentException("Cannot find book with ISBN: "+ isbn);
    }
}
