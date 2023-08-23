package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StudentTest {

    @Test()
    public void addNoteTest(){
        Student student = new Student();
        student.addNote(4);
    }


    @Test(expected = IllegalArgumentException.class)
    public void addNoteTestFail1(){
        new Student().addNote(7);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void addNoteTestFail2(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        new Student().addNote(7);
    }

    @Test
    public void addNoteTestFail3(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new Student().addNote(-2));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }

}