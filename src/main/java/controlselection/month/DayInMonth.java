package controlselection.month;

public class DayInMonth {

    public int findDaysOfMonths(int year, String month) {
        month = month.toLowerCase();
        int days;
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        switch (month) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                days = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                days = 30;
                break;
            case "február":
                days = leapYear ? 29 : 28;
                break;
            default: days=0;
        }
        return days;
    }
}
