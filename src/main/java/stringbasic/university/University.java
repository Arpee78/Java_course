package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        boolean sameNeptuneCode = student.getNeptuneCode().equals(anotherStudent.getNeptuneCode());
        boolean sameEducationID = student.getEducationID().equals(anotherStudent.getEducationID());
        if (sameNeptuneCode && sameEducationID) {
            return true;
        }
        return false;
    }
}
