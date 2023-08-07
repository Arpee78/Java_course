package introconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour(
                "Balaton 200",
                LocalDate.of(2023,8,24));

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getStartTime());

        System.out.println();

        cyclingTour.registerPerson(3);
        cyclingTour.ride(300);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getStartTime());

    }
}
