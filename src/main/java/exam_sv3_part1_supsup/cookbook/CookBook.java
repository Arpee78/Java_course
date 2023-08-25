package exam_sv3_part1_supsup.cookbook;

import java.util.ArrayList;
import java.util.List;

public class CookBook {

    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> getRecipes() {
        return new ArrayList<>(recipes);
    }

    public boolean addRecipe(Recipe recipe) {
        Difficulty difficulty = recipe.getDifficulty();

        boolean easyOrMedium = difficulty == Difficulty.EASY || difficulty == Difficulty.MEDIUM;
        boolean fewIngredients = recipe.getIngredients().size() <= 10;

        if (easyOrMedium && fewIngredients) {
            recipes.add(recipe);
            return true;
        }
        return false;
    }

    public boolean isRecipeInCookbookWithDifficulty(Difficulty difficulty) {
        for (Recipe actual : recipes) {
            if (actual.getDifficulty() == difficulty) {
                return true;
            }
        }
        return false;
    }

    public int findNumberOfMaxIngredients() {
        int max = 0;
        for (Recipe actual : recipes) {
            int ingredientsCount = actual.getIngredients().size();
            if (ingredientsCount > max) {
                max = ingredientsCount;
            }
        }
        return max;
    }

    public int countRecipeWithIngredient(String ingredient) {
        int count = 0;
        for (Recipe actual : recipes) {
            if (actual.containsIngredient(ingredient)) {
                count++;
            }
        }
        return count;
    }
}
