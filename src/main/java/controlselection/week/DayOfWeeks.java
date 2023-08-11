package controlselection.week;

public class DayOfWeeks {

    public String findDayOfWeek(String day) {
        day = day.toLowerCase();
        String typeOfDay;
        switch (day) {
            case "hétfő":
                typeOfDay = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                typeOfDay = "hét közepe";
                break;
            case "péntek":
                typeOfDay = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                typeOfDay = "hétvége";
                break;
            default:  typeOfDay = "ismeretlen nap";
        }
        return typeOfDay;
    }

}
