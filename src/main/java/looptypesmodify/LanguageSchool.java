package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("John"));
        students.add(new Student("Jane"));
        students.add(new Student("Jack"));
        students.add(new Student("Jim"));
        students.add(new Student("Joana"));

        System.out.println("Tanulók létszáma: " + students.size());

        students.get(1).setActive(false);
        students.get(4).setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student s: students) {
            if (!s.isActive()){
                studentsToRemove.add(s);
            }
        }
        students.removeAll(studentsToRemove);

        System.out.println("Tanulók létszáma: " + students.size());
    }
}
