package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hour, int minute, int second) {
        this.hours = hour;
        this.minutes = minute;
        this.seconds = second;
    }

    public int getInMinutes() {
        return hours * 60 + minutes;
    }

    public int getInSeconds() {
        return getInMinutes() * 60 + seconds;
    }

    public boolean earlierThan(Time anotherTime){
        return this.getInSeconds() < anotherTime.getInSeconds();
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

}
