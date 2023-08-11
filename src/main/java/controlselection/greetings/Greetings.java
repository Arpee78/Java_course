package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public static final int MINUTES = 60;

    public String sayGreeting(int hour, int minute) {

        int now = hour * MINUTES + minute;

        if (now > 5 * MINUTES && now <= 9 * MINUTES) {
            return "jó reggelt";
        } else if (now > 9 * MINUTES && now <= 18 * MINUTES + 30) {
            return "jó napot";
        } else if (now > 18 * MINUTES + 30 && now <= 20 * MINUTES + 30) {
            return "jó estét";
        } else {
            return "jó éjt";
        }
    }
}
