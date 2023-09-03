package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();


    @Test
    void testGetTodayReferringStudent1() {
        assertEquals("Joó Lilla", classFiveA.getTodayReferringStudent(2));
    }

    @Test
    void testGetTodayReferringStudent2() {
        assertEquals("Kiss József", classFiveA.getTodayReferringStudent("THREE"));
    }

    @Test
    void testGetTodayReferringStudent13() {
        assertEquals("Németh Dóra", classFiveA.getTodayReferringStudent(Number.FIVE));

    }
}