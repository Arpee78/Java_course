package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void findDayOfWeek() {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        assertEquals("hét eleje", dayOfWeeks.findDayOfWeek("Hétfő"));
        assertEquals("hét közepe", dayOfWeeks.findDayOfWeek("kedd"));
        assertEquals("hét közepe", dayOfWeeks.findDayOfWeek("Szerda"));
        assertEquals("hét közepe", dayOfWeeks.findDayOfWeek("csütörtök"));
        assertEquals("majdnem hétvége", dayOfWeeks.findDayOfWeek("péntek"));
        assertEquals("hétvége", dayOfWeeks.findDayOfWeek("szombat"));
        assertEquals("hétvége", dayOfWeeks.findDayOfWeek("vasárnap"));
    }
}