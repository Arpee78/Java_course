package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void findDaysOfMonths() {
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(28, dayInMonth.findDaysOfMonths(1900,"február"));
        assertEquals(29, dayInMonth.findDaysOfMonths(2000,"február"));
        assertEquals(29, dayInMonth.findDaysOfMonths(2024,"február"));
        assertEquals(28, dayInMonth.findDaysOfMonths(2023,"február"));
        assertEquals(31, dayInMonth.findDaysOfMonths(2023,"július"));
        assertEquals(30, dayInMonth.findDaysOfMonths(2023,"június"));
        assertEquals(0, dayInMonth.findDaysOfMonths(2023,"aaa"));
    }
}