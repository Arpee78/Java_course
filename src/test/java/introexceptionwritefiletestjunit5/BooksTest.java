package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempDir;

    @Test
    void testWriteBetterBookList() throws IOException {
        Path testPath = tempDir.toPath().resolve("newBookList.txt");
        System.out.println(testPath);
        Books books = new Books();
        Path oldPath = Path.of("src/test/resources/books.txt");
        books.writeBetterBookList(oldPath, testPath);
        List<String> result = Files.readAllLines(testPath);
        assertEquals("Gárdonyi Géza: Egri csillagok", result.get(0));
    }

}