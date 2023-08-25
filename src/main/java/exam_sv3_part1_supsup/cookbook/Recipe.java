package exam_sv3_part1_supsup.cookbook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String name;
    private Difficulty difficulty;
    private List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String name, Difficulty difficulty, List<String> ingredients, String description) {
        this.name = name;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public String getDescription() {
        return description;
    }

    public boolean containsIngredient(String ingredient){
        for (String actual: ingredients          ) {
            if (actual.equals(ingredient)){
                return true;
            }
        }
        return false;
    }
}
