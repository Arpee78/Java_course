package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] intArray = numbers.getEvenNumbers(new int[]{2, 8, 5, 6, 2, 3, 9});
        assertArrayEquals(intArray, new int[]{2, 8, 0, 6, 2, 0, 0});
    }
}