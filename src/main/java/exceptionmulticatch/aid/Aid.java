package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        return processLines(path);
    }

    private List<String> processLines(Path path) {
        List<String> result = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s : lines) {
                String[] parts = s.split(":");
                result.add(parts[0] + ": " + amount / Integer.parseInt(parts[1].strip()));
            }
        } catch (IOException | NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }

        return result;
    }

}
