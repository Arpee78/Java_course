package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void testModify() {
        assertEquals("AxMy", new ModifiedWord2().modify("alma"));
        assertEquals("KxRy", new ModifiedWord2().modify("körte"));
        assertEquals("SxIy", new ModifiedWord2().modify("szilva"));
    }
}