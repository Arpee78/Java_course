package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    Day day;

    @BeforeEach
    void initDay(){
        day = new Day();
        day.addHour(new Hour(13));
        day.addHour(new Hour(18));
        day.addHour(new Hour(23));
    }

    @Test
    void addHour() {
        int hours = day.getHoursOfDay().size();
        assertEquals(3, hours);
    }

    @Test
    void setDayPeriod() {
        day.setDayPeriod();
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(2).getPeriod());
    }
}