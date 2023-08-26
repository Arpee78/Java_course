package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        List<String> names = new Names().readnames(Path.of("src/main/resources/namesDr.txt"));

        boolean dr = false;
        for (int i = 0; i < names.size() && !dr; i++) {
            String actual = names.get(i);
            if (actual.toLowerCase().startsWith("dr")) {
                System.out.println(actual);
                dr = true;
            }
        }

    }

    private List<String> readnames(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file.", ioe);
        } finally {
            System.out.println("End of reading.");
        }
    }
}
