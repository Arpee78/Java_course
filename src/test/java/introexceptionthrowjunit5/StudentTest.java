package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void addNote() {
        student.addNote(4);
        assertEquals(4, student.getNotes().get(0));
    }

    @Test
    void addNoteFail() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(7));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}