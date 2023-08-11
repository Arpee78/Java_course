package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    private List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour actual : hoursOfDay) {
            int hourNum = actual.getHourNumber();
            if (hourNum >= 6 && hourNum <= 22) {
                actual.setPeriod(DayPeriod.DAYTIME);
            } else {
                actual.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

}
