package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public void addIngredients(Path path) {
        List<String> lines = readRecipe(path);

        for (int i = 2; i < lines.size(); i++) {
            ingredients.add(lines.get(i).split(" ")[2]);
        }
    }

    private List<String> readRecipe(Path path) {
        List<String> lines;

        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + ioe.getMessage(), ioe);
        }

        return lines;
    }

}
