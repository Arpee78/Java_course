package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException(
                    "One or more given parameter cannot be applied! "
                            + year + ", " + month + ", " + day);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day != calculateMonthLength(year, month)) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        int monthLength = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                monthLength = 30;
                break;
            case 2:
                monthLength = isLeapYear(year) ? 29 : 28;
        }
        return monthLength;
    }

}

