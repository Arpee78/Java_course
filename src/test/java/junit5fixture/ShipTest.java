package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void initShip() {
        ship = new Ship("Titanic", 1911, 270);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("Olympic", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(ship.getYearOfConstruction(),1911);
        assertTrue(ship.getYearOfConstruction()==1911);
        assertFalse(ship.getYearOfConstruction()!=1911);
    }

    @Test
    void testLength() {
        assertEquals(ship.getLength(),270,0.005);
    }

    @Test
    void testNull() {
        Ship newShip = null;
        assertNull(newShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
//        Ship newShip = new Ship("Mayflower",1607,33);
        Ship newShip = ship;
        assertSame(ship,newShip);
    }

    @Test
    void testNotSameObjects() {
        Ship newShip = new Ship("Titanic", 1911, 270);
        assertNotSame(ship,newShip);
    }

}