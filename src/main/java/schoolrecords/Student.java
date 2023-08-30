package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrading(Mark mark) {
        if (mark == null) {
            throw new IllegalArgumentException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateSubjectAverage(String subjectName) {
        int sum = 0;
        int count = 0;
        for (Mark mark : marks) {
            if (mark.getSubjectName().equals(subjectName)) {
                sum += mark.getMarkValue();
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return Math.round(sum * 100.0 / count) / 100.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks: ");

        for (Mark mark : marks) {
            sb.append(mark.toString());
            if (mark != marks.get(marks.size() - 1)) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    //"Kovács Sándor marks: matematika - excellent(5), matematika - excellent(5)"
}
