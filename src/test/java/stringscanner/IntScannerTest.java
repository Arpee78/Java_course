package stringscanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntScannerTest {

    @Test
    void convertInts() {
        IntScanner intScanner = new IntScanner();
        String str = intScanner.convertInts("5;3;107;12;123;18;198");
        assertEquals("107,123,198", str);
    }
}