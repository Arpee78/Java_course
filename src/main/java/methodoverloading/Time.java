package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private int sumOfTime(int hours, int minutes, int seconds) {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    private int sumOfThis() {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    public boolean isEqual(Time time) {
        int sumOfTime = sumOfTime(time.getHours(), time.getMinutes(), time.getSeconds());
        return sumOfTime == sumOfThis();
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        int sumOfTime = sumOfTime(hours, minutes, seconds);
        return sumOfTime == sumOfThis();
    }

    public boolean isEarlier(Time time) {
        int sumOfTime = sumOfTime(time.getHours(), time.getMinutes(), time.getSeconds());
        return sumOfTime > sumOfThis();    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        int sumOfTime = sumOfTime(hours, minutes, seconds);
        return sumOfTime > sumOfThis();    }


}
