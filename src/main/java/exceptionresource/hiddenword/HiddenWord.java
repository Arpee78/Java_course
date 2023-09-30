package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                sb.append(getLetter(scanner.nextLine()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

        return sb.toString();
    }

    private char getLetter(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)){
                return c;
            }
        }
        return ' ';
    }
}
