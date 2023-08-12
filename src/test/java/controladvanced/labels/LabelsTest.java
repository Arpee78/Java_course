package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void getTableOfNumbers() {
        Labels labels = new Labels();
        int[][] numbers = labels.getTableOfNumbers(10);
        assertEquals(3, numbers[0][1]);
        assertEquals(5, numbers[2][1]);
        assertEquals(10, numbers[4][4]);
    }
}