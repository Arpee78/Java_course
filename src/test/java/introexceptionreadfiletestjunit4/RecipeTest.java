package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void testAddIngredients(){
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        List<String> ingredients = recipe.getIngredients();
        assertEquals("liszt",ingredients.get(0));
        assertEquals("fahéj",ingredients.get(9));
    }

    @Test
    public void testAddIngredientsFail(){
        Recipe recipe = new Recipe();
        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> recipe.addIngredients(Path.of("src/test/resources/recipe_.txt")));
        assertEquals("Cannot read file: src\\test\\resources\\recipe_.txt",ise.getMessage());
    }

}