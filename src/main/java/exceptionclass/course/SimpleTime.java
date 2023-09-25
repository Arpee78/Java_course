package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        this(hour);
        validateMinute(minute);
        this.minute = minute;
    }

    public SimpleTime(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public SimpleTime(String time) {
        this.hour = getHourFromString(time);
        this.minute = getMinuteFromString(time);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private int getHourFromString(String time) {
        validateTimeString(time);
        int hour = Integer.parseInt(time.split(":")[0]);
        validateHour(hour);
        return hour;
    }

    private int getMinuteFromString(String time) {
        validateTimeString(time);
        if (time.contains(":")) {
            int minute = Integer.parseInt(time.split(":")[1]);
            validateMinute(minute);
            return minute;
        }
        return 0;
    }

    private void validateTimeString(String time) {
        if (time == null) {
            throw new InvalidTimeException("Time is null");
        }
        String[] parts = time.split(":");
        if (parts.length != 2) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        try {
            Integer.parseInt(parts[0]);
            Integer.parseInt(parts[1]);
        } catch (NumberFormatException nfe) {
            throw new InvalidTimeException("Time is not hh:mm");
        }

    }

    private void validateHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute);
    }
}
