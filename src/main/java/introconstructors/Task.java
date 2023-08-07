package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private LocalTime duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("Bevásárlás", "Heti bevásárlás a szupermarketben");
        task.setDuration(LocalTime.of(0,30));
        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        task.start();
        System.out.println(task.getStartDateTime());
        System.out.println(task.getDuration());
    }

}
