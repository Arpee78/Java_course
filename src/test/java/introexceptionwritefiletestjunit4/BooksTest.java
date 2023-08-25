package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class BooksTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteBookList() throws IOException {
        Books books = new Books();
        Path path = temporaryFolder.newFile("betterBooks.txt").toPath();
        books.run(path);
    }

}