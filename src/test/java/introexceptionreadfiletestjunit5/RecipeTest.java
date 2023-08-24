package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    public void testAddIngredients() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        List<String> ingredients = recipe.getIngredients();
        List<String> expected = Arrays.asList("liszt", "margarin", "kristálycukor",
                "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj");
        assertEquals(expected, ingredients);
    }

    @Test
    public void testAddIngredientsFail() {
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> new Recipe().addIngredients(Path.of("src/test/resources/recipe_.txt")));
        assertEquals("Cannot read file: src\\test\\resources\\recipe_.txt", ise.getMessage());
    }

}