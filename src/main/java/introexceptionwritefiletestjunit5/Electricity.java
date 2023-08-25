package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public void run(Path path ,String[] streets){
        List<String> lines = makeList(streets);
        writeLines(path, lines);
    }

    public List<String> makeList(String[] streets) {
        List<String> lines = new ArrayList<>();

        for (String actual : streets) {
            lines.add(LocalDate.now() + ": " + actual + " utca");
        }
        return lines;
    }

    private void writeLines(Path path, List<String> lines){
        try {
            Files.write(path, lines);
        } catch (IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
