package stringbasic.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    void setUp() {
        Person person = new Person("Nagy József", "jozsef@gmail.com","123456","123-456-789","36456789");
        student = new Student(person,"5432", "767644");
    }

    @Test
    void testCreate(){
        assertEquals("5432",student.getNeptuneCode());
        assertEquals("767644",student.getEducationID());
        assertEquals("36456789",student.getPerson().getPhoneNumber());
        assertEquals("123-456-789",student.getPerson().getAccountNumber());
        assertEquals("123456",student.getPerson().getSsn());
        assertEquals("jozsef@gmail.com",student.getPerson().getEmail());
        assertEquals("Nagy József",student.getPerson().getName());
    }

    @Test
    void setAccessCardNumber() {
        assertEquals(null, student.getAccessCardNumber());
        student.setAccessCardNumber("XYT-3547");
        assertEquals("XYT-3547", student.getAccessCardNumber());
    }
}