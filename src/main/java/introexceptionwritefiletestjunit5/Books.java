package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void writeBetterBookList(Path pathOld, Path pathNew){
        List<String> oldList = readBooks(pathOld);
        List<String> newList = makeBetterList(oldList);
        writeList(pathNew, newList);
    }


    private List<String> readBooks(Path path) {
        List<String> lines;

        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }

        return lines;
    }

    private List<String> makeBetterList(List<String> lines) {
        List<String> newLines = new ArrayList<>();

        for (String actual : lines) {
            String[] linesArray = actual.split(";");
            newLines.add(linesArray[2] + ": " + linesArray[1]);
        }

        return newLines;
    }

    private void writeList(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
