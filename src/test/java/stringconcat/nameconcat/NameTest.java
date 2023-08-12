package stringconcat.nameconcat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    Name name1;
    Name name2;

    Name name3;
    Name name4;
    Name name5;

    @BeforeEach
    void setUp() {
        name1 = new Name("Smith","C.","John",Title.MR);
        name2 = new Name("Smith",null,"John",null);

        name3 = new Name("Kovács","D.","József",Title.MR);
        name4 = new Name("Kovács",null,"József",null);
        name5 = new Name("Kovács",null,"József",Title.DR);
    }

    @Test
    void concatNameWesternStyle() {
        assertEquals("Mr. John C. Smith", name1.concatNameWesternStyle());
        assertEquals("John Smith", name2.concatNameWesternStyle());
    }

    @Test
    void concatNameHungarianStyle() {
        assertEquals("Kovács D. József", name3.concatNameHungarianStyle());
        assertEquals("Kovács József", name4.concatNameHungarianStyle());
        assertEquals("Dr. Kovács József", name5.concatNameHungarianStyle());
    }
}