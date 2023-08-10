package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 170);
        String name = dragon.getName();
        assertEquals("Süsü", name);
        assertNotEquals("Hétfejű", name);
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 170);
        int heads = dragon.getNumberOfHeads();
        assertEquals(1, heads);
        assertTrue(heads == 1);
        assertFalse(heads != 1);
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1, 170);
        double height = dragon.getHeight();
        assertEquals(170,height,0.005);
    }

    @Test
    void testNull(){
        Dragon dragon1 = new Dragon("Süsü", 1, 170);
        Dragon dragon2 = null;
        assertNull(dragon2);
        assertNotNull(dragon1);
    }

    @Test
    void testSameObjects(){
        Dragon dragon1 = new Dragon("Süsü", 1, 170);
        Dragon dragon2 = dragon1;
        assertSame(dragon1, dragon2);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon1 = new Dragon("Süsü", 1, 170);
        Dragon dragon2 = new Dragon("Süsü", 1, 170);
        assertNotSame(dragon1, dragon2);
    }


}
