package introdate;

import java.time.LocalDateTime;

public class University {

    public static void main(String[] args) {
        Exam exam1 = new Exam("mathematics", LocalDateTime.of(2023, 6, 6, 10, 0));
        Exam exam2 = new Exam("chemistry", LocalDateTime.of(2023, 7, 7, 9, 0));

        LocalDateTime exam1Date =  exam1.getExamDate();

        System.out.println("Subject: " + exam1.getSubject());
        System.out.println("Year: " + exam1Date.getYear());
        System.out.println("Month: " + exam1Date.getMonth());
        System.out.println("Day: " + exam1Date.getDayOfMonth());
        System.out.println("Hour: " + exam1Date.getHour());
        System.out.println("Minute: " + exam1Date.getMinute());

        System.out.println("Az első vizsga " + (exam1Date.isBefore(exam2.getExamDate()) ? "után" : "előtt") + " van a második.");

        System.out.println(exam1.getMessage());
        System.out.println(exam2.getMessage());
    }
}
