package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
        List<String> fruits = readFruits(path);

        for (String actual : fruits) {
            if (actual.charAt(0) == 'A') {
                return actual;
            }
        }
        return "A";
    }

    private List<String> readFruits(Path path) {
        List<String> fruits;

        try {
            fruits = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read File", ioe);
        }

        return fruits;
    }
}
