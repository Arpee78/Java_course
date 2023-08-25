package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void run(Path path){
        List<String> lines = readBooks();
        List<Book> bookList = makeBookList(lines);
        List<String> betterBookList = makeBetterBookList(bookList);
        writeBookList(path, betterBookList);
    }

    public void writeBookList(Path path, List<String> betterBookList) {
        try {
            Files.write(path, betterBookList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    private List<String> makeBetterBookList(List<Book> bookList) {
        List<String> newBookList = new ArrayList<>();
        for (Book actual : bookList) {
            newBookList.add(actual.getAuthor() + ": " + actual.getTitle());
        }
        return newBookList;
    }

    private List<String> readBooks() {
        List<String> lines;

        try {
            lines = Files.readAllLines(Path.of("src/main/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return lines;
    }

    private List<Book> makeBookList(List<String> lines) {
        List<Book> bookList = new ArrayList<>();
        for (String actual : lines) {
            String[] lineArray = actual.split(";");
            bookList.add(new Book(lineArray[0], lineArray[1], lineArray[2]));
        }
        return bookList;
    }
}
